//Taryn Carroll
//September 15th
//Professor Chen CSE002 Fall 2014
import java.util.Scanner; // initialize scanner
//begin program
public class Bicycle {
    //main method is required for every java program
    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    
    //inputs for secs and cycles
    System.out.print("Enter number of seconds: ");
    double numberSeconds = input.nextDouble();
    
    System.out.print("Enter number of cycles: ");
    double numberCycles = input.nextDouble();
    
    
    double wheelDiameter=27.0, // defining diameter of the wheel
    PI=3.14159, // defining what pi is
    feetPerMile=5280, // number of ft to mi
    inchesPerFoot=12, // number of in to ft
    secondsPerMinute=60, // number of secs to min
    minutesPerHour=60;
    double distanceTrip1, distanceTrip2, totalDistance, averageMph, timeMinutes, timeHours; //defining

    distanceTrip1=numberCycles*wheelDiameter*PI;
    // Avobe gives distance in inches
    // for each count, a rotation of wheel travels
    // the diameter in inches times PI
    timeMinutes=numberSeconds/secondsPerMinute;
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    timeHours=timeMinutes/minutesPerHour;
    averageMph=distanceTrip1/timeHours;


    
    // printing out the numbers that are variables
    System.out.println("The distance was "+distanceTrip1+" miles and took "
                        +timeMinutes+" minutes.");
    System.out.println("The average speed was " +averageMph+" miles per hour.");

    
    
    
    } // end of main method
} // end of class