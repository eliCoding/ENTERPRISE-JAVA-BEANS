package quiz.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ipd
 */
public class Travel implements Serializable {

    private static final long serialVersionUID = 1L;

    public Travel() {
    }

    private static int counter = 1;

    private int id;
    private String fullName;
    private String destination;
    private Date departDate;
    private Date returnDate;

    //
    //ToDo: fibonacci numbers 
    /* public static long id(int n) {
        if (n <= 1) {
            return n;
        } else {
            return id(n - 1) + id(n - 2);
        }
    }*/
    public Travel(String fullName, String destination, Date departDate, Date returnDate) {

        id = ++counter;

        setFullName(fullName);
        setDestination(destination);
        setDepartDate(departDate);
        setReturnDate(returnDate);
    }

    /**
     * @return the id
     */
    public final int getId() {
        return id;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public final void setFullName(String fullName) {
        if (fullName.isEmpty()) {
            throw new IllegalArgumentException("Value must not be emtpy");
        }

        this.fullName = fullName;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public final void setDestination(String destination) {
        if (destination.isEmpty()) {
            throw new IllegalArgumentException("Value must not be emtpy");
        }
        this.destination = destination;
    }

    /**
     * @return the departDate
     */
    public Date getDepartDate() {
        return departDate;
    }

    /**
     * @param departDate the departDate to set
     */
    public final void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    /**
     * @return the returnDate
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public final void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return String.format("%d: %s is away from %s to %s in %s", getId(), getFullName(), getDepartDate(), getReturnDate(), getDestination());
    }

}
