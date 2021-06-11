package GoFo;

public class Player extends User {


    public Player(String name, String password, String Email, String phoneNumber, String address){
        super(name, password, Email, phoneNumber, address);
        setType("player");
    }


}