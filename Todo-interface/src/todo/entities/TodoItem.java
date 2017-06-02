/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.entities;

import java.util.Date;

/**
 *
 * @author ipd
 */
public class TodoItem {

    private static int Id = 1;

    public TodoItem(String Task, Date DueDate, boolean IsDone) {
        setDueDate(DueDate);
        setTask(Task);

        setIsDone(IsDone);
    }

    private String Task;
    private Date DueDate;
    private boolean IsDone;

    /**
     * @return the Id
     */
    public static int getId() {
        Id++;
        return Id;
    }

    /**
     * @return the Task
     */
    public String getTask() {
        return Task;
    }

    /**
     * @param Task the Task to set
     */
    public void setTask(String Task) {
        if (this.Task.isEmpty()) {
            throw new IllegalArgumentException("Task description must not be emtpy");
        }
        this.Task = Task;
    }

    /**
     * @return the DueDate
     */
    public Date getDueDate() {
        return DueDate;
    }

    /**
     * @param DueDate the DueDate to set
     */
    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * @return the IsDone
     */
    public boolean isIsDone() {
        return IsDone;
    }

    /**
     * @param IsDone the IsDone to set
     */
    public void setIsDone(boolean IsDone) {
        this.IsDone = IsDone;
    }
}

   /* public TodoItem[] getAllTodoItems(){
    
    }

    public void addTodoItem(TodoItem item);

}*/
