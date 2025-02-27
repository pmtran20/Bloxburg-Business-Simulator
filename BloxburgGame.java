public class BloxburgGame {
    public static void main(String args[]) {
        Business pizzaPlace = new Business("John's Pizza", "John", 5000);
        Business cafe = new Business("Morning Brew", "Bob", 7000);
   
        pizzaPlace.hireEmployee("Emma", "Baker", 1000);
        cafe.hireEmployee("Lily", "Barista", 1200);

        pizzaPlace.displayBusinessInfo();
        pizzaPlace.paySalary();
        pizzaPlace.applyTaxes();
        

        cafe.displayBusinessInfo();
        cafe.paySalary();
        cafe.applyTaxes();
        

        System.out.println("\nTotal Businesses Created: " + Business.getTotalBusinesses());
    }
}
