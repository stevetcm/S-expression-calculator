S-expression calculator
=======================

Command line program in Java that evaluates a simplified S-expression and 
prints out the integer result.

Example invocations:

    > java calc 123
    123

    > java calc "(add 12 12)"
    24
    
    > java calc "(multiply 2 (add (multiply 2526515400 3) 8))"
    15159092416

The logic is to essentially evaluates the most inner expression (valid pair 
of parentheses) and then iterate outwardly.

The result is of data type 'long' in order to evaluate extremely large numbers
