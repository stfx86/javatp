if [ -e ./bin ]; then 
   rm -r ./bin/*;
fi

javac -sourcepath ./agence   ./agence/*.java -d ./bin 
cd bin ; java MainClass  ; cd .. 