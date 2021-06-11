package GoFo;



import java.util.ArrayList;

public class App {
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<PlayGround> playGrounds = new ArrayList<PlayGround>();

    public void addUser(User user){
        users.add(user);
    }
    public void addPlayground(PlayGround playGround){
        playGrounds.add(playGround);
    }
    public User getUser(int index){
        return users.get(index);
    }

    public PlayGround getPlayGround(int index){
        return playGrounds.get(index);
    }
    public int PlGSize(){
        return playGrounds.size();
    }
}