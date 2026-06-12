public class Day61{

    static class Car {

        String brand;
        int speed = 0;
        int fuel;

        Car(String brand, int fuel) {
            this.brand = brand;
            this.fuel = fuel;
        }

        void accelerate() {
            speed += 10;
            fuel -= 5;
            System.out.println(brand + " Speed: " + speed + " Fuel: " + fuel);
        }

        void decelerate() {
            speed -= 10;
            System.out.println(brand + " Speed: " + speed);
        }

        void refill() {
            fuel += 20;
            System.out.println(brand + " Fuel: " + fuel);
        }

        void showFuel() {
            System.out.println("Fuel = " + fuel);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Maruthi", 30);

        car.showFuel();
        car.accelerate();
        car.accelerate();
        car.decelerate();
        car.refill();
        car.showFuel();
    }
}
public class Day6{
    String name;
    int regNo;
    String dept;
    int maths, physics, cs;

    Day6(String name, int regNo, String dept, int maths, int physics, int cs) {
        this.name = name;
        this.regNo = regNo;
        this.dept = dept;
        this.maths = maths;
        this.physics = physics;
        this.cs = cs;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Department: " + dept);
        System.out.println("Maths Mark: " + maths);
        System.out.println("Physics Mark: " + physics);
        System.out.println("CS Mark: " + cs);

        int total = maths + physics + cs;
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {
        Day6 s1 = new Day6("Archana", 12345, "B.Sc Statistics", 90, 85, 95);
        s1.display();
    }
}
