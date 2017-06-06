/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.ejb;

import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Lock;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;
import javax.ejb.Singleton;
import quiz.entities.Travel;

/**
 *
 * @author ipd
 */
@Singleton
@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
public class TravelDataEJB implements TravelDataEJBRemote {

    private ArrayList<Travel> travelList;

    @PostConstruct
    public void initialize() {
        System.out.println("TravelDataEJB.initialize()");
        travelList = new ArrayList<>();

    }

    @Lock(READ)
    @Override
    public Travel[] getAllTravels() {
        System.out.println(" TravelDataEJB.getAllTravels()");
        return travelList.toArray(new Travel[0]);
    }

    @Lock(WRITE)
    @Override
    public void addTravel(Travel item) {
        System.out.println(" TravelDataEJB.addTravel()");
        travelList.add(item);
    }

 
    @Lock(READ)
    @Override
    public String[] whoIsTravellingOnDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // System.out.println(" TravelDataEJB.whoIsTravellingOnDate()");
       
      //  return 
    }

}
