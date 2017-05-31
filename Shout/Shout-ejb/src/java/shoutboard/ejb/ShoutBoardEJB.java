
package shoutboard.ejb;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author ipd
 */
@Singleton
public class ShoutBoardEJB implements ShoutBoardEJBRemote {

    private ArrayList<String> shoutList;

    @Override
    public void addshout(String shout) {
         shoutList.add(shout);
    }

    @PostConstruct
    public void initialize() {
        
        shoutList = new ArrayList<>();
      
    }

  
    @Override
    public String[] getAllShouts() {
           //because I waanna return array of strings has to :
        return shoutList.toArray(new String[0]);
    }
}
