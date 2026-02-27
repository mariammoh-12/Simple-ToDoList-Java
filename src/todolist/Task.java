package todolist;

public class Task {
	  String TaskName;
	  int TaskID;
	  String DueDate;
	  String DueTime;
	  boolean isDone;
	  
	  
	  Task(String TaskName, int TaskID,String DueDate,String DueTime) {
	      this.TaskName = TaskName;
	      this.TaskID = TaskID;
	      this.DueDate = DueDate;
	      this.DueTime = DueTime;
	      this.isDone = false;
	      
	  }

	  void display() {
		  String status = isDone ? "✔" : " ";
	      System.out.println( "[" + status + "] " +"TaskID:" + TaskID + " , TaskName:" 
	  + TaskName +" , DueDate:" +DueDate +" , DueTime:"+DueTime);
	  }
	}