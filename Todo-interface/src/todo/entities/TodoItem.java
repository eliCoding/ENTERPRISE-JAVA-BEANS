/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ipd
 */
public class TodoItem implements Serializable{

    private static final long serialVersionUID = 1L;

    private static int count = 1;

    public TodoItem() {
    }

    public TodoItem(String Task, Date DueDate, boolean IsDone) {
        id = ++count;
        setDueDate(DueDate);
        setTask(Task);

        setIsDone(IsDone);
    }
    private int id;
    private String task;
    private Date dueDate;
    private boolean isDone;

    /**
     * @return the id
     */
    public int getId() {
        id = ++count;
        return id;
    }

    /**
     * @return the task
     */
    public String getTask() {
        return task;
    }

    /**
     * @param Task the task to set
     */
    public final void setTask(String task) {
        if (task.isEmpty()) {
            throw new IllegalArgumentException("Task description must not be emtpy");
        }
        this.task = task;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param DueDate the dueDate to set
     */
    public final void setDueDate(Date DueDate) {
        this.dueDate = DueDate;
    }

    /**
     * @return the isDone
     */
    public boolean isIsDone() {
        return isDone;
    }

    /**
     * @param IsDone the isDone to set
     */
    public final void setIsDone(boolean IsDone) {
        this.isDone = IsDone;
    }

    @Override
    public String toString() {
      return  String.format("%d: %s due %s is %s",getId(),getTask(),getDueDate(),isIsDone() ? "done" : "pending");
    }
     
    
}
