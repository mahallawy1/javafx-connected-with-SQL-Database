package application;

import java.util.Scanner;



public class Employee extends admin {
	 private String EmployeeID;
	 private String EmployeeStatus;
	 private static int idofmembers;
	 

	 
	 public Employee(String name, String gender, String phone,String Nationalid,String EmployeeID,String EmployeeStatus) {
	 super(name, phone, gender,Nationalid,EmployeeID);
	 this.EmployeeID=EmployeeID;
	 this.EmployeeStatus=EmployeeStatus;
	 } 

	    public Employee(){}
	public String getEmployeeID() {
	return EmployeeID;
	}


	public void setEmployeeID(String employeeID) {
	EmployeeID = employeeID;
	}
	public String getEmployeeStatus() {
	return EmployeeStatus;
	}
	public void setEmployeeStatus(String employeeStatus) {
	EmployeeStatus = employeeStatus;
	}
	public void addMember(int y,int x,String namt,String phone,String attended)
	        
	{ 
	    Membership SH = null;
	   
	    String gendero;
	    
	   
	   
	    if ( y==1)gendero = "Male" ;
	    else if (y==2) gendero = "Female";
	     else  {System.out.println("ERROR");
	        return;
	        }
	    idofmembers = idofmembers + 1;
	  
	 
	    
	    if( x == 1 ){
	         SH = new PayG("PayG",2,100);
	    
	}
	   if (x == 2){
	     SH = new Monthly("OM",2,100);
	     
	   }
	    if (x == 3){
	     SH = new Termly("TM",2,100);
	     
	   }
	   
	         
	   members.add(new Member (namt,idofmembers,gendero,phone,SH,attended ));
	   System.out.println(members);
	}
	public void deleteMember (int i ){
	  
	       members.removeIf(members -> members.getID() == i);
	       System.out.println(members);
	}
	public void editMember (int i,int x,String namt,int IDO,int y,String mobilo,String attendo){
	    Membership SH= null;
	    String gendoo;
	 
	    if ( y==1)gendoo = "Male" ;
	    else if (y==2) gendoo = "Female";
	     else  {System.out.println("ERROR");
	        return;
	        }
	   
	   
	    if( x == 1 ){
	         SH = new PayG("PayG",2,100);
	    
	}
	   if (x == 2){
	     SH = new Monthly("OM",2,100);
	     
	   }
	    if (x == 3){
	     SH = new Termly("TM",2,100);
	     
	   }
	   
	    
	    for (int j = 0 ; j < members.size(); j ++){
	        if (members.get(j).getID()==i){
	            members.set(j, new Member(namt,IDO, gendoo,mobilo,SH,attendo));
	        }
	    }
	  
	}
	public void addToClass (int id,int y){

	       int indx = 0;
	        for (int  k = 0 ; k < members.size(); k ++){
	            if (members.get(k).getID()==y){
	                break;
	            }
	            indx = indx + 1;
	        }
	       int indx2 = 0;
	        for (int w = 0; w < Classes.size(); w ++){
	            if (Classes.get(w).getID()==id){
	                break;
	            }
	                indx2 = indx2 + 1;
	            
	        }
	    
	   
	    if (    Classes.get(indx2).getB().size() < Classes.get(indx2).getCapacity()){
	          Classes.get(indx2).getB().add(members.get(indx));
	       
	    }   
	    System.out.println(Classes);
	    
	}
	public void deleteFromClass(int id,int y ){
	 
	       int indx2 = 0;
	        for (int w = 0; w < Classes.size(); w ++){
	            if (Classes.get(w).getID()==id){
	                break;
	            }
	                indx2 = indx2 + 1;
	            
	        }
	    
	    classmembers = Classes.get(indx2).getB();
	    classmembers.removeIf(classmembers -> classmembers.getID() == y);
	    System.out.println(Classes);
	    
	     
	}
	public void viewClassMembers (){
	        System.out.println("view class members : ");
	        
	        System.out.println("enter class ID : ");
	        Scanner S = new Scanner (System.in);
	      int x = S.nextInt();
	       int indx2 = 0;
	        for (int w = 0; w < Classes.size(); w ++){
	            if (Classes.get(w).getID()==x){
	                break;
	            }
	                indx2 = indx2 + 1;
	            
	        }
	        
	    classmembers = Classes.get(indx2).getB();
	    System.out.println ("class members :");
	    System.out.println(classmembers);
	}
	public String viewPayGmembers(){
	    for (int i = 0 ;i < members.size(); i++){
	        if(members.get(i).getSH().getName().equals("PayG")){
	    PayGmembers.add(members.get(i));
	            }
	            }
	    return PayGmembers.toString();
	}
	public String viewOMmembers(){
	    for (int i = 0 ;i < members.size(); i++){
	        if(members.get(i).getSH().getName().equals("OM")){
	    OMmembers.add(members.get(i));
	            }
	            }
	    return OMmembers.toString();
	}
	public String viewTMmembers(){
	    for (int i = 0 ;i < members.size(); i++){
	        if(members.get(i).getSH().getName().equals("TM")){
	    TMmembers.add(members.get(i));
	            }
	            }
	    return TMmembers.toString();
	}
	public String viewMemberInfo(int id){
		  
		   for (int j = 0 ; j < members.size(); j++){
		       if(members.get(j).getID()==id){
		           System.out.println("member info : ");
		          return members.get(j).toString();
		       } 
		       
		   }
		    return null;
		}
}

