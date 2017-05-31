/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author ipd
 */
@Stateless
public class CalculatorEJB implements CalculatorEJBLocal {

    @Override
    public double add(double val1, double val2) {
        System.out.printf("Calculator.add(%f,%f)\n",val1,val2);
        return val1+val2;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
