package GoFo;

import java.util.ArrayList;

/**
 * class app used to store all user and playgrounds in array list.
 */
public class App {
    private ArrayList<User> users = new ArrayList<User>();      // arraylist of users to hold all application users.
    private ArrayList<PlayGround> playGrounds = new ArrayList<PlayGround>();    // arraylist of playground to hold all application users playground..

    /**
     * addUser function used to add user to arraylist users.
     * @param user of type User that will be added to arraylist users.
     */
    public void addUser(User user){
        users.add(user);
    }

    /**
     * addPlayground function used to add a playground to arraylist playGrounds.
     * @param playGround  of type PlayGround hold the play ground to be added to array of play grounds
     */
    public void addPlayground(PlayGround playGround){
        playGrounds.add(playGround);
    }

    /**
     * getter for user
     * @param index takes an index of the user as a parameter.
     * @return the user with that index in the array of users.
     */
    public User getUser(int index){
        return users.get(index);
    }

    /**
     * getter for playground
     * @param index takes an index of the playground as a parameter.
     * @return the play ground with that index in the array of play grounds.
     */
    public PlayGround getPlayGround(int index){
        return playGrounds.get(index);
    }

    /**
     * function used to return the size of playground arraylist.
     * @return the size of playGrounds array.
     */
    public int PlGSize(){
        return playGrounds.size();
    }
