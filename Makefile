all:
	javac -sourcepath ~/java/javatp   ~/java/javatp/banksys/{source,classes}.java -d ./bin 
	cd bin ; java banksys.source ; cd .. 
	
