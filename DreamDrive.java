import java.util.*;
import java.util.ArrayList;
import static java.util.List.*;
interface UserAuthentication{
    void signup(String username,String password,String fullName,String email,double phoneNumber);
    boolean login(String username , String password);
}
class Users{
    private String username;
    private String password;
    private String fullName;
    private String email;
    private double phoneNumber;
    public Users(String username,String password,String fullName,String email,double phoneNumber){
        this.username=username;
        this.password=password;
        this.fullName=fullName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public double getPhoneNumber(){
        return phoneNumber;
    }
}
class AuthService implements UserAuthentication{
    private ArrayList<Users> users;

    public AuthService(){
        this.users=new ArrayList<>();
    }
    Scanner sc = new Scanner(System.in);
    public void signup(String username,String password,String fullName,String email,double phoneNumber){
        //checking if username already exists

        for (Users u : users) {
            if(u.getUsername().equals(username)){
                System.out.println("Username already exists . please use different username");
                return;
            }
        }
        Users newUser = new Users(username,password,fullName,email,phoneNumber);
        users.add(newUser);
        System.out.println("SignUp successfully ! you can now login. ");
    }

    public boolean login(String username , String password){
        for (Users u : users){
            if(u.getUsername().equals(username)&& u.getPassword().equals(password)){
                System.out.println("login successfully");
                System.out.println("WELCOME "+u.getFullName()+" on WanderWheels");
                return true;
            }
        }
        System.out.println("invalid username or password . please try again ");
        return false;
    }
}
class Cars{

    String DriverName;
    String DriverPhonenumber;
    String upiId;
    int choice;
    String car;
    int carNumber;
    int Otp;
    int each = 10;
    Scanner sc = new Scanner(System.in);
    void fourSeater(String type,double distance){
        System.out.println("Select your dreamDrive : ");
        System.out.println("1.Celerio\n2.Swift Dzire\n3.Figo Ford\n3.Wagnor");
        double price=0;
        choice = sc.nextInt();
        switch (choice) {
            case 1:

                car = "Celerio";
                carNumber = 1000;
                Otp = 1234;
                DriverName = "virat";
                DriverPhonenumber = "9886621212";
                upiId = "aryad@axis";
                price = price + 30;
                price = price * distance;
                if(type.equals("intercity")){
                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price = Drivers(price);
                }
                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 2 :
                car = "Swift Dzire";
                carNumber = 1001;
                Otp = 1231;
                DriverName = "raj";
                DriverPhonenumber = "9446621212";
                upiId = "rajd@axis";
                price = price + 32;
                price = price * distance;
                if(type.equals("intercity")){
                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price =  Drivers(price);
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 3 :
                car = "figo ford";
                carNumber = 1002;
                Otp = 1334;
                DriverName = "niddhi";
                DriverPhonenumber = "8986621212";
                upiId = "niddhid@axis";
                price = price + 38;
                price = price * distance;
                if(type.equals("intercity")){
                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price =  Drivers(price);
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 4 :
                car = "wagnor";
                carNumber = 1905;
                Otp = 4334;
                DriverName = "ayush";
                DriverPhonenumber = "9046621212";
                upiId = "ayushd@axis";
                price = price + 30;
                price = price * distance;
                if(type.equals("intercity")){

                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price =  Drivers(price);
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

        }


    }
    void SevenSeater(String type,double distance){
        System.out.println("Select your dreamDrive : ");
        System.out.println("1.Ertiga\n2.Tavera\n3.Ford explorer\n4.Toyota Highlander");
        double price=0;
        choice = sc.nextInt();
        switch (choice) {
            case 1:

                car = "Ertiga";
                carNumber = 2024;
                Otp = 7869;
                DriverName = "virat";
                DriverPhonenumber = "9886621212";
                upiId = "aryad@axis";
                price = price + 42;
                price = price * distance;
                if(type.equals("intercity")){

                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price = Drivers(price);
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 2 :
                car = "Tavera";
                carNumber = 2089;
                Otp = 4532;
                DriverName = "raj";
                DriverPhonenumber = "9446621212";
                upiId = "rajd@axis";
                price = price + 42;
                price = price * distance;
                if(type.equals("intercity")){

                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price =   Drivers(price);
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 3 :
                car = "Ford explorer";
                carNumber = 2005;
                Otp = 1334;
                DriverName = "niddhi";
                DriverPhonenumber = "8986621212";
                upiId = "niddhid@axis";
                price = price + 50 ;
                price = price * distance;
                if(type.equals("intercity")){

                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {

                    price =   Drivers(price);
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 4 :
                car = "Toyota Highlander";
                carNumber = 5068;
                Otp = 4334;
                DriverName = "ayush";
                DriverPhonenumber = "9046621212";
                upiId = "ayushd@axis";
                price = price + 52;
                price = price * distance;
                if(type.equals("intercity")){

                    price=fixDriver(price);
                }else if(type.equals("rentals")){
                    price=price;
                }else {
                    // Drivers();
                    // price = price + Drivers();
                }

                System.out.println("total amount : " + price);
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;
        }


    }
    void traveller(String type,double distance){
        double price=0;
        car = "Traveller";
        carNumber = 1710;
        Otp = 4334;
        DriverName = "ayush";
        DriverPhonenumber = "9046621212";
        upiId = "ayushd@axis";
        price = price + 70;
        price = price * distance;
        if(type.equals("intercity")){
            price=fixDriver(price);
        }else if(type.equals("rentals")){
            price=price;
        }else {

            price =   Drivers(price);
        }

        System.out.println("total amount : " + price);
        System.out.println("you can pay by cash or on upiId :"+upiId);
        System.out.println(car+" is booked \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
        System.out.println("enjoy your dream Drive ");

    }

    double Drivers(double price) {
        System.out.println("do you need a driver for your trip ? ");
        System.out.println("1. yes \n2. no");
        int driver = sc.nextInt();

        switch (driver) {
            case 1:
                price = price + 50;

                break;
            case 2:
                price= price;

                break;
        }
        return price;
    }
    double fixDriver(double price){
        price=price+50;
        return price;
    }
}
class Drive {
    int date;
    String PickUp;
    String Destination;
    double Distance;
    final double speed = 40;
    double time;

    static double price = 1;
    int choiceCar;
    Scanner sc = new Scanner(System.in);
    Cars obj = new Cars();
    // for trip fourseater = 15 , seven seater = 20 , traveller = 25;
    void trip() {
        System.out.println("Please enter the date of your trip in the form(DDMMYYYY)");
        date = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Destination : ");
        Destination = sc.nextLine();
        System.out.print("Enter approximate distance in kilometers : ");
        Distance = sc.nextDouble();
        if(Distance<100) {
            System.out.println();
            time = (Distance / speed)*60;
            System.out.println(" approximate time of journey : " + time + " minutes");
            System.out.println("select your DreamDrive.....");
            System.out.println("1. 4 seater\n2. 7 seater\n3. traveller");
            int car = sc.nextInt();


            switch (car) {
                case 1:
                    obj.fourSeater("trip",Distance);
                    break;

                case 2 :
                    obj.SevenSeater("trip",Distance);
                    break;

                case 3:
                    obj.traveller("trip",Distance);
                    break;
            }

        }    }

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
        if ( Distance <= 50) {
            System.out.println("Please select your DreamDrive.....");
            int car = sc.nextInt();
            switch (car) {
                case 1:
                    obj.fourSeater("intercity",Distance);
                    break;

                case 2 :
                    obj.SevenSeater("intercity",Distance);
                    break;

                case 3:
                    obj.traveller("intercity",Distance);
                    break;
            }

        }
    }
    void rentals() {
        String DriverName;
        String DriverPhonenumber;
        String upiId;
        int choice;
        String car;
        int carNumber;
        int Otp;

        System.out.println("Please enter the date of your trip in the form(DDMMYYYY)");
        int date=sc.nextInt();
        System.out.println("Enter no of days of journey:");
        int days=sc.nextInt();
        System.out.println("select your DreamDrive.....");
        System.out.println("1. 4 seater=3000/day\n2. 7 seater=6000/day\n3. traveller=8000/day");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1 :
                price=3000 *days;
                System.out.println("total amount : " + price);
                System.out.println("your drive is confirmed");
                System.out.println("Driver details");
                car = "wagnor";
                carNumber = 2089;
                Otp = 4532;
                DriverName = "raj";
                DriverPhonenumber = "9446621212";
                upiId = "rajd@axis";
                System.out.println(car+" is booked \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");
                break;

            case 2 :
                price =6000*days;
                System.out.println("total amount : " + price);
                System.out.println("your drive is confirmed");
                System.out.println("Driver details");
                car = "Ertiga";
                carNumber = 3089;
                Otp = 1532;
                DriverName = "rahul";
                DriverPhonenumber = "9446621212";
                upiId = "rahuld@axis";
                System.out.println(car+" is booked \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");


                break;
            case 3:  price= 8000*days;
                System.out.println("total amount : " + price);
                System.out.println("your drive is confirmed");
                System.out.println("Driver details");
                car = "Traveller";
                carNumber = 4589;
                Otp = 5656;
                DriverName = "rishi";
                DriverPhonenumber = "9446621212";
                upiId = "rishid@axis";
                System.out.println(car+" is booked \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive ");

                break;
        }

    }
}

public class DreamDrive{
    public static void main(String[] args) {
        System.out.println("welcome to wonder wheels !!!!!!!!!!!!!!!");
        AuthService auth = new AuthService();
        Drive drive = new Drive();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("enter your choice\n1.signup\n2.login\n3.trip\n4.intercity\n5.rentals");
            choice = sc.nextInt();
            sc.nextLine();//consume new line


            switch(choice){
                case 1 :
                    System.out.println("Enter username : ");
                    String signupUsername = sc.nextLine();
                    System.out.println("Enter password : ");
                    String signupPassword = sc.nextLine();
                    System.out.println("Enter fullName : ");
                    String fullName = sc.nextLine();
                    System.out.println("Enter email : ");
                    String email = sc.nextLine();
                    System.out.println("Enter phoneNumber : ");
                    double phoneNumber = sc.nextDouble();

                    auth.signup(signupUsername,signupPassword,fullName,email,phoneNumber);
                    break;
                case 2 :
                    System.out.println("Enter username : ");
                    String loginUsername = sc.nextLine();
                    System.out.println("Enter password : ");
                    String loginPassword = sc.nextLine();
                    auth.login(loginUsername,loginPassword);
                    break;
                case 3:
                    drive.trip();
                    break;

                case 4 :
                    drive.intercity();
                    break;

                case 5 :
                    drive.rentals();
                    break;

                case 6 :


            }
        }while(choice<=6);
    }
}



















