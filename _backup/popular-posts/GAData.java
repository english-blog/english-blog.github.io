import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class GAData {

	public static String INPUT_GA_FILE_NAME = "smileprem.tsv";
	public static String INPUT_TEMPLATE_FILE_NAME = "template.txt";
	public static String OUTPUT_MARKDOWN_FILE_NAME = "best-of.md";

	public static String[] UNWANTED_URLS = { "Page", "/archive/", "/about/", "/best-of/", "/books/", "/20", "/search", "/page", "/catego", "/contact/", "/subscribe", "/cgi-bin", "/www" };

	public static String[] UNWANTED_PAGES = { "404" };

	public static int MAX_PAGES = 30;

	public static void main(String[] args) {

		String pageName, pageURL = "";
		HashMap<String, String> bestPages = new LinkedHashMap<String, String>(30);

		// Parsing the input Google Analytics TSV File and putting the values in
		// HashMap (for removing duplicates)
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(INPUT_GA_FILE_NAME)))) {
			String temp = null;
			while ((temp = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(temp, "\t");
				if (tokenizer.countTokens() > 2) {
					pageName = tokenizer.nextToken().replace("\"", "");
					pageURL = sanitizeURL(tokenizer.nextToken());
					if (isRequiredURL(pageURL) && isRequiredPage(pageName) && !bestPages.containsValue(pageURL)) {
						bestPages.put(pageName, pageURL);
					}

				}

			}
		} catch (IOException e) {
			System.out.println("IOException " + e.toString());
		}

		// Creating the HTML content from HashMap
		StringBuffer bestPagesHtml = new StringBuffer();
		int count = 1;
		for (Map.Entry entry : bestPages.entrySet()) {
			bestPagesHtml.append("<p><span>" + (new Integer(count++)) + "</span> &raquo; <a href=\"" + entry.getValue() + "\">" + entry.getKey() + "</a><p>\n");

			if (count > MAX_PAGES) {
				break;
			}

		}

		// Reading the best-of page template
		StringBuffer bestPagesTemplate = new StringBuffer();
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(INPUT_TEMPLATE_FILE_NAME)))) {
			String temp = null;
			while ((temp = reader.readLine()) != null) {
				bestPagesTemplate.append(temp + "\n");
			}
		} catch (IOException e) {
			System.out.println("IOException " + e.toString());
		}

		// Change the date in the front matter
		bestPagesTemplate.replace(bestPagesTemplate.indexOf("DATE"), bestPagesTemplate.indexOf("DATE") + "DATE".length(),
				new SimpleDateFormat("yyyy-MM-dd HH:mm:SS Z").format(new Date()));

		// Embed the HTML in the best-of.md file
		bestPagesTemplate.replace(bestPagesTemplate.indexOf("BEST_OF"), bestPagesTemplate.indexOf("BEST_OF") + "BEST_OF".length(), bestPagesHtml.toString());

		// Write the contents to best-of.md Markdown file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(OUTPUT_MARKDOWN_FILE_NAME)))) {
			writer.write(bestPagesTemplate.toString());
		} catch (IOException e) {
			System.out.println("IOException " + e.toString());
		}

		System.out.println("Successfully written the best-of.md file\n" + bestPagesTemplate.toString());

	}

	public static boolean isRequiredURL(String pageURL) {
		for (int i = 0; i < UNWANTED_URLS.length; i++) {
			if (pageURL.startsWith(UNWANTED_URLS[i])) {
				return false;
			}
		}
		if (pageURL.equals("/")) {
			return false;
		}
		return true;

	}

	public static boolean isRequiredPage(String pageName) {
		for (int i = 0; i < UNWANTED_PAGES.length; i++) {
			if (pageName.startsWith(UNWANTED_PAGES[i])) {
				return false;
			}
		}
		return true;
	}

	public static String sanitizeURL(String pageURL) {
		int index = pageURL.lastIndexOf("/");
		if (index > 1) {
			return pageURL.substring(0, index + 1);
		}
		return pageURL;
	}

}
