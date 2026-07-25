import java.util.Scanner;
public class carShowroom {
    String name;
    String model;
    static  int carCount=0;
    public carShowroom(String carname, String carmodel)
    {
        this.name=carname;
        this.model=carmodel;
        carCount++;
        //System.out.println("You have created a car model: "+carmodel);
    }
}

void main(String[] args)
{
//    Scanner scanner=new Scanner(System.in);
//    int n= scanner.nextInt();
//    int car[]= new int[n];
//    for(int i=0;i<n;i++)
//    {
//
//    }


    carShowroom car1=new carShowroom("XYZ","COROLLA");
    System.out.println("You have created a car model: "+car1.model);
    carShowroom car2=new carShowroom("XYZ","COROLLA");
    System.out.println("You have created a car model: "+car2.model);
    carShowroom car3=new carShowroom("XYZ","COROLLA");
    System.out.println("You have created a car model: "+car3.model);
    System.out.println("The number of cars: "+ carShowroom.carCount);

}
