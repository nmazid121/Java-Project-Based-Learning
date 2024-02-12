import java.util.Scanner;
public class NumberGuessing {
    
    // return a random number in the console
    public static int generateRandomNumber() {
        int randomNumber = (int)(Math.random() * 100);
        return randomNumber;
    }

    // computer guesses through a linear search algorithm
    public static int linearSearchGuess(int guess) {
        int incrementGuess = guess;
        incrementGuess++;
        return incrementGuess;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int guessCompare = generateRandomNumber();
        System.out.println("The computer has to guess the number : " + guessCompare);
        // this is if you want to guess
        /*
        System.out.println("Enter a random number");
        int guess = input.nextInt();
        input.nextLine();
        */

        // store each of users guess's into an array
        int [] guessArray = new int[15];
        int index = 0;
        int attempts = 0;
        // user tries to guess the right number
        /* 
        while (guess != guessCompare) {
            if (guess > guessCompare) {
                    System.out.println("Too high, try again");
                    attempts++;
                    System.out.println("Attempts : " + attempts);
                    guess = input.nextInt();
            } else {
                    System.out.println("Too low, try again");
                    attempts++;
                    System.out.println("Attempts : " + attempts);
                    guess = input.nextInt();
                }
            guessArray[index] = guess;
            index++;    
        }
        */

        // binary search guess

        // populating an array with 100 elements
        int [] hundredArray = new int[100];
        int num = 1;
        for (int i = 0; i < hundredArray.length; i++) {
            hundredArray[i] = num;
            num++;
        }

        // actual binary search algo
        int low = 0;
        int high = hundredArray.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hundredArray[mid] == guessCompare) {
                System.out.println("You guessed it!");
                break;
            } else if (hundredArray[mid] > guessCompare) {
                high = mid - 1;
                int outputMid = mid + 1;
                System.out.println("Guess was too high : " + outputMid);
            } else {
                int outputMid = mid + 1;
                System.out.println("Guess was too low : " + outputMid);
                low = mid + 1;
            }
        }


        for(int i = 0; i < hundredArray.length; i++) {
            System.out.println(i + " : " + hundredArray[i]);
        }

    }    
}
