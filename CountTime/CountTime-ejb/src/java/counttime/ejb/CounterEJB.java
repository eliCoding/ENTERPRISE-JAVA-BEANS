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
 * @author ipd
 */
@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
@Singleton
public class CounterEJB implements CounterEJBRemote {

    private int counter;

    @Lock(WRITE)
    @Override
    public void registerVisit() {
        System.out.println("registerVisit()");
        counter++;
    }

    @Lock(READ)
    @Override
    public int getTotalVisitCount() {
        System.out.println("getTotalVisitCount()");
        counter++;
        return counter;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
