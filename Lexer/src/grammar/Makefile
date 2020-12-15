ANTLR_JAR = /usr/local/lib/antlr-4.7.2-complete.jar
ANTLR = java -jar $(ANTLR_JAR)
ANTLR_OUT_DIR = ../java
PACKAGE = Parser
SYMBOLTABLE = symbolTable
# ANTLR_FLAGS = -no-listener -visitor -package $(PACKAGE)
ANTLR_FLAGS = -package $(PACKAGE) 
PARSER = Merzure

%: all

all:
	$(ANTLR) $(ANTLR_FLAGS) -o $(ANTLR_OUT_DIR)/$(PACKAGE)/ $(PARSER).g4

clean:
	rm -rf ../java/$(PACKAGE)/*.class
	rm -rf ../java/$(PACKAGE)/$(PARSER)*.java
	rm -rf ../java/$(PACKAGE)/*.tokens
	rm -rf ../java/$(PACKAGE)/*.interp
