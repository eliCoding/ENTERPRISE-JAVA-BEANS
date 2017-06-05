/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Elmira
 */
@Remote
public interface CounterEJBRemote {

    public void registerVisit(); // increments counter of visits

<<<<<<< HEAD
    public int getTotalVisitCount(); // returns current value of counter

=======
    public int getTotalVisitCount();
    
>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
}
