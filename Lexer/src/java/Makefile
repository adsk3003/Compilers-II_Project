ANTLR_JAR = /usr/local/lib/antlr-4.7.2-complete.jar
SOURCEPATH = ../java/

%: all

all:
	javac -cp $(ANTLR_JAR) Parser/*.java
	javac -cp $(ANTLR_JAR) symbolTable/*.java
	javac -cp $(ANTLR_JAR) -sourcepath $(SOURCEPATH) Compiler/*.java

clean:
	rm -rf symbolTable/*.class
	rm -rf Compiler/*.class
