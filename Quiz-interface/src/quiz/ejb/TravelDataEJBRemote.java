/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.ejb;

import java.util.Date;
import javax.ejb.Remote;
import quiz.entities.Travel;

/**
 *
 * @author ipd
 */
@Remote
public interface TravelDataEJBRemote {

    public Travel[] getAllTravels();

    public void addTravel(Travel item);

    public String[] whoIsTravellingOnDate(Date date);

}
