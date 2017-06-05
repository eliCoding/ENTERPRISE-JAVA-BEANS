/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Lock;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;
import javax.ejb.Singleton;

/**
 *
 * @author Elmira
 */
@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
@Singleton
public class CounterEJB implements CounterEJBRemote {

    private int counter;

    @Lock(WRITE)
    @Override
    public void registerVisit() {
<<<<<<< HEAD

=======
        System.out.println("registerVisit()");
        counter++;
>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
    }

    @Lock(READ)
    @Override
    public int getTotalVisitCount() {
<<<<<<< HEAD
        return 0;
=======
        System.out.println("getTotalVisitCount()");
        counter++;
        return counter;
>>>>>>> 8f2e914507943b0337fa845d9a723657a014df52
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
