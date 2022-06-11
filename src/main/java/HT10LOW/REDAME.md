## 10 - Java 8


Write functional programming lambda expressions using Java 8 streams. 
Each task must be solved with one lambda expressions. Put lambda expressions in the return statement1.
At the Low level, you need to solve the following five tasks:

###Task 1.

The character C and a sequence of non-empty strings stringList are given. Get a new sequence of 
strings with more than one character from the stringList, starting and ending with C. 

For example:
input: Symbol = 'a', {"Hello", "qwerty", "asda", "asdfa", "as", "a"}
output: {"asda", "asdfa"}

###Task 2.

A sequence of non-empty strings stringList is given. Get a sequence of ascending sorted integer
values equal to the lengths of the strings included in the stringList sequence. 

For example:
input: {"Hello", "world", "!", "Good", "morning", "!"}
output: {1, 1, 4, 5, 5, 7}

###Task 3.

A sequence of non-empty strings stringList is given. Get a new sequence of strings, where each 
string consists of the first and last characters of the corresponding string in the stringList 
sequence. 

For example:
input: {"asd", "a", "basdw"}
output: {"ad", "aa", "bw"}

###Task 4.

A positive integer K and a sequence of non-empty strings stringList are given. Strings of the 
sequence contain only numbers and capital letters of the Latin alphabet. Get from stringList 
all strings of length K ending in a digit and sort them in ascending order. 

For example:
input: number = 2, {"8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"}
output: {"A1", "S3"}

###Task 5.

A sequence of positive integer values integerList is given. Get sequence of string 
representations of only odd integerList values and sort in ascending order. 

For example:
input: {1, 2, 3, 4, 5, 6}
output: {"1", "3", "5"}