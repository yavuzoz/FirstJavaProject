public class Car {

    public static void main(String[] args) {
        MyCar myCar = new MyCar(5); // Fuel efficiency: 5 liters/100km
        // Make a trip
        myCar.addGas(30); // Tank 30 liters
        myCar.drive(500); // Drive 500 km
        double gasLeft = myCar.getGasInTank(); // Get gas remaining in tank (5 liters)
        System.out.println("Gas left: " + gasLeft); // Print it

    }
}