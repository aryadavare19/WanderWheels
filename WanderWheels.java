import java.util.*;

interface UserAuthentication{

    void signUp();

    void LogIn();



}

class SignUp implements UserAuthentication{



    public void signUp() {



    }

    public void LogIn() {



    }

}

class Drive {

    int phoneNumber;

    String name;

    String gender;

    int age;

    int date;

    int otp = 1213;


    int carno = 2005;


    String PickUp;

    String Destination;


    double Distance;


    final double speed = 40;


    double time;


    int Driver;


    static double price = 1;


    int choiceCar;


    Scanner sc = new Scanner(System.in);


    void signup() {


        System.out.println("SignUp : ");


        System.out.print("Enter Name: ");


        name = sc.nextLine();


        System.out.print("Enter the phone number: ");


        phoneNumber = sc.nextInt();


        sc.nextLine();


        System.out.print("Enter gender: ");


        gender = sc.next();


        System.out.print("Enter age: ");


        age = sc.nextInt();


    }

    // for trip fourseater = 15 , seven seater = 20 , traveller = 25;


    void trip() {

        System.out.print("Distance must be between 20 to 100 kilometers : ");

        System.out.println("Please enter the date of your trip in the form(DDMMYYYY)");

        date = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your Destination : ");

        Destination = sc.nextLine();

        System.out.print("Enter approximate distance in kilometers : ");

        Distance = sc.nextDouble();

        System.out.println();

        time = Distance / speed;

        System.out.println(" approximate time of journey : " + time + " hrs");


        System.out.println("do you need a driver for your trip ? ");

        System.out.println("1. yes \n2. no");

        int driver = sc.nextInt();

        if (Distance >= 20 && Distance <= 100) {

            System.out.println("select your DreamDrive.....");

            System.out.println("1. 4 seater\n2. 7 seater\n3. traveller");

            int car = sc.nextInt();

            switch (car) {

                case 1:

                    price = price + 25;

                    break;

                case 2:

                    price = price + 30;

                    break;

                case 3:

                    price = price + 35;

                    break;

            }

            price = price * Distance;

            switch (driver) {

                case 1:

                    price = price + 50;

                    break;

                case 2:

                    price = price;

                    break;

            }


            System.out.println("total amount : " + price);


        }
    }


    void intercity() {


        System.out.print("For Intercity rides distance must be less than 30 kilometers : ");


        System.out.println("Please enter yoour pickup point");


        PickUp = sc.nextLine();


        System.out.print("Enter your Destination : ");


        Destination = sc.nextLine();


        System.out.print("Enter approximate distance in kilometers : ");

        Distance = sc.nextDouble();


        System.out.println();


        time = Distance / speed;

        System.out.println(" approximate time of your journey is : " + time + " hrs");


        if (Distance <= 30) {


            System.out.println("Please select your DreamDrive.....");


            System.out.println(" Prices of rides per km 1.Auto-30 rs  \n 2.Mini(Swift Car)-35 rs \n 3.Sedan - 50 rs \n 4.XUV-60 rs");


            int car = sc.nextInt();

            switch (car) {

                case 1:

                    price = price + 30;


                    break;

                case 2:

                    price = price + 35;


                    break;


                case 3:

                    price = price + 50;


                    break;


                case 4:


                    price = price + 60;

            }


            price = (price * Distance) + 40;

            System.out.println("The total amount for your ride is:" + price);


            System.out.println("Confirming your ride and locating the drivers nearby:");

            System.out.println("Your ride is confirmed");

            System.out.println("Your OTP is:" + otp + "Car number of your ride is:" + carno);

            System.out.println("Have a safe Ride");

        }

    }


    void rentals() {


        System.out.println("Please enter the date of your trip in the form(DDMMYYYY)");


        int date = sc.nextInt();


        System.out.println("Enter no of days of journey:");


        int days = sc.nextInt();


        System.out.println("select your DreamDrive.....");


        System.out.println("1. 4 seater\n2. 7 seater\n3. traveller");


        int car = sc.nextInt();


        switch (car) {


            case 1:
                int price = 3000 * days;


                System.out.println("total amount : " + price);


                break;


            case 2:
                price = 6000 * days;


                System.out.println("total amount : " + price);


                break;


            case 3:
                price = 8000 * days;


                System.out.println("total amount : " + price);


                break;


        }


    }


}
public class WanderWheels {
    static void main(String[] args) {

        System.out.println("welcome to wonder wheels !!!!!!!!!!!!!!!");

        //System.out.println("");

        System.out.println("What would you Like to choose :- ");

        System.out.println("1.trips\n2.intercity\n3.rentals");

        Drive obj = new Drive();

        int k = 0;

        int choice;



        do {



            obj.trip();

        }while(k!=5);

    }










}
