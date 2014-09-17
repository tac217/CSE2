//Taryn Carroll
//September 15th 2014
//Professor Chen CSE002 Fall 2014
import java.util.Scanner; // initialize scanner
//begin program
public class Root {
    //main method is required for every java program
    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
    
    //inputs for secs and cycles
    System.out.print("Enter a double and I print its cube root- ");
    double cubeRoot = input.nextDouble();
    
    double cubeFirst = cubeRoot/3;
    double cubeFinal, cubeOne, cubeTwo, cubeThree, cubeFirstTwo;
    
    cubeFirstTwo=cubeFirst+cubeRoot;
    cubeOne=2*cubeFirst*cubeFirst*cubeFirstTwo;
    cubeThree=3*cubeFirst*cubeFirst*cubeFirst;
    cubeFinal=cubeOne/cubeThree;
    
    System.out.println("The cube root is "+cubeFinal+".");
    System.out.println(cubeFinal*cubeFinal*cubeFinal+".");
     
     
         
    
    } // end of main method
} // end of class