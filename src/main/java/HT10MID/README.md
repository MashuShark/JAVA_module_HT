At the MIDDLE level, you need to solve the following five tasks:

###Task 6.

A sequence of positive integers numbers and a sequence of strings stringList 
are given. Get a new sequence of strings according to the following rule: 
for each value n from sequence numbers, select a string from sequence stringList 
that starts with a digit and has length n. If Look at the template on the end of 
the task before solving the problem. there are several required strings in the 
stringList sequence, return the first; if there are none, then return the 
string "Not found"

For example:
input: {1, 3, 4}, {"1aa", "aaa", "1", "a"}
output: {"1", "1aa", "Not Found"}

###Task 7.

You are given a positive integer K and a sequence of integers integerList. 
Calculate the symmetrical difference between two subsets of integer values: 
the first subset is all even integerList values, the second subset is the 
integerList values excluding the first K elements. In the resulting difference,
replace the order with the reversed. //Example: Input 123456789, result 9,7,4,2 

For example:
input: number = 5, {1, 2, 3, 4, 5, 6, 7, 8, 9}
output: {9, 7, 4, 2}

###Task 8.

You are given a positive integer K and integer D and a sequence of integers 
integerList. Compute a union of two subsets of integers: the first subset is 
all values of integerList greater than D, the second subset is an integer list 
of values starting with an element with ordinal number K inclusive (the numbering 
of elements in the integer list starting from 0). Sort the resulting sequence in 
descending order. 

For example:
input: D = 3, K = 4, integerList{-10, 3, -3, 4, 55, 6}
output: {55, 6, 4}

###Task 9.

A sequence of non-empty strings stringList is given, containing only uppercase 
letters of the Latin alphabet. For all strings starting with the same letter, 
determine their total length and obtain a sequence of strings of the form "S-C", 
where S is the total length of all strings from stringList that begin with the 
character C. Order the resulting sequence in descending order of the numerical 
values of the sums, and for equal values of the sums, in ascending order of the 
C character codes. 

For example:
input: {"ABC", "A", "BCD", "D"}
output: {"4-A", "3-B", "1-D"}

###Task 10.

A sequence of non-empty strings of Latin alphabet characters stringList is 
given. Select the last character from each string, converting it to uppercase. 
Return sorted sequence of characters in descending order by initial string length. 

For example:
input: {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"}
output: {'U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'}