package Arrays.ExpenseTracker;

import java.util.Scanner;

public class ExpenseTracker {
    
    
    public static void addExpense(int [] argsArray, int deposit) {
        // insertion for the expense
        int count = 0;
        for (int i = 0; i < argsArray.length; i++) {
            if (argsArray[i] != 0) {
                count++;
                }
            }
            argsArray[count] = deposit;
            System.out.println("Added " + deposit + " to the expenses");
        }

    public static void deleteExpense(int [] argsArray, int remove) {
        // deletion for the expense
        for (int i = remove-1; i < argsArray.length-1; i++) {
            argsArray[i] = argsArray[i+1];
        }

        System.out.println("Removed Expense " + remove);
    }

    public static void showExpenses(int [] argsArray) {
        // shows all the expenses that are not 0
        for (int i = 0; i < argsArray.length; i++) {
            int startCounter = i+1;
            if (argsArray[i] != 0) {
                System.out.println("Expense " + startCounter + " : " + argsArray[i]);
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
        for (int i = 0; i < args.length; i++) {
            argsArray[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Add an expense?");
        String answer = input.nextLine();
        if (answer.equals("Yes") || answer.equals("yes")) {
            System.out.println("How much would you like to deposit?");
            addExpense(argsArray, input.nextInt());
            showExpenses(argsArray);
        } else if (answer.equals("no") || answer.equals("No")) {
            System.out.println("What expense would you like to remove?");
            deleteExpense(argsArray, input.nextInt());
            showExpenses(argsArray);
        } else {
            System.out.println("Showing current expenses :");
            showExpenses(argsArray);
            }
        
        calculateTotal(argsArray);

        } 
    }
