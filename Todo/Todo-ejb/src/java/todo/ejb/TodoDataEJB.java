/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.ejb;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Lock;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;
import javax.ejb.Singleton;
import todo.entities.TodoItem;

/**
 *
 * @author ipd
 */

@Singleton
@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
public class TodoDataEJB implements TodoDataEJBRemote {

    private ArrayList<TodoItem> todoList;

    @PostConstruct
    public void initialize() {
        System.out.println("TodoDataEJB.initialize()");
        todoList = new ArrayList<>();

    }

    @Lock(READ)
    @Override
    public TodoItem[] getAllTodoItems() {
        System.out.println("TodoDateEJB.getAllTodoItems()");
        // the array like this --> new TodoItem[0]
        return todoList.toArray(new TodoItem[0]);
    }

    @Lock(WRITE)
    @Override
    public void addTodoItem(TodoItem item) {
        System.out.println("TodoDateEJB.addTodoItem()");
        todoList.add(item);
    }
}
