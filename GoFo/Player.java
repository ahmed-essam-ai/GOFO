package GoFo;

/**
* class player inherits from class user
 *@author Ahmed Essam Eldin 20190050 ,Habiba Tarek Fathi 20190168 and Al-Hossain Abdalaziz Youssef 20190106
 *@version 1.1
 *@since 2020-6-10
 */
public class Player extends User {


    /
     * player parametrized constructor
     * @param name      the first parameter to player parametrized constructor of type String that hold the name of the player.
     * @param password  the second parameter to player parametrized constructor of type String that hold the password of the player.
     * @param Email       the third parameter to player parametrized constructor of type String that hold the email of the player.
     * @param phoneNumber the fourth parameter to player parametrized constructor of type String to hold the phone of the player.
     * @param address   the fifth parameter to player parametrized constructor of type String to hold the address of the player.
     */
    public Player(String name, String password, String Email, String phoneNumber, String address){
        super(name, password, Email, phoneNumber, address);         // calling parent class constructor with parameters.
        setType("player");                                  // setting the type to player.
    }


}
