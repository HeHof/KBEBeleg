package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;

    private ToDoList toDoList;
    
	public ToDoListMB() {
		super();
		this.toDoList = new ToDoList();
	}    
	
	public ToDoList getToDoList(){
		return this.toDoList;
	}

    public String save() {
    	return "save";
    }
}
