package GoFo;

public class User {
    private String name, password, Email, phoneNumber, address, type;
    private static int ID=0;

    public User(){
        this.name = "";
        this.password = "";
        this.Email = "";
        this.phoneNumber = "";
        this.address = "";
        ID++;
    }
    public User(String name, String password, String Email, String phoneNumber, String address){
        this.name = name;
        this.password = password;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        ID++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
