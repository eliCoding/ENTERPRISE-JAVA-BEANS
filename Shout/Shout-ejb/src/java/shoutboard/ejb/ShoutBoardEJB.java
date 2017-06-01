package shoutboard.ejb;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
                                               
import static javax.ejb.ConcurrencyManagementType.CONTAINER;

import javax.ejb.Lock;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;
import javax.ejb.Singleton;

/**
 *
 * @author ipd
 */
@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
@Singleton
public class ShoutBoardEJB implements ShoutBoardEJBRemote {

    private ArrayList<String> shoutList;

    @Lock(WRITE)
    @Override
    public void addshout(String shout) {
        shoutList.add(shout);
    }

    @PostConstruct
    public void initialize() {

        shoutList = new ArrayList<>();

    }

    // 
    @Lock(READ)
    @Override
    public String[] getAllShouts() {
        //because I waanna return array of strings has to convert it to string
        return shoutList.toArray(new String[0]);
    }
}
