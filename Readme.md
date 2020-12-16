# Compilers-II_Project
Compilers II - Group Project

Here is the link for the initial draft of the Language Reference Manual
https://www.overleaf.com/read/tpqrvgthndhr

## Prerequisites: 
antlr 4.7.2 jar inside /usr/local/lib
java 1.6 or above

## Steps to run
1. Make the script (run.sh) in the Lexer directory executable by running the following command on CLI
	chmod +x run.sh
2. Run the bash script "run.sh" in the Lexer directory by running the following command on CLI
	sudo ./run.sh <test_case_file_name>
	Eg : sudo ./run.sh test.txt

The Readme file in the /src/test_cases directory contains information on what each test_case actually tests

## Note
The test cases are inside directory Lexer_and_Parser/src/test_cases, and they have a Readme of their own
This script was run on Ubuntu 18.04.4 LTS