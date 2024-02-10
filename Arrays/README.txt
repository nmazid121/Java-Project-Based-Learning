
Expense Tracker Program
The Expense Tracker program is a simple Java console application that allows users to manage their expenses. It enables users to add expenses with descriptions, remove expenses, calculate the total of all expenses, and display all recorded expenses along with their descriptions.

Features
Add Expense: Allows adding an expense amount along with a description.
Remove Expense: Enables removal of an expense by its position in the list.
Calculate Total: Calculates and displays the total sum of all expenses.
Show Expenses: Displays all the expenses along with their descriptions.
How to Run
Ensure you have Java installed on your system. If not, install it from the official Java website.

Save the code in a file named Expenses.java.

Open a terminal or command prompt.

Navigate to the directory where Expenses.java is saved.

Compile the Java program:

javac Expenses.java
Run the compiled Java program:

java Expenses
Follow the on-screen prompts to interact with the program.

Example Usage
Below are some example inputs and outputs for the program:


Copy code
Choose an action: [1] Add Expense [2] Remove Expense [3] Calculate Total [4] Show Expenses [5] Exit
Adding an Expense


1
Add an expense
500
Add a description
Groceries
Added 500 to the expenses
Added 'Groceries' to the description
4
Expense 1 : 500
Expense description 1 : Groceries
2
Remove an expense
1
Removed Expense 1
Calculating Total

3
Calculate the total sum
The total sum is: 0

5
Exiting


Notes
When removing an expense, you are prompted to enter the expense's position (1-based index) in the list of expenses.
The program does not persist data between runs; restarting the program will reset all data.
This guide provides a basic overview of running and interacting with the Expense Tracker program. Adjust inputs and actions as needed to manage your expenses.