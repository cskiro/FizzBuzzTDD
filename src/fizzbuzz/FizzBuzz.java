/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author skiroc
 */
public class FizzBuzz {
    // Rules:
    // 1) If number is divisible by 3, return "Fizz"
    // 2) If number is divisible by 5, return "Buzz"
    // 3) If number is divisible by 3 and 5, return "Fizz Buzz"
    // 4) If number is not divisible by 3 or 5, return number
    
    public static String numberDivisibleByThree (int number) {
        String currentNumberInWords = "";
        int currentNumber = number;
        
        if (currentNumber % 3 == 0) {
            currentNumberInWords = "Fizz";
        }
        return currentNumberInWords;
    }
    
    public static String numberDivisibleByFive (int number) {
        String currentNumberInWords = "";
        int currentNumber = number;
        
        if (currentNumber % 5 == 0) {
            currentNumberInWords = "Buzz";
        }
        return currentNumberInWords;
    }
    
    public static String numberDivisibleByThreeAndFive (int number) {
        String currentNumberInWords = "";
        int currentNumber = number;
        
        if ((currentNumber % 3 == 0 && currentNumber % 5 == 0)) {
            currentNumberInWords = "FizzBuzz";
        }
        return currentNumberInWords;
    }
    
    public static String toWords (int number) {
        String numberInWords = "";
        int currentNumber = number;
        if (number == 0) {
            return "0";
        } else if ((number % 3 == 0 && number % 5 == 0)) {
            numberInWords = numberDivisibleByThreeAndFive(currentNumber);
            return numberInWords;
        } else if (number % 3 == 0) {
            numberInWords = numberDivisibleByThree(currentNumber);
            return numberInWords;
        } else if (number % 5 == 0) {
            numberInWords = numberDivisibleByFive(currentNumber);
            return numberInWords;
        } else if ((currentNumber % 3 != 0 || currentNumber % 5 != 0 || 
                (currentNumber % 3 == 0 && currentNumber % 5 == 0))) {
            return Integer.toString(currentNumber);
        }
        return numberInWords;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int numberArray[] = new int[101];
        for (int i = 0;  i < numberArray.length; i++) {
            String toWords = fizzBuzz.toWords(i);
            System.out.println(toWords);
        }
       
    }
    
}
