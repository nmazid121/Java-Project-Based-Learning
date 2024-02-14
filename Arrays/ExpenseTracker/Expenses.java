import java.util.Scanner;

public class Expenses {
       public static void addExpense(int [] argsArray, String [] descriptionArray, int deposit, String description) {
        // insertion for the expense
        int count = 0;
        for (int i = 0; i < argsArray.length; i++) {
            if (argsArray[i] != 0) {
                count++;
                }
            }
            argsArray[count] = deposit;
            descriptionArray[count] = description;
            System.out.println("Added " + deposit + " to the expenses");
            System.out.println("Added " + "'" + description + "'" + " to the description");
        }

    public static void deleteExpense(int [] argsArray, int remove) {
        // deletion for the expense
        for (int i = remove-1; i < argsArray.length-1; i++) {
            argsArray[i] = argsArray[i+1];
        }

        System.out.println("Removed Expense " + remove);
    }

    public static void showExpenses(int [] argsArray, String [] descriptionArray) {
        // shows all the expenses that are not 0
        for (int i = 0; i < argsArray.length; i++) {
            int startCounter = i+1;
            if (argsArray[i] != 0) {
                System.out.println("Expense " + startCounter + " : " + argsArray[i]);
                System.out.println("Expense description " + startCounter + " : " + descriptionArray[i]);
            }
        }
    }

    public static void calculateTotal(int [] argsArray) {
        int sum = 0;
        for (int i = 0; i < argsArray.length; i++) {
            if (argsArray[i] != 0) {
                sum += argsArray[i];
            }
        }
        System.out.println("The total sum is: " + sum);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int [] argsArray = new int[50];
        String [] descriptionArray = new String[50];
        for (int i = 0; i < args.length; i++) {
            argsArray[i] = Integer.parseInt(args[i]);
        }

    

        while (true) {
            System.out.println("Choose an action: [1] Add Expense [2] Remove Expense [3] Calculate Total [4] Show Expenses [5] Exit");
            int action = input.nextInt();
            input.nextLine();
            switch (action) {
                case 1:
                    System.out.println("Add an expense");
                    int amount = input.nextInt();
                    input.nextLine(); // Consume the newline left behind by nextInt()
                    System.out.println("Add a description");
                    String description = input.nextLine();
                    addExpense(argsArray, descriptionArray, amount, description);
                    break;
                case 2:
                    System.out.println("Remove an expense");
                    input.nextLine();
                    deleteExpense(argsArray, input.nextInt());
                    break;
                case 3:
                    System.out.println("Calculate the total sum");
                    calculateTotal(argsArray);
                    break;
                case 4:
                    System.out.println("Show the expenses");
                    showExpenses(argsArray, descriptionArray);
                    break;
                case 5:
                    System.out.println("Exiting");
                    return;
                default:
                System.out.println("Invalid input, try again.");
                    break;
            }
        }
        
        
        } 
    }