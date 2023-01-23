public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Bleu");
        car.setDoors(2);
        car.setConvertible(true);
        car.setMake("maserati");
        car.setModel("Carrera");

        car.describeCar();
    }
}