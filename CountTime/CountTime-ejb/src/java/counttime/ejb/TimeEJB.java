/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author ipd
 */
@Stateless
public class TimeEJB implements TimeEJBRemote {

    @Override
    public Date getCurrentDateTime() {

        return new Date();

    }

}
