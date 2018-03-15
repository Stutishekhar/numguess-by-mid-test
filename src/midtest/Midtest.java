/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author stuti
 */
public class Midtest 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random a = new Random();
        int number = a.nextInt(10);
        Scanner input = new Scanner(System.in);
        int guess;
        int attempt=1;
        
        while(true)
        {
            System.out.printf("Attempt %d:Guess the number i am thinking of: ",attempt);
            guess = input.nextInt();
            if(guess == number) 
            { 
                System.out.printf("You guessed it in %d attempts.It was %d\n",attempt,number);
                break; 
            }
            attempt++;
        }
        
        
    }
    
}
