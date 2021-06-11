package GoFo;


/**
 * class Owner inherits from class user.
 *  @author Ahmed Essam El din 20190050 , Habiba Tarek Fathi 20190168 and Al-Hossain Abdalaziz Youssef 20190106
 * @version 1
 * @since 2020-6-10
 */
public class Owner extends User {
    private PlayGround PlGr;            // member variable of type play ground as each owner has play ground.

    /**
     * Owner parametrized constructor that takes owner data.
     * @param PlGr      the first parameter to owner parametrized constructor of type play ground that hold the playground of the owner.
     * @param name      the second parameter to owner parametrized constructor of type String that hold the name of the owner.
     * @param password  the third parameter to owner parametrized constructor of type String that hold the password of the owner.
     * @param Email       the fourth parameter to owner parametrized constructor of type String that hold the email of the owner.
     * @param phoneNumber the fifth parameter to owner parametrized constructor of type String to hold the phone of the owner.
     * @param address   the sixth parameter to owner parametrized constructor of type String to hold the address of the owner.
     */
    public Owner(PlayGround PlGr, String name, String password, String Email, String phoneNumber, String address){
        super (name, password, Email, phoneNumber, address);        // calling parent class constructor with parameters.
        this.PlGr = PlGr;
        setType("owner");                                    // setting the type to player.
    }


}

