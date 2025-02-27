package LabFolder;

public class BloxburgGame {
    public static void main(String args[]) {
        // Create businesses
        Business pizzaPlace = new Business("John's Pizza", "John", 5000);
        Business cafe = new Business("Morning Brew", "Bob", 7000);
   
        // This line is for employees to be added into the business
        pizzaPlace.hireEmployee("Emma", "Baker", 1000);
        cafe.hireEmployee("Lily", "Barista", 1200);

        // Displays business info along with the salary and taxes
        pizzaPlace.displayBusinessInfo();
        pizzaPlace.paySalary();
        pizzaPlace.applyTaxes();
        

        cafe.displayBusinessInfo();
        cafe.paySalary();
        cafe.applyTaxes();
        
        // Displays the amount of businesses created. 
        System.out.println("\nTotal Businesses Created: " + Business.getTotalBusinesses());
    }
}
