package GoFo;

import java.util.ArrayList;

/**
 * class playground used to make a playgrounds  object of owner to add them in the app.
 *  @author Ahmed Essam El din 20190050 , Habiba Tarek Fathi 20190168 and Al-Hossain Abdalaziz Youssef 20190106
 *  * @version 1.2
 *  * @since 2020-6-10
 */
public class PlayGround {
    private double price;               // private member variable of type double to hold the price of playground.
    private String location, type;      // private member variable of type string to hold the location of playground.
    private static int pgID = 0;
    private ArrayList<String> available = new ArrayList<String>();     // arraylist to hold the available time slot of playground.

    /**
     * playground parametrized constructor to playground information
     * @param price     variable of type double that hold the price of playground.
     * @param location  variable of type string that hold the location of playground.
     */
    public PlayGround(double price, String location) {
        this.price = price;         // assigning the value of parameter price to member variable "price".
        this.location = location;   // assigning the value of parameter location to member variable "location".
        this.type = "Grass";        // assigning type of playground.
        pgID++;
    }

    /**
     * getter for pgID
     * @return the ID of the playground of type int.
     */
    public int getID() {
        return pgID;
    }

    /**
     * getter for price
     * @return the price of the playground of type double.
     */
    public double getPrice() {
        return price;
    }

    /**
     * setter for price.
     * @param price hold the price of playground that to be assigned to member variable.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for location.
     * @return the location of the playground of type string.
     */
    public String getLocation() {
        return location;
    }

    /**
     * setter for location.
     * @param location hold the location of playground that to be assigned to member variable.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * add time function that add time slot to the current playground.
     * @param time of type string that hold the time slot of playground to be added to arraylist.
     */
    public void addTime(String time) {
        available.add(time);
    }

    /**
     * show time function used to display all available time slot.
     * loop on arraylist and print each time slot to uesr.
     */
    public void showTime() {
        for (int i = 0; i < available.size(); i++) {
            System.out.println(i + ". " + available.get(i));
        }
        System.out.println("");
    }

    /**
     * deleteSlot function used to remove a time slot from playground available times.
     * we remove time slot when player book it.
     * @param index that hold the index of time slot of array.
     */
    public void deleteSlot(int index) {
        available.remove(index);        // removing chosen time slot.
    }

    /**
     * displayPLG function used to print current playgroud to user.
     * display all playground information (price / location / time slots)
     */
    void displayPLG() {
        System.out.println("location: " + this.location);
        System.out.println("price: " + this.price);
        this.showTime();
    }
}
