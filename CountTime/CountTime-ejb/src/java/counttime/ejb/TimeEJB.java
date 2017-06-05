/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

<<<<<<< HEAD
=======
import java.text.DateFormat;
import java.text.SimpleDateFormat;
>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
<<<<<<< HEAD
 * @author Elmira
=======
 * @author ipd
>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
 */
@Stateless
public class TimeEJB implements TimeEJBRemote {

    @Override
    public Date getCurrentDateTime() {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
=======

        return new Date();

    }

>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
}
