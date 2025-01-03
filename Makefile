all:
	javac -sourcepath ./agence   ./agence/*.java -d ./bin 
	cd bin ; java MainClass  ; cd .. 
	
