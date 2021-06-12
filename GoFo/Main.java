package GoFo;

import java.util.Scanner;
/**
 * Class Main used to display meny and taking data from user.
 *  @author Ahmed Essam El din 20190050 , Habiba Tarek Fathi 20190168 and Al-Hossain Abdalaziz Youssef 20190106
 * @version 1.3
 * @since 2020-6-10
 */
public class Main {
    static App system = new App();
    static Scanner sc = new Scanner(System.in);
    static int ID = -1;
    static int pgID = 0;

    /**
     * sign up function called for registering new user.
     * this function creates a new player/owner and add it to array list in system object.
     */
    public static void signUp(){
        String name,password, Email, phoneNumber, address; // variables that will hold the user date
        System.out.print("Name: ");     //asking user to enter name
        sc.nextLine();                  // due to java input validation.
        name = sc.nextLine();          // taking input name.

        System.out.print("Password: ");     //asking user to enter his password.
        password = sc.nextLine();           // taking input password.

        System.out.print("Email: ");     //asking user to enter his email.
        Email = sc.nextLine();           // taking input email.

        System.out.print("Phone number: ");     //asking user to enter his phone number.
        phoneNumber = sc.nextLine();           // taking input phoneNumber.

        System.out.print("Address: ");     //asking user to enter address.
        address = sc.nextLine();           // taking input address.
        System.out.println("1. Player");                // display output menu for the user
        System.out.println("2. playground owner");      // to choose his type.
        User u1 ;                                   // creating user object u1.
        int choice2 = sc.nextInt();                 // taking the choice of the user ( player/owner)

        if (choice2 == 1){                  // if he choose 1 as he is a player
            u1 = new Player(name,password, Email, phoneNumber, address);    // calling player parametrized constructor with user data as parameters.
            System.out.println("your ID : " + u1.getID());                  // display user generated ID to be able to login with.
            system.addUser(u1);                                             // adding this player to system arraylist.
        }

        else if (choice2 == 2){             // if he choose 2 as he is an owner.
            double price;                   // double variable to hold the price of playground.
            String location;                // string variable to hold the location of playground.
            System.out.print("Price: ");        //asking user to enter price.
            price = sc.nextDouble();            // taking input price of playground.
            System.out.print("Location: ");        //asking user to enter location.
            sc.nextLine();                        // due to java input validation.
            location = sc.nextLine();               // taking input location of playground.
            PlayGround PG = new PlayGround(price, location);            // creating playground object with parametrized constructor.
            system.addPlayground(PG);                             // adding this playground to system arraylist.
            u1 = new Owner(PG, name,password, Email, phoneNumber, address);     // calling owner parametrized constructor with user data as parameters.
            System.out.println("your ID : " + u1.getID());                      // display owner generated ID to be able to login with.
            system.addUser(u1);                                                 // adding this player to system arraylist.
        }
    }

    /**
     * sign in function used to for login.
     */
    public static void signIn(){
        String password;        // string variable to hold the password of user.
        int id;                 // int variable to hold the id of user.
        System.out.print("ID: ");
        id = sc.nextInt();              // taking id input from user
        System.out.print("Password: ");
        sc.nextLine();                   // due to java input validation.
        password = sc.nextLine();        // taking password as input from user.
        if(check(password, id-1).equalsIgnoreCase("owner")){        // checking owner credentials.
            ownerMenu(id-1);                // calling ownerMenu to display menu of owner functions can perform.
        }
        else if (check(password, id-1).equalsIgnoreCase("player")){         // checking player credentials.
            playerMenu();                       // calling playerMenu to display menu of player functions can perform.
        }

    }

    /**
     * check function that takes user id and password to check user credentials.
     * @param password  hold user password.
     * @param id        hold user ID.
     * @return          user type (player/owner) or invalid input if wrong validations.
     */
    public static String check(String password, int id){
        if(system.getUser(id).getPassword().equals(password)){          // check if entered password = stored password.
            String s = system.getUser(id).getType();                // return user type if data is valid.
            return s;
        }
        else {
            return "invalid input\n";
        }

    }

    /**
     * ownerMenu display a menu for owner when he login.
     * @param id  takes the id of the owner and perform some operation on owner.
     */
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

    /**
     * playerMenu function used to display player menu when he login
     */
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
                    System.out.println("playground ID: " + (i+1));
                    system.getPlayGround(i).displayPlayground();
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

    /**
     * menu function display main menu.
     */
    public static void menu(){
        System.out.println("1. sign up");
        System.out.println("2. sign in");
        System.out.println("0. exit");

    }

    public static void main(String args[]){
        menu();             // calling menu function to display main menu.
        int choice1;        // variable that will hold the choice of user.
        choice1 = sc.nextInt();             // taking input choice from user.
        while(choice1 != 0) {               // while user didn't enter 0 (exit)

            if (choice1 == 1) {                 // if user enter 1 (sign up).
                signUp();                       // calling sign up function.
            }
            else if (choice1 == 2) {          // if user enter 2 (sign up).
                signIn();                      // calling sign up function.
            }
            menu();                     // repeating main menu until user enter 0 (exit).
            choice1 = sc.nextInt();

        }

    }
}
