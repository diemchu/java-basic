package d6.d61;
// Truck is a Car
public class Truck extends  Car {
    private int maxLoad = 100;
    private  int load ;

    // 짐을 싣는 메서드
    public boolean addLoad(int load){
        if(this.load + load > maxLoad) return  false;
        this.load += load;
        return  true;
    }

    public int getLoad() {
        return load;
    }

    // 주유하는 메서드
    public static  void refuel(Car car){
        car.setFuel(1000);
    }





    public static void main(String[] args) {
        Truck  truck = new Truck();
        truck.setFuel(100);
        System.out.println(truck.getFuel());
        truck.beep();
        System.out.println(truck.getFuel());

        // 차동자로 취급도 가능
        Car porter = new Truck();
        porter.beep();

        truck.addLoad(101);
        System.out.println(truck.getLoad());

        //
        Car  sonata = new Car();
        //만약 truck으로 취급하기전에 truck인지 확인하고 싶다면
        if(sonata instanceof  Truck){
            ((Truck)sonata).addLoad(10);
        }else{
            System.out.println("can't load because not truck");
        }

        // java 14이우

//        if(sonata instanceof  Truck){
//             Truck tempTruck = (Truck)sonata;
//        }
        if(sonata instanceof  Truck tempTruck){
            tempTruck.addLoad(10);
        }else{
            System.out.println("can't load because not truck");
        }
    }

}
