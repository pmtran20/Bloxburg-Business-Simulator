# Bloxburg-Business-Simulator
Bloxburg Business Simulator Lab for 2321-201

This program uses method overloading, static fields, and nested classes. At the moment, two businesses were inserted into the public class BloxburgGame that displays the buisness name, owner, and funds. 

The method overloading was implemented by using the multiple of the same class just with different parameters. 

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

This would help in the case where things like owner is not available and would have another way to respond differently.

The static field was used to track how many businesses were created. Initially the value of totalBusinesses is set to 0. 
    private static int totalBusinesses = 0;

Every time a new business is created, the totalBusinesses count increases. Below is a block that shows that when a business is added, it will increase in count. 

    public Business(String name, String owner, double startingFunds) {
        this.name = name;
        this.owner = owner;
        this.funds = startingFunds;
        this.employee = null;
        totalBusinesses++;
    }
