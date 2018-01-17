package javatutorials;

public class LoginDemo4 {

	 public static void main(String[] args) {
		 
	        String id = args[0];
	        String password = args[1];
	        
	        if ((id.equals("leos") || id.equals("days") || id.equals("mays")) && password.equals("1234")) {
	        	
	            System.out.println("right");
	            
	        } else {
	        	
	            System.out.println("wrong");
	            
	        }
	    }

}
