package Exercise9;

public class Exercise9 {
    public static void main(String[] args) {
        Garage myGarage = new Garage();

        Car tesla = new ElectricCar("Tesla Model Y", 2024, 45000.0);
        Car vinfast = new ElectricCar("VinFast VF8", 2025, 38000.0);
        Car toyota = new GasCar("Toyota Camry", 2023, 32000.0);

        System.out.println();
        myGarage.addCar(tesla);
        myGarage.addCar(vinfast);
        myGarage.addCar(toyota);
        System.out.println();
        myGarage.startAll();
        myGarage.refuelAll();
        myGarage.stopAll();
    }
}
