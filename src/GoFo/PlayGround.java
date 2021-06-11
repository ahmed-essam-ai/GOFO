package GoFo;

import java.util.ArrayList;

public class PlayGround {
    private double price;
    private String location, type;
    private static int pgID = 0;
    private ArrayList<String> available = new ArrayList<String>();

    public PlayGround(double price, String location) {
        this.price = price;
        this.location = location;
        this.type = "Grass";
        pgID++;
    }

    public int getID() {
        return pgID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addTime(String time) {
        available.add(time);
    }

    public void showTime() {
        for (int i = 0; i < available.size(); i++) {
            System.out.println(i + ". " + available.get(i));
        }
        System.out.println("");
    }

    public void deleteSlot(int index) {
        available.remove(index);
    }

    void displayPLG() {
        System.out.println("location: " + this.location);
        System.out.println("price: " + this.price);
        this.showTime();
    }
}

