package Introduction;

public class Vehicle {
    int weight = 200;
    int powerOfEngine = 1000;

    double CalculateSpeed(double distance, double time){
        return distance / time;
    }

    protected void Faud(){
        System.out.println("Monkey");
    }

    private void MyName(){
        System.out.println("Hello");
    }

     public void VehicleName(){
        String Name = "Toyota";
         System.out.println("The name of my vehicle is " + Name);
    }

    public static void main(String[] args) {
        Vehicle v =new Vehicle();
        System.out.println("The weight of the truk is " + v.weight);
        System.out.println("The power of the Vehicle Engine is " + v.powerOfEngine);
        System.out.println(v.CalculateSpeed(1000,50));
        System.out.println(v.CalculateSpeed(2000,20));
        v.VehicleName();
    }
}
