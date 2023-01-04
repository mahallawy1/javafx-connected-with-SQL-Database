package application;

public class Login {
    final int password = 123 ;
    final String admin = "admin" ;
    final String employee = "employee";

    public String getAdmin() {
        return admin;
        
    }

    public String getEmployee() {
        return employee;
    }

    public Login() {
    }
     public int Login(String username,int passwo) {
         if(username.equals( admin)&&passwo==password ){
         return 1;
         }
         else if(username.equals( employee)&&passwo==password)
         {
         return 2; 
         } 
         else{
         System.out.println("wrong password or user name ya bashmohandsa");
         return 0;
         }
    }
    
}
