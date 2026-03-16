class Device {

    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void showInfo() {
        System.out.println("Brand: " + brand + ", Power: " + power + "W");
    }

    void turnOn() {
        System.out.println("Device is turning on...");
    }
}

class Laptop extends Device {

    Laptop(String brand, int power) {
        super(brand, power);
    }

    void turnOn() {
        System.out.println("Laptop " + brand + " is starting.");
    }
}

class Smartphone extends Device {

    Smartphone(String brand, int power) {
        super(brand, power);
    }

    void turnOn() {
        System.out.println("Smartphone " + brand + " is turning on.");
    }
}

class Tablet extends Device {

    Tablet(String brand, int power) {
        super(brand, power);
    }

    void turnOn() {
        System.out.println("Tablet " + brand + " is booting.");
    }
}

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Lenovo", 65);
        Smartphone smartphone = new Smartphone("Samsung", 20);
        Tablet tablet = new Tablet("Apple", 30);

        laptop.showInfo();
        laptop.turnOn();

        smartphone.showInfo();
        smartphone.turnOn();

        tablet.showInfo();
        tablet.turnOn();
    }
}