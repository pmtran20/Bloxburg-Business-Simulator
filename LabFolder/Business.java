package LabFolder;

public class Business {
    private String name;
    private String owner;
    private double funds;
    private static int totalBusinesses = 0;
    public static final double TAX_RATE = 0.1;

    private Employee employee; 

    public Business(String name) {
        this(name, "Unknown", 0);
    }

    public Business(String name, double startingFunds) {
        this(name, "Unknown", startingFunds);
    }

    public Business(String name, String owner, double startingFunds) {
        this.name = name;
        this.owner = owner;
        this.funds = startingFunds;
        this.employee = null;
        totalBusinesses++;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public double getFunds() {
        return funds;
    }

    public static int getTotalBusinesses() {
        return totalBusinesses;
    }

    public void hireEmployee(String name, String role, double salary) {
        this.employee = new Employee(name, role, salary);
    }

    public void paySalary() {
        if (employee == null) {
            System.out.println("No employee to pay!");
            return;
        }

        if (funds >= employee.getSalary()) {
            funds -= employee.getSalary();
            System.out.println("Salary paid: $" + employee.getSalary() + " to " + employee.getName());
        } else {
            System.out.println("Insufficient funds to pay salary!");
        }
    }

    public void applyTaxes() {
        double taxAmount = funds * TAX_RATE;
        funds -= taxAmount;
        System.out.println("Taxes applied: $" + taxAmount);
    }

    public void displayBusinessInfo() {
        System.out.println("\nBusiness Name: " + name);
        System.out.println("Owner: " + owner);
        System.out.println("Funds: $" + funds);
        if (employee != null) {
            System.out.println("Employee: " + employee.getName() + " (" + employee.getRole() + ") $" + employee.getSalary());
        } else {
            System.out.println("No employees hired.");
        }
    }

    class Employee {
        private String name;
        private String role;
        private double salary;

        public Employee(String name, String role, double salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public double getSalary() {
            return salary;
        }
    }
}
