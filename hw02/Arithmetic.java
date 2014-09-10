// Taryn Carroll
// Homework 2
// CSE 002 Professor Chen
// Arithmetic

public class Arithmetic {
    // main method needed for a Java program
    public static void main(String[] args) {
        
        // Number of pairs of socks
        int nSocks=3;
        // Cost per pair of socks
        double sockCost$=2.58;
        
        // Number of drinking glasses
        int nGlasses=6;
        // Cost per glass
        double glassCost$=2.29;
        
        // Number of boxes of envelopes
        int nEnvelopes=1;
        // Cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$; // Total cost of socks
        double totalGlassCost$; // 
        double totalEnvelopeCost$; // 
        double costOfSocksBeforeTax, totalCostOfSocks1, totalCostOfSocks2, glassCost, sockCost;
        double costOfGlassesBeforeTax, totalCostOfGlasses1, totalCostOfGlasses2;
        double costOfEnvelopesBeforeTax, totalCostOfEnvelopes1, totalCostOfEnvelopes2, envelopeCost;
        double costBeforeTax, costAfterTax, glassesBeforeTax, envelopesBeforeTax, socksBeforeTax;
        
        socksBeforeTax=nSocks*sockCost$;
        glassesBeforeTax=nGlasses*glassCost$;
        envelopesBeforeTax=nEnvelopes*envelopeCost$;
        
        costOfSocksBeforeTax=nSocks*sockCost$;
        totalCostOfSocks1=costOfSocksBeforeTax*taxPercent;
        totalCostOfSocks2=costOfSocksBeforeTax-totalCostOfSocks1;
        
        costOfGlassesBeforeTax=nGlasses*glassCost$;
        totalCostOfGlasses1=costOfGlassesBeforeTax*taxPercent;
        totalCostOfGlasses2=costOfGlassesBeforeTax-totalCostOfGlasses1;
        
        costOfEnvelopesBeforeTax=nEnvelopes*envelopeCost$;
        totalCostOfEnvelopes1=costOfEnvelopesBeforeTax*taxPercent;
        totalCostOfEnvelopes2=costOfEnvelopesBeforeTax-totalCostOfEnvelopes1;
        
        costBeforeTax=costOfEnvelopesBeforeTax+costOfGlassesBeforeTax+costOfSocksBeforeTax;
        costAfterTax=totalCostOfEnvelopes2+totalCostOfGlasses2+totalCostOfSocks2;
        
          // printing out how many items you have
    System.out.println("Socks:");
    System.out.println("Socks cost "+sockCost$+" each.");
    System.out.println("Price after tax is "+socksBeforeTax+".");
    System.out.println("We are buying "+nSocks+".");
    System.out.println("Price before tax is "+totalCostOfSocks2+".");
    
    System.out.println("Glasses:");
    System.out.println("Glasses cost "+glassCost$+" each.");
    System.out.println("We are buying "+nGlasses+" each.");
    System.out.println("Price after tax is "+glassesBeforeTax+".");
    System.out.println("Price before tax is "+totalCostOfGlasses2+".");
    
    System.out.println("Envelopes:");
    System.out.println("Envelopes cost "+envelopeCost$+" each.");
    System.out.println("We are buying "+nEnvelopes+".");
    System.out.println("Price after tax is "+envelopesBeforeTax+".");
    System.out.println("Price before tax is "+totalCostOfEnvelopes2+".");
    
    System.out.println("Total cost of everything after tax is "+costBeforeTax+".");
    System.out.println("Total cost of everything before tax is "+costAfterTax+".");
    

    } // end of the main method
} // end of class