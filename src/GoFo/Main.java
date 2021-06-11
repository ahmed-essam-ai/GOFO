package GoFo;

//import java.lang.*;
import java.util.*;
public class Main {
    static App system = new App();
    static Scanner sc = new Scanner(System.in);
    static int ID = -1;
    static int pgID = 0;
    public static void signUp(){
        String name,password, Email, phoneNumber, address;
        System.out.print("Name: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();

        System.out.print("Email: ");
        Email = sc.nextLine();

        System.out.print("Phone number: ");
        phoneNumber = sc.nextLine();

        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.println("1. Player");
        System.out.println("2. playground owner");
        User u1 ;
        int choice2 = sc.nextInt();

        if (choice2 == 1){
            u1 = new Player(name,password, Email, phoneNumber, address);
            System.out.println("your ID : " + u1.getID());
            system.addUser(u1);
        }

        else if (choice2 == 2){
            double price;
            String location;
            System.out.print("Price: ");
            price = sc.nextDouble();
            System.out.print("Location: ");
            sc.nextLine();
            location = sc.nextLine();
            PlayGround PG = new PlayGround(price, location);
            system.addPlayground(PG);
            u1 = new Owner(PG, name,password, Email, phoneNumber, address);
            System.out.println("your ID : " + u1.getID());
            system.addUser(u1);
        }


    }
    public static void signIn(){
        String password;
        int id;
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Password: ");
        sc.nextLine();
        password = sc.nextLine();
        if(check(password, id-1).equalsIgnoreCase("owner")){
            ownerMenu(id-1);
        }
        else if (check(password, id-1).equalsIgnoreCase("player")){
            playerMenu();
        }

    }

    public static String check(String password, int id){
        if(system.getUser(id).getPassword().equals(password)){
            String s = system.getUser(id).getType();
            return s;
        }
        else {
            return "invalid input\n";
        }

    }

    public static void ownerMenu(int id){
        int choice3=1;
        while (choice3 !=0) {
            System.out.println("1- register playground");
            System.out.println("0- log out");
            choice3 = sc.nextInt();
            if (choice3 == 1) {
                System.out.println("enter price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("enter location: ");
                String loc = sc.nextLine();
                PlayGround plg1 = new PlayGround(price, loc);
                String time;
                System.out.print("Add time: ");
                time = sc.nextLine();
                while (!time.equals("")) {
                    plg1.addTime(time);
                    System.out.print("Add time: ");
                    time = sc.nextLine();
                }
                system.addPlayground(plg1);
            }
        }

    }

    public static void playerMenu(){
        int choiceID;
        int slot;
        int choice3=1;
        while (choice3 !=0) {
            System.out.println("1- Display playground");
            System.out.println("2- Book a playground");
            System.out.println("0- log out");
            choice3 = sc.nextInt();
            if (choice3 == 1) {
                for (int i = 0; i < system.PlGSize(); i++) {
                    System.out.println("playground ID: " + i);
                    system.getPlayGround(i).displayPLG();
                    System.out.print("\n");
                }
            }
            else if(choice3== 2){
            System.out.print("playground ID: ");
            choiceID = sc.nextInt();
            System.out.print("Slot: ");
            slot = sc.nextInt();
            system.getPlayGround(choiceID - 1).deleteSlot(slot);
            System.out.println("playground booked successfully");
            }
        }


    }

    public static void menu(){
        System.out.println("1. sign up");
        System.out.println("2. sign in");
        System.out.println("0. exit");

    }

    public static void main(String args[]){
        menu();
        int choice1;
        choice1 = sc.nextInt();
        while(choice1 != 0) {

            if (choice1 == 1) {
                signUp();
            } else if (choice1 == 2) {
                signIn();
            }
            menu();
            choice1 = sc.nextInt();

        }

    }
}