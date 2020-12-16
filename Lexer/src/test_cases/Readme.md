# Lexer

### test01.fc
For testing mainly whitespaces processing when tokeninzing
### test02.fc
For testing comments
### test03.fc
Test case contains Invalid tokens (Error)
### test04.fc
For loop
### test05.fc
While loop
### test06.fc
If else
### test07.fc
loops with if/else
### test08.fc
Invalid tokens (Error)
### test09.fc
Using a function without arguments
### test10.fc
Using a function with arguments
### test11.fc
Bool testing
### test12.fc
Invalid tokens (Error)
### test13.fc
If else with expressions in between (Should not result in error while lexing)
### test14.fc
Testing cin
### test15.fc
Testing cout
### test16.fc
Testing arithmetic operators and brackets
### test17.fc
Invalid Tokens (Error)
### test18.fc -- test26.fc
All test cases testing for invalid tokens (Error)

# Parser

### Test1
Variable declerations, value assigning
### Test2
If statement
### Test3
For loops
### Test4
Functions
### Test5
Arrays
### Test6
Nested if/else if/else
### Test7
Nested if/else with for loops

# Semantic Analysis

### Semantic1
Variable declared twice
### Semantic2
Handled forward referencing
### Semantic3
size of arr greater than 0
### Semantic4
function call should have same type and same number of arguments
### Semantic5
same return type as mentioned in function defination
### Semantic6
The expression in if should be boolean or int
### Semantic7
empty program
### Semantic8
both operands of relational_op must be int
### Semantic9
the operand of logical not must have type bool
### Semantic10
Break and continue statements must be inside a loop
### Semantic11
Assigning values to an int like an array