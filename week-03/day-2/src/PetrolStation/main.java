package PetrolStation;

public class main {
    public static void main(String[] args) {

        //start
        Station firstStation = new Station(7500);

        Car Ferrari = new Car();

        firstStation.reffil(Ferrari);

        System.out.println(firstStation.gasAmount);
        System.out.println(Ferrari.capacity);
        System.out.println(Ferrari.gasAmount);
        //end
    }
}
