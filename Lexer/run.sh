#!/bin/bash
inputFile="../../test_cases/$1"
make -s
cd ./src/java/Compiler
export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"
export CLASSPATH="../:$CLASSPATH"
java MyCompiler $inputFile
cd ..
cd ..
cd ..
make clean -s
exec bash
