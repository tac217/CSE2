//Taryn Carroll
//September 5th 2014
//Professor Chen CSE002 Fall 2014

//begin program
public class Cyclometer {
    //main method is required for every java program
    public static void main (String[] args) {
    
    //input data
    
    int secsTrip1=480; // number of seconds in trip1
    int secsTrip2=3220; // number of seconds in trip2
    int countsTrip1=1561; // number of couts for trip1
    int countsTrip2=9037; // number of counts for trip2
    
    // intermediate variables and output data
    double wheelDiameter=27.0, //no idea what this is
    PI=3.14159, // defining what pi is
    feetPerMile=5280, // number of ft to mi
    inchesPerFoot=12, // number of in to ft
    secondsPerMinute=60; // number of secs to min
    double distanceTrip1, distanceTrip2, totalDistance; //wut?
    
    // printing out the numbers that are variables
    System.out.println("Trip 1 took "+
                        (secsTrip1/secondsPerMinute)+ " minutes and had "+
                        countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
                        (secsTrip2/secondsPerMinute)+ " minutes and had "+
                        countsTrip2+" counts.");
                        
    // run calculations and store the values
    // document the calulation here
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // Avobe gives distance in inches
    // for each count, a rotation of wheel travels
    // the diameter in inches times PI
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //Print out the output data
    
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    
                        

    
    
    } // end of main method
} // end of class