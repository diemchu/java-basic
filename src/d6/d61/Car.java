package d6.d61;

public class Car {
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos) {
        this.fuel -= kilos / 10;
    }
    public void beep(){
        System.out.println("Beeeeepppppppppp");
    }

}
