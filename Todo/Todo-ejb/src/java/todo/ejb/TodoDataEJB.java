/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.ejb;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import todo.entities.TodoItem;

/**
 *
 * @author ipd
 */
@Singleton
public class TodoDataEJB implements TodoDataEJBRemote {

    private ArrayList<TodoItem> todoList;
    
       @PostConstruct
    public void initialize() {

        todoList = new ArrayList<>();

    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
