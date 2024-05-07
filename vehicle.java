import java.util.Scanner;
class Vehicle{
    void start(){
        System.out.println("vehicle to start");
    }  
}

class Car extends Vehicle{
    void drive(){
        System.out.println("car to drive");
    }
}

class Main{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);

        System.out.println("enter 1 for vehicle start and 2 for car drive");
        int choice=s.nextInt();

        if(choice==1){
            Vehicle vehicle=new Vehicle();
            vehicle.start();
        }
        else if(choice==2){
            Car car=new Car();
            car.drive();
        }
        else{
            System.out.println("invalid choice!");
        }
    }
}