package todolist;
import java.util.ArrayList;
import java.util.Scanner;//input

public class todolist {
	public static void main(String[] args) {
		
		ArrayList<Task> Tasks = new ArrayList<>();
		
		boolean exit = true;
		
		
		System.out.println("Wellcome To My ToDoList");
		while(exit) {
			
			
		Scanner input=new Scanner(System.in);
		
	    System.out.println("1.Add Task");
	    System.out.println("2.Done Task");
        System.out.println("3.Delete Task");	
        System.out.println("4.View Tasks");
        System.out.println("5.Exit Program");
        int choose=input.nextInt();
        input.nextLine();
        
     switch(choose) {
     
     case 1:
    	 System.out.println("Enter TaskName:");
    	 String TaskName = input.nextLine();

    	 System.out.println("Enter TaskID:");
    	 int TaskID = input.nextInt();
    	 input.nextLine(); 

    	 System.out.println("Enter DueDate:");
    	 String DueDate = input.nextLine();

    	 System.out.println("Enter DueTime:");
    	 String DueTime = input.nextLine();
    	 
    	 
    	 Tasks.add(new Task(TaskName, TaskID, DueDate, DueTime));

    	 System.out.println("Task Added ✅");
    	
    	 break;
     case 2:
     
    	    if(Tasks.isEmpty()) {
    	        System.out.println("No tasks to mark as Done ❌");
    	        break;
    	    }

    	    System.out.println("Your Tasks:");
    	    for(Task t : Tasks) {
    	        t.display(); 
    	    }

    	    System.out.println("Enter Task ID to mark as Done:");
    	    int idDone = input.nextInt();
    	    input.nextLine();
    	    boolean foundDone = false;

    	    for(Task t : Tasks) {
    	        if(t.TaskID == idDone) {
    	            if(t.isDone) {
    	                System.out.println("This task is already marked as Done ✔");
    	            } else {
    	                t.isDone = true;
    	                System.out.println("Task marked as Done ✔");
    	            }
    	            foundDone = true;
    	            break;
    	        }
    	    }

    	    if(!foundDone) {
    	        System.out.println("Task Not Found ❌");
    	    }

    	    break;
    	 
     case 3:
    	    System.out.println("Enter TaskID to delete:");
    	    int idToDelete = input.nextInt();

    	    boolean found = false;

    	    for(int i = 0; i < Tasks.size(); i++) {
    	        if(Tasks.get(i).TaskID == idToDelete) {
    	            Tasks.remove(i);
    	            found = true;
    	            System.out.println("Task Deleted");
    	            break;
    	        }
    	    }

    	    if(!found) {
    	        System.out.println("Task Not Found");
    	    }

    	    break;
     case 4:
    	 for(Task t : Tasks) {
    		 t.display();
    		}
    	 
    	 break;
     case 5:
    	 exit=false;
    	 System.out.println("GoodBye");
    	 break;
    	 
     }
		}
	}
}


	