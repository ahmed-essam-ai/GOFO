package GoFo;

public class Owner extends User {
    private PlayGround PlGr;

    public Owner(PlayGround PlGr, String name, String password, String Email, String phoneNumber, String address){
        super (name, password, Email, phoneNumber, address);
        this.PlGr = PlGr;
        setType("owner");
    }


}
