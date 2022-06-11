# JAVA_module_HT
Solution for home task EPAM University Program Test Automation, Base of Java course. 

### Home task 1 - Condition statements:
Task 1:
For a given integer n calculate the value which is equal to a:
- squared number, if its value is strictly positive; 
- modulus of a number, if its value is strictly negative;
- zero, if the integer n is zero.

Task 2:
Find the maximum integer, that can be obtained by permutation of numbers of an arbitrary three-digit positive integer n (100<=n<=999).

### Home task 2 - Loop statements:
Task 1:
For a positive integer n calculate the result value, which is equal to the sum of the odd numbers of n.

Task 2:
For a positive integer n calculate the result value, which is equal to the amount of the “1” in the binary representation of n.

Task 3:
For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.

### Home task 3 - Arrays:

Task 1:
In a given array of integers nums swap values of the first and the last array elements, the second and the penultimate etc., if the two exchanged values are even.

Task 2:
In a given array of integers nums calculate integer result value, that is equal to the distance between the first and the last entry of the maximum value in the array.

Task 3:
In a predetermined two-dimensional integer array (square matrix) matrix insert 0 into elements to the left side of the main diagonal, and 1 into elements to the right side of the diagonal.

### Home task 4 - Functions:

Task 1:
Create function IsSorted, determining whether a given array of integer values of arbitrary length is sorted in a given order (the order is set up by enum value SortOrder). Array and sort order are passed by parameters. The function does not change the array.

Task 2:
Create function Transform, replacing the value of each element of an integer array with the sum of this element value and its index, only if the given array is sorted in the given order (the order is set up by enum value SortOrder). Array and sort order are passed by parameters. To check, if the array is sorted, the function IsSorted from Task 1 is called.

Task 3:
Create function MultArithmeticElements, which determines the multiplication of the first n elements of an arithmetic progression of real numbers with a given initial element of progression a1 and progression step t. an is calculated by the formula (an+1 = an + t).

Task 4:
Create function SumGeometricElements, determining the sum of the first elements of a decreasing geometric progression of real numbers with a given initial element of a progression a1 and a given progression step t, while the last element must be greater than a given alim. an is calculated by the formula (an+1 = an * t), 0<t<1.

### Home task 5 Low - Classes:
Task: Develop Rectangle and ArrayRectangles with predefined functionality.
On a Common level it is obligatory:

To develop Rectangle class with the following content:
- 2 closed real fields sideA and sideB (sides А and В of the rectangle);
- Constructor with two real parameters a and b (parameters specify rectangle sides); 
- Constructor with a real parameter a (parameter specify side А of a rectangle, side B is always equal to 5);
- Constructor without parameters (side А of a rectangle equals 4, side В - 3);
- Method getSideA, returning the value of the side А;
- Method getSideВ, returning the value of the side В;
- Method area, calculating and returning the area value;
- Method perimeter, calculating and returning the perimeter value;
- Method isSquare, checking whether the current rectangle is shape square or not. Returns true if the shape is square and false in another case;
- Method replaceSides, swapping rectangle sides.

### Home task 5 Advance - Classes:

On an Advanced level also needed:

Complete Level Low Assignment
Develop class ArrayRectangles, in which declare:
- Private field rectangleArray  - an array of rectangles;
- Constructor creating an empty array of rectangles with length n;
- Constructor that receives an arbitrary amount of objects of type Rectangle or an array of objects of type Rectangle;
- Method addRectangle that adds a rectangle of type Rectangle to the array on the nearest free place and returning true, or returning false, if there is no free space in the array;
- Method numberMaxArea, which returns the order number (index) of the first rectangle with the maximum area value in the array (numeration starts from zero);
- Method numberMinPerimeter, which returns the order number(index) of the first rectangle with the minimum perimeter value in the array (numeration starts from zero);
- Method numberSquares, which returns the number of squares in the array of rectangles.

### Home task 6 Low- Inheritance:
Task:
To create classes Employee, SalesPerson, Manager, and Company with predefined functionality.

The low level requires:

To create a basic class Employee and declare the following content:
- Three closed fields – text field name (employee last name), money fields – salary and bonus;
- Public property Name for reading employee’s last name;
- Public property Salary for reading and recording salary field;
- Constructor with a parameters string name and money salary (last name and salary are set);
- Virtual method SetBonus that sets bonuses to salary, the amount of which is  delegated/conveyed as a bonus;
- Method ToPay that returns the value of summarized salary and bonus.

To create class SalesPerson as class Employee inheritor and declare within it:
- Closed integer field percent (percent of sales targets plan performance/execution);
- Constructor with parameters: name – employee last name, salary, percent – percent of plan performance, the first two of which are passed to the basic class constructor;
- Redefine the virtual method of parent class SetBonus in the following way: if the salesperson completed the plan more than 100%, so his bonus is doubled (is multiplied by 2), and if more than 200% - the bonus is tripled (is multiplied by 3).

To create class Manager as Employee class inheritor, and declare with it:
- Closed integer field quantity (number of clients, who were served by the manager during a month);
- Constructor with parameters string name – employee last name, salary, and integer clientAmount – number of served clients, the first two of which are passed to the basic class constructor.

Redefine the virtual method of parent class SetBonus in the following way: if the manager served over 100 clients, his bonus is increased by 500, and if more than 150 clients – by 1000.

### Home task 6 Advance - Inheritance:

The advanced level requires:

To fully complete Low-level tasks.
Create class Company and declare within it:
- Closed field employees (staff) – an array of Employee type;
- Constructor that receives employee array of Employee type with arbitrary length;
- Method GiveEverybodyBonus with money parameter companyBonus that sets the amount of basic bonus for each employee;
- Method TotalToPay that returns total amount of salary of all employees including awarded bonus;
- Method NameMaxSalary that returns employee last name, who received maximum salary including bonus.

### Home task 7 - Aggregation:

To create classes Deposit (bank account), BaseDeposit (regular deposit), SpecialDeposit (special deposit), LongDeposit (long-term deposit), Client (bank client) with set functionality.

To create an abstract class Deposit and declare within it:
- Public money property only for reading Amount (deposit amount);
- Public integer property only for reading Period (time of deposit in months);
- Constructor (for calling in class-inheritor) with parameters depositAmount and depositPeriod, which creates object deposit with a specified sum for a specified period;
- Abstract method Income, which returns money value – the amount of income from the deposit. Income is the difference between sum, withdrawn from deposit upon expiration date, and deposited sum.
 
To create classes that are inheritors of the class Deposit, which determine different options of deposit interest addition – class BaseDeposit, class SpecialDeposit, and class LongDeposit. 
To implement in each class a constructor with parameters amount and period, which calls the constructor of the parent class. 
For each inheritor class – to implement its own interest addition scheme and accordingly profit margin definitions, overriding abstract method Income in each class.  
BaseDeposit implies each month 5% of the interest from the current deposit sum. Each following month of income is calculated from the sum, which was received by adding to the current income sum of the previous month and is rounded to the hundredth. 

To create class Client (bank client) and declare within it:
- Private field deposits (client deposits) – objects array of type Deposit;
- Constructor without parameters, which creates empty array deposits consisting of 10 elements;
- Method AddDeposit with parameter deposit for adding regular, special or long-term account into array on the first empty spot and returning true, or returning false, if accounts number limit is depleted (no empty space in array);
- Method TotalIncome, returning total income amount based on all client’s deposits upon deposits expiration;
- Method MaxIncome, returning maximum deposit income of all client’s deposits upon deposits expiration; 
- Method GetIncomeByNumber with integer parameter number (deposit number, which equals its index in array), returning income from deposit with such number. If deposit with such number does not exist, method returns 0 value.

### Home task 8 - Interface:

Task:
To add the following new functionalities to the project created in task 7: 
To create interface Prolongable (prolonging deposit) and declare within it method canToProlong without parameters that return the logic value true or false, depending on the fact whether this specific deposit can be prolonged or not. To implement interface Prolongable in classes SpecialDeposit and LongDeposit.
In addition, a special deposit (SpecialDeposit) can be prolonged only when more than 1000 UAH were deposited, and a long-term deposit (LongDeposit) can be prolonged if the period of deposit is no longer than 3 years. To implement a standard generic interface Comparable to abstract class Deposit. 
The total sum amount (sum deposited plus interest during the entire period) should be considered as comparison criteria for Deposit instances.
To implement additionally in class Client: 
- interface Iterator;
- Method sortDeposits, which performs deposit sorting in array deposits in descending order of total sum amount on deposit upon deposit expiration;
- Method countPossibleToProlongDeposit, which returns an integer – the amount of the current client’s deposits that can be prolonged.

### Home task 9 - Exeption:
Task:

To create type Matrix, which incapsulates two-dimensional array-matrix block of real (double) type.
Matrix is the cover for two-dimensional array of real values, storing matrix values with operations of matrix addition, deduction and multiplication.

Real type values (double) can be in matrix, specifying during creation, the number of array rows and columns, which will store these values. After creation, the number of rows and columns are not changed. Values to matrix elements can be set while creating matrix, and later with the help of indexer.
Matrix can provide information regarding the number of array rows and columns, receive array elements in form of two-dimensional standard array, add, deduct and multiply matrixes compatible by size. If a user is trying to perform operations with matrix of incompatible sizes – user type exceptions MatrixException are thrown from operations. Other matrix methods also throw exceptions, if a user applies them incorrectly (conveys incorrect parameters into constructor, in indexer – non-existing index and so on).

Implementation of the following functionality is required in Matrix class: • Creating of empty matrix with predetermined number of rows and columns (all values in matrix equal 0).
• Creating of matrix based on existing two-dimensional array.
• Receiving of number of matrix rows and columns.
• Receiving of standard two-dimensional array out of matrix.
• Access to recording and reading of elements via predetermined correct index (indexer).
• Method of matrixes addition.
• Method of matrixes deduction.
• Method of matrixes multiplication.
• Raise exceptions specified in Javadoc-comments to class methods.

### Home task 10 Low - 10 - Java 8:
Write functional programming lambda expressions using Java 8 streams. Each task must be solved with one lambda expressions. Put lambda expressions in the return statement1. At the Low level, you need to solve the following five tasks:

Task 1: The character C and a sequence of non-empty strings stringList are given. Get a new sequence of strings with more than one character from the stringList, starting and ending with C.

For example: input: Symbol = 'a', {"Hello", "qwerty", "asda", "asdfa", "as", "a"} output: {"asda", "asdfa"}

Task 2: A sequence of non-empty strings stringList is given. Get a sequence of ascending sorted integer values equal to the lengths of the strings included in the stringList sequence.

For example: input: {"Hello", "world", "!", "Good", "morning", "!"} output: {1, 1, 4, 5, 5, 7}

Task 3: A sequence of non-empty strings stringList is given. Get a new sequence of strings, where each string consists of the first and last characters of the corresponding string in the stringList sequence.

For example: input: {"asd", "a", "basdw"} output: {"ad", "aa", "bw"}

Task 4: A positive integer K and a sequence of non-empty strings stringList are given. Strings of the sequence contain only numbers and capital letters of the Latin alphabet. Get from stringList all strings of length K ending in a digit and sort them in ascending order.

For example: input: number = 2, {"8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"} output: {"A1", "S3"}

Task 5: A sequence of positive integer values integerList is given. Get sequence of string representations of only odd integerList values and sort in ascending order.

For example: input: {1, 2, 3, 4, 5, 6} output: {"1", "3", "5"}

### Home task 10 Middle - 10 - Java 8:
At the MIDDLE level, you need to solve the following five tasks:

Task 6: A sequence of positive integers numbers and a sequence of strings stringList are given. Get a new sequence of strings according to the following rule: for each value n from sequence numbers, select a string from sequence stringList that starts with a digit and has length n. If Look at the template on the end of the task before solving the problem. there are several required strings in the stringList sequence, return the first; if there are none, then return the string "Not found"

For example: input: {1, 3, 4}, {"1aa", "aaa", "1", "a"} output: {"1", "1aa", "Not Found"}

Task 7: You are given a positive integer K and a sequence of integers integerList. Calculate the symmetrical difference between two subsets of integer values: the first subset is all even integerList values, the second subset is the integerList values excluding the first K elements. In the resulting difference, replace the order with the reversed. //Example: Input 123456789, result 9,7,4,2

For example: input: number = 5, {1, 2, 3, 4, 5, 6, 7, 8, 9} output: {9, 7, 4, 2}

Task 8: You are given a positive integer K and integer D and a sequence of integers integerList. Compute a union of two subsets of integers: the first subset is all values of integerList greater than D, the second subset is an integer list of values starting with an element with ordinal number K inclusive (the numbering of elements in the integer list starting from 0). Sort the resulting sequence in descending order.

For example: input: D = 3, K = 4, integerList{-10, 3, -3, 4, 55, 6} output: {55, 6, 4}

Task 9: A sequence of non-empty strings stringList is given, containing only uppercase letters of the Latin alphabet. For all strings starting with the same letter, determine their total length and obtain a sequence of strings of the form "S-C", where S is the total length of all strings from stringList that begin with the character C. Order the resulting sequence in descending order of the numerical values of the sums, and for equal values of the sums, in ascending order of the C character codes.

For example: input: {"ABC", "A", "BCD", "D"} output: {"4-A", "3-B", "1-D"}

Task 10: A sequence of non-empty strings of Latin alphabet characters stringList is given. Select the last character from each string, converting it to uppercase. Return sorted sequence of characters in descending order by initial string length.

For example: input: {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"} output: {'U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'}
