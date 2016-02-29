
#for line in books health social personal self-improvement challenges technology travelogue thought-experiments science
#do
#	grep -Ril "$line" /home/smileprem/git/prem82.github.io/_posts/*.md | cut -c56-| rev | cut -c4- | rev > temp/"$line".txt
#done


javac GAData.java
java GAData
