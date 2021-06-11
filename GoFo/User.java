package GoFo;
/**
 * Class user used to set or get information of application users.
 * @author Ahmed Essam Eldin 20190050 , Habiba Tarek Fathi 
 * @version 1.2
 * @since 2020-6-10
 */
public class User {
    private String name;        //string private member variable to hold the name of the user.
    private String password;    //string private member variable to hold the password of the user.
    private String Email;       //string private member variable to hold the email of the user.
    private String phoneNumber;     //string private member variable to hold the phone number of the user.
    private String address;         //string private member variable to hold the address of the user.
    private String type;            //string private member variable to hold the type of the user (player or owner).
    private static int ID=0;        //int private member variable to hold the id of the user.


    public User(){
        this.name = "";
        this.password = "";
        this.Email = "";
        this.phoneNumber = "";
        this.address = "";
        ID++;
    }
    /**
     * parametrized constructor to assign all User's member variables.
     * @param name      the first parameter to User parametrized constructor of type String that hold the name of the user.
     * @param password  the second parameter to User parametrized constructor of type String that hold the password of the user.
     * @param Email       the third parameter to User parametrized constructor of type String that hold the email of the user.
     * @param phoneNumber the fourth parameter to User parametrized constructor of type String to hold the phone of the user.
     * @param address   the fifth parameter to User parametrized constructor of type String to hold the address of the user..
     */
    public User(String name, String password, String Email, String phoneNumber, String address){
        this.name = name;
        this.password = password;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        ID++;       // increment ID by 1.

    }

    /**
     * getter for member variable name.
     * @return name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * setter for member variable name
     * @param name parameter that holds the name of user assign it to member variable name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for member varialbe ID
     * @return ID of the user
     */
    public int getID() {
        return ID;
    }

    /**
     * setter for member variable type
     * @param type String parameter that hold the type of the user.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getter for member variable type
     * @return the type of user (player / owner).
     */
    public String getType() {
        return type;
    }

    /**
     * getter for member variable password
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * setter for member variable password
     * @param password String parameter that hold the password of the user of type string.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * getter for member variable email
     * @return the email of the user
     */
    public String getEmail() {
        return Email;
    }

    /**
     * getter for member variable email
     * @param email that hold the email of user
     */
    public void setEmail(String email) {
        Email = email;
    }

    /**
     * getter for member variable phoneNumber of type string.
     * @return the phone number of the user
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * setter for member variable phone number
     * @param phoneNumber  string parameter that hold the phone number of the user.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * getter for member variable address of type string.
     * @return the address of the user
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter for member variable address
     * @param address string parameter that hold the address of the user.
     */
    public void setAddress(String address) {
        this.address = address;
    }



}
