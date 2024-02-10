public class ExpenseTracker {
    
    
    public static int addExpense(int moneyInput) {
        return moneyInput;
    }

    public static int deleteExpense(int deleteInput) {
        return deleteInput;
    }

    public static void showExpenses(int [] argsArray) {
        for (int i = 0; i < argsArray.length; i++) {
            int startCounter = i+1;
            if (argsArray[i] != 0) {
                System.out.println("Expense " + startCounter + ": " + argsArray[i]);
            }
        }
    }

    public static void main (String[] args) {
       // int userInput = Integer.parseInt(args[0]);
      //  int addedExpense = addExpense(userInput);
     //   System.out.println(addedExpense);
        
        int [] argsArray = new int[50];
        for (int i = 0; i < args.length; i++) {
            argsArray[i] = Integer.parseInt(args[i]);
        }

        // output each expense in the array
        showExpenses(argsArray);
    }
}