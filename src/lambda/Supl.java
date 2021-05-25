package lambda;

import java.util.ArrayList;

public class Supl {
    public static ArrayList<Car> createCars(java.util.function.Supplier<Car> sup) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(sup.get());
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Car> myCars = createCars(() -> new Car("VW", "Polo"));
        System.out.println(myCars);
    }
}

class Car {
        String model;
        String color;

        public Car(String model, String color) {
            this.model = model;
            this.color = color;
        }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

