package GoFo;
/**
 * Class Main used to display meny and taking data from user.
 *  @author Ahmed Essam El din 20190050 , Habiba Tarek Fathi 20190168 and Al-Hossain Abdalaziz Youssef 20190106
 * @version 1.3
 * @since 2020-6-10
 */
public class Player extends User {


    public Player(String name, String password, String Email, String phoneNumber, String address){
        super(name, password, Email, phoneNumber, address);
        setType("player");
    }


}