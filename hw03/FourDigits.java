//Taryn Carroll
//September 15th 2014
//Professor Chen CSE002 Fall 2014
import java.util.Scanner; // initialize scanner
//begin program
public class FourDigits {
    //main method is required for every java program


    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //inputs for secs and cycles
    System.out.print("Enter a double and I display the four digits to the right of the decimal point-");
    double numberOne = input.nextDouble();
    double numberTwo, numberThree;
    numberTwo=numberOne*10000;
    numberThree=numberTwo*10000;
    System.out.printf("%.4f", numberThree); 
    }
}