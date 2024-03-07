public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car(10, "test", "test");
        Motorbike motorbike = new Motorbike(10, "test", "test");

        System.out.println(car.toString());
        System.out.println(motorbike.toString());
    }
}
