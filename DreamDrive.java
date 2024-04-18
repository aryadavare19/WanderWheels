import java.util.*;
import java.util.ArrayList;
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
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                System.out.println("login successfully");
                System.out.println("WELCOME "+u.getFullName()+" on Dream Drive");
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
    Scanner sc = new Scanner(System.in);
    void fourSeater(String type,double distance){
        System.out.println("Select your dreamDrive : ");
        System.out.println("1.Celerio\n2.Swift Dzire\n3.Figo Ford\n4.Wagnor");
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
                    fixDriver(price);
                }else {

                    Drivers(price);
                }
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
                    fixDriver(price);
                }else {
                    Drivers(price);
                }
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
                    fixDriver(price);
                }else {

                    Drivers(price);
                }
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

                    fixDriver(price);
                }else {

                    Drivers(price);
                }

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

                    fixDriver(price);
                }else {

                    Drivers(price);
                }
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
                    fixDriver(price);
                }else {
                    Drivers(price);
                }
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
                    fixDriver(price);
                }else {
                    Drivers(price);
                }
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
                    fixDriver(price);
                }else {
                    Drivers(price);
                }
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
            fixDriver(price);
        }else {
            Drivers(price);
        }
       }

    void Drivers(double price) {
        System.out.println("do you need a driver for your trip ? ");
        System.out.println("1. yes \n2. no");
        int driver = sc.nextInt();

        switch (driver) {
            case 1:
                price = price + 50;
                System.out.println("total amount : " + price);
                System.out.println("your drive will be at pickup point in 5 mins");
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number : " + DriverPhonenumber);
                System.out.println("enjoy your dream Drive \n Be Alert , Be Safe");
                System.out.println("Emergency Number : 9999 4444 22");

                break;
            case 2:
                price= price;
                System.out.println("total amount : " + price);
                System.out.println("pickup your drive from our nearest center");
                System.out.println("you can pay by cash or on upiId :"+upiId);
                System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber);
                System.out.println("enjoy your dream Drive \n Be Alert , Be Safe");
                System.out.println("Emergency Number : 9999 4444 22");
                System.out.println("drop drive after use at our center");

                break;
        }

    }
    void fixDriver(double price){
        price=price+50;
        System.out.println("total amount : " + price);
        System.out.println("your drive will be at pickup point in 5 mins");
        System.out.println("you can pay by cash or on upiId :"+upiId);
        System.out.println(car+" is booked \nDetails \ncarNumber : " + carNumber + "\notp : " + Otp + "\nDriverName : " + DriverName + "\nDrivers Phone number : " + DriverPhonenumber);
        System.out.println("enjoy your dream Drive \n Be Alert , Be Safe");
        System.out.println("Emergency Number : 9999 4444 22");



    }
}
class invalidinputException extends Exception{
    invalidinputException(String str){
        System.out.print(str+" : ");
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
    Scanner sc = new Scanner(System.in);
    Cars obj = new Cars();


    void trip() {
        System.out.println("for trip distance must be less than 100 kms ");
        System.out.println("Please enter the date of your trip in the form(DDMMYY)");
        date = sc.nextInt();
       try{
           int year = date % 100;
           if(year!=24){
               throw new IllegalArgumentException("invalid year");
           }
           try{
               year = date%100;
               int month = year%100;
               if(month<=0 || month>12){
                   throw new IllegalArgumentException("invalid month");
               }
               try{
                   year = date%100;
                    month = year%100;
                    int d=month%100;
                   if(d<=0 || d>31){
                       throw new IllegalArgumentException("invalid day");
                   }


        sc.nextLine();
        System.out.print("Please enter your pickup point : ");
        PickUp = sc.nextLine();
        System.out.print("Enter your Destination : ");
        Destination = sc.nextLine();
        System.out.print("Enter approximate distance in kilometers : ");
        Distance = sc.nextDouble();
        if(Distance<100) {
            System.out.println();
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

        } else{
            System.out.println("please choose rentals trips are only for distance less than 100 Kms");
         } }catch(IllegalArgumentException e){
                   System.out.println("please enter valid day date .");
               }
           }catch(IllegalArgumentException e){
               System.out.println("please enter valid month .");
           }
       }catch(IllegalArgumentException e){
           System.out.println("please enter valid year .");
       }}


    void intercity() {
        System.out.println("For Intercity rides distance must be less than 50 kilometers ");
        sc.nextLine();
        System.out.print("Please enter your pickup point : ");
        PickUp = sc.nextLine();
        System.out.print("Enter your Destination : ");
        Destination = sc.nextLine();
        System.out.print("Enter approximate distance in kilometers : ");
        Distance = sc.nextDouble();
        time = (Distance / speed);
        if(time>=0 && time<=1) {
            System.out.println(" approximate time of your journey is : " + (time*60) + " min");
        }else{
            System.out.println(" approximate time of your journey is : " + (time) + " hrs");
        }
        if ( Distance <= 50) {
            System.out.println("1. 4 seater\n2. 7 seater\n3. traveller");
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

    String upiId="dreamDrive01@gmail.com";
    int choice;
    String car;
    int carNumber;

   void details(){
       System.out.println(car+" is booked \ncarNumber : " + carNumber);
       System.out.println("you can pay on upiId :"+upiId);
       System.out.println("Drop the car at any of our center after use ");
       System.out.println("enjoy your dream Drive \n Be Alert , Be Safe");
       System.out.println("Emergency contact Number : 9999 4443 22 ");

   }
    void rentals() {

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
                System.out.println("your drive is confirmed\nplease pick up your drive from yours nearest DreamDrive center");
                System.out.println("........................................................................................");
                System.out.println("Details");
                car = "wagnor";
                carNumber = 2089;
                details();
                break;

            case 2 :
                price =6000*days;
                System.out.println("total amount : " + price);
                System.out.println("your drive is confirmed");
                System.out.println("Driver details");
                car = "Ford explorer";
                carNumber = 3089;
                details();
                break;
            case 3 :
                price= 8000*days;
                System.out.println("total amount : " + price);
                System.out.println("your drive is confirmed");
                System.out.println("Details");
                car = "Traveller";
                carNumber = 4589;
                details();
                break;
        }

    }
}

public class DreamDrive{
    static void Test(String email) throws invalidinputException{

        if(email.substring(email.length()-3).equals(".in")){
            System.out.println();
        }else{
            throw new invalidinputException("Enter email in right form");
        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to Dream Drive !!!!!!!!!!!!!!!");
        AuthService auth = new AuthService();
        Drive drive = new Drive();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("enter your choice\n1.signup\n2.login\n3.exit Dream Drive");
            System.out.println("...................................................................................");
            choice = sc.nextInt();
            sc.nextLine();
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
                    try {
                        Test(email);
                        System.out.println("Enter phoneNumber : ");
                        double phoneNumber = sc.nextDouble();
                        auth.signup(signupUsername,signupPassword,fullName,email,phoneNumber);

                    }catch(invalidinputException e){
                        System.out.println(" give valid emailId");

                    }

                    break;
                case 2 :
                    System.out.println("Enter username : ");
                    String loginUsername = sc.nextLine();
                    System.out.println("Enter password : ");
                    String loginPassword = sc.nextLine();
                    boolean k = auth.login(loginUsername,loginPassword);
                    int ch;
                    if(k) {
                        do {
                            System.out.println("...................................................................................");
                            System.out.println("enter your choice : \n1.trip\n2.intercity\n3.rentals\n4.logout");
                            ch = sc.nextInt();
                            sc.nextLine();
                            switch (ch) {
                                case 1:
                                    drive.trip();
                                    break;

                                case 2:
                                    drive.intercity();
                                    break;

                                case 3:
                                    drive.rentals();
                                    break;
                            }}while(ch<4);
                        }else{
                            System.out.println("please enter valid choice");
                        }
                        break;


            }
            System.out.println("...................................................................................");
        }while(choice<3);

    }
}