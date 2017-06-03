/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Elmira
 */
@Stateless
public class TimeEJB implements TimeEJBRemote {

    @Override
    public Date getCurrentDateTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
