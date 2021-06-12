package GoFo;
/**
 * Class Main used to display menu and taking data from user.
 *  @author Ahmed Essam El din 20190050 , Habiba Tarek Fathi 20190168 and Al-Hossain Abdalaziz Youssef 20190106
 * @version 1.3
 * @since 2020-6-10
 */
public class Player extends User {

    /**
     * Player parametrized constructor that takes owner data.
     * @param name      the second parameter to player parametrized constructor of type String that hold the name of the player.
     * @param password  the third parameter to player parametrized constructor of type String that hold the password of the player.
     * @param Email       the fourth parameter to player parametrized constructor of type String that hold the email of the player.
     * @param phoneNumber the fifth parameter to player parametrized constructor of type String to hold the phone of the player.
     * @param address   the sixth parameter to player parametrized constructor of type String to hold the address of the player.
     */
    public Player(String name, String password, String Email, String phoneNumber, String address){
        super(name, password, Email, phoneNumber, address);
        setType("player");
    }


}
