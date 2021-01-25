package lesson04;

public class lesson004 {
    public static void main(String[] args) {
    Car car1 = new Car("Honda", 5, "Black");
    Car car2 = new Car("UAZ", 3, "Red");
    Car car3 = new Car("Camry");
//    car1.model = "Honda";
//    car1.countWheels = 5;
//    car1.color = "Black";
//    car2.model = "UAZ";
//    car2.countWheels = 3;
//    car2.color = "Red";
        System.out.println(car3.model);

        System.out.println("Car1 model" + car1.model);
        System.out.println("Car1 countWheels" + car1.countWheels);
        System.out.println("Car1 color" + car1.color);

        System.out.println("Car2 model" + car2.model);
        System.out.println("Car2 countWheels" + car2.countWheels);
        System.out.println("Car2 color" + car2.color);

        car1.move();
        car1.beep();

        car2.move();
        car2.beep();

    }
}
