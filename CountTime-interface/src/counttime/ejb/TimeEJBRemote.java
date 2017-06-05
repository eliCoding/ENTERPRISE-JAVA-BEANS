/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

import java.util.Date;
import javax.ejb.Remote;

/**
 *
<<<<<<< HEAD
 * @author Elmira
 */
@Remote
public interface TimeEJBRemote {
    public Date getCurrentDateTime(); // returns java.util.Date object with current time of the server

=======
 * @author ipd
 */
@Remote
public interface TimeEJBRemote {
    public Date getCurrentDateTime();
>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
    
}
