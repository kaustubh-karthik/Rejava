// Import files
import java.util.Arrays;
import java.util.ArrayList;

public class TransitCalculator {
  
  // Declaring variables
  double days;
  int rides;
  int age;
  double[] goodPrice = new double[3];
  double storage = 100000000;
  int count = 0;
  double[] prices = new double[3];
  
  // Constructor class
  public TransitCalculator(int daysUsed, int ridesUsed, int ageUsed) {
    
    // Variable declaration
    days = daysUsed;
    rides = ridesUsed;
    age = ageUsed;
    
  }
  
  public void checkAge() {
    if(age < 65) {
      
      prices[0] = 2.75;
      prices[1] = 33.00;
      prices [2] = 127.00;
      
    } else {
      
      prices[0] = 1.35;
      prices[1] = 16.50;
      prices [2] = 63.50;
      
    }
  }
  
  public void calculateBestFare(/* For under 65s*/) {
    // Calculating per ride
    double total1Cost = prices[0];
    goodPrice[0] = total1Cost;
    // Calculating 7 day fare per ride
    double cost7 = Math.ceil(days / 7) * prices[1];
    double total7Cost = cost7 / rides;
    goodPrice[1] = total7Cost;
    // Calculating 30 day fare per ride
    double cost30 = Math.ceil(days / 30) * prices[2];
    double total30Cost = cost30 / rides;
    goodPrice[2] = total30Cost;
    
    System.out.println("The cost per ride is: £" + total1Cost);
    System.out.println("The cost for the 7 day subscription is: £" + total7Cost);
    System.out.println("The cost for the 30 day subscription is: £" + total30Cost);
  }
  
  // Method to check and print the best fare
  public void printBestFare() {
    for(double pricer : goodPrice) {
      // Checkin which is better
      if(pricer < storage) {
        
        storage = pricer;
        
        
      } 
    }
    // Printing
    if(storage == goodPrice[0]) {
        
        System.out.println("The best ticket would be the pay as you go!\n");
        
      } else if(storage == goodPrice[1]) {
        
        System.out.println("The best ticket would be the 7 day ticket!\n");
        
      } else {
        
        System.out.println("The best ticket would be the 30 day ticket!\n");
        
      }
  }
  
  // Main
  public static void main(String[] args) {
    
    TransitCalculator sarah = new TransitCalculator(7, 50, 66);
    TransitCalculator bob = new TransitCalculator(7, 50, 33);
    
    sarah.checkAge();
    sarah.calculateBestFare();
    sarah.printBestFare();
    
    bob.checkAge();
    bob.calculateBestFare();
    bob.printBestFare();

  }
}
