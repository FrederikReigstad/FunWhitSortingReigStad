import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //TODo code appliction

        Car c1 = new Car("VW", "Golf GTE", "blue", 215);
        Car c2 = new Car("Peugeot", "308 SW", "reaalyy green", 207);
        Car c3 = new Car("BMW", "320i", "blak", 212);
        Car c4 = new Car("Tesla", "Model s", "red", 250);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);


        System.out.println("Before sort....");

        for (Car c : cars) {
            System.out.println(c);

        }

        //java - Lambda Expression
        Comparator<Car> byBrand = (Car car1, Car car2) -> car1.getBrand().compareTo(car2.getBrand());
        Comparator<Car> byColor = (Car car1, Car car2) -> car1.getColor().compareTo(car2.getColor());
        Comparator<Car> byTopSpeed = (Car car1, Car car2) -> {
          /*  if (car1.getTopSpeed() < car2.getTopSpeed()) {
                return -1;
            } else if (car1.getTopSpeed() > car2.getTopSpeed()) {
                return 1;
            } else {
                return 0;
            } */
            return car1.getTopSpeed() - car2.getTopSpeed();
        };



        Collections.sort(cars, byTopSpeed);


        System.out.println("After sort....");

        for (Car c : cars)
            System.out.println(c);





    }
}
