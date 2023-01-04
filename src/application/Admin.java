package application;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;


 class admin extends Person {
    
	static ArrayList<Member> classmembers = new ArrayList<Member>();
	 static ArrayList<Member> PayGmembers = new ArrayList<Member>();
	 static ArrayList<Member> TMmembers = new ArrayList<Member>();
	 static ArrayList<Member> OMmembers = new ArrayList<Member>();
	 
	 
	 private static int idofmembers;
	 private static int idoftrainers;
	 private static int idofclasses;
	  static  ArrayList<Member> members = new ArrayList<Member>();
	    private String ID;
	    
	  static   ArrayList<Trainer> Trainers = new ArrayList<Trainer>();
	static ArrayList<Class> Classes = new ArrayList<Class>();
	    public admin(String name, String phone, String gender, String nationalid,String ID) {
	        super(name, phone, gender, nationalid);
	        this.ID = ID;
	    }
	    public admin(){
	        
	    }
	    
	 public void addTrainer (int j,String name,String phonee,String Nationalid){
	      
	    
	         
	        String gendero;
	      
	        if (j==1){  gendero = "Male";}
	       else if(j==2) gendero = "Female";
	        else {System.out.println("ERROR");
	        return;
	        }
	      
	       
	         idoftrainers = idoftrainers+1;
	      
	        
	        Trainers.add(new Trainer (name,phonee,gendero,Nationalid,idoftrainers));
	        System.out.println(Trainers);
	        
	    }
	    public void deleteTrainer(int x){
	        
	        
	        
	        Trainers.removeIf(Trainers ->Trainers.getID() == x);
	        System.out.println(Trainers);
	                
	    }
	    public void editTrainer(int x,String name,int ID,int y, String nationalid,String phone){
	        String Gender ;
	       
	        if (x==1) Gender = "Male";
	        else if (x==2) Gender = "Female";
	        else  {System.out.println("ERROR");
	        return;
	        }
	     
	        for (int i = 0 ; i < Trainers.size();  i ++){
	           
	          if(  Trainers.get(i).getID()==y){
	              Trainers.get(i).setName(name);
	              Trainers.get(i).setID(ID);
	              Trainers.get(i).setGender(Gender);
	              Trainers.get(i).setNationalid(nationalid);
	              Trainers.get(i).setPhone(phone);
	          }
	        }
	      
	   System.out.println(Trainers);
	    }

	    public ArrayList<Class> getClasses() {
	        return Classes;
	    }
	    public void openClass(int y , int x , String classdate){
	        idofclasses=idofclasses+1;

	       if (x==1){ 
	       Classes.add( new Yoga( y,  idofclasses, classdate));
	       }
	       if (x==2){
	           Classes.add(new Fitness( y , idofclasses, classdate));
	       }
	      System.out.println(Classes);
	    }
	    public void deleteClass(int ID){
	       
	        
	    Classes.removeIf(Classes ->Classes.getID()== ID);
	    System.out.println(Classes);
	    }
	    public void editClass(int x,int y,int Capacity,int ID, String classdate){
	      
	      
	        for (int i = 0 ; i < Classes.size();  i ++){
	           
	          if(  Classes.get(i).getID()==x){
	              if (y==1){Classes.set(i,new Yoga (Capacity,ID,classdate));}
	              if (y==2){Classes.set(i, new Fitness(Capacity,ID,classdate));}
	              
	              
	            
	          }
	        }
	        System.out.println(Classes);
	        
	    }
	    public String assignTrainerToClass(int ID,int TrainerID ){
	       
	        int indx = 0;
	        for (int  k = 0 ; k < Trainers.size(); k ++){
	            if (Trainers.get(k).getID()==TrainerID){
	                break;
	            }
	            indx = indx + 1;
	        }
	        int indx2 = 0;
	        for (int w = 0; w < Classes.size(); w ++){
	            if (Classes.get(w).getID()==ID){
	                break;
	            }
	                indx2 = indx2 + 1;
	            
	        }
	       for (int i = 0 ; i < Classes.size(); i++){
	           if (Classes.get(i).getID()==ID){
	               for (int j = 0 ; j < Classes.size();j++){
	                   if (j==i)continue;
	                    if (Classes.get(i).getClassdate().equals(Classes.get(j).getClassdate()) && Classes.get(j).getTrainer()==Trainers.get(indx) )return "trainer isn't free";
	                   
	                   
	               }
	               Classes.get(i).setTrainer(Trainers.get(indx));
	               Trainers.get(indx).incClassesheld();
	               Trainers.get(indx).increaseMembersHeld(Classes.get(indx2).getCapacity());
	                System.out.println(Classes);
	           }
	         
	         
	       }
	       
	       
	       return "assigned";
	    }
	    public String viewMembersInfo(){
	    
	  return members.toString();
	    }
	    public String viewClassMembers (int x){
	        
		       int indx2 = 0;
		        for (int w = 0; w < Classes.size(); w ++){
		            if (Classes.get(w).getID()==x){
		                break;
		            }
		                indx2 = indx2 + 1;
		            
		        }
		        
		    classmembers = Classes.get(indx2).getB();
		    
		    return classmembers.toString();
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
	public void assignTrainerToMember(int ID,int TrainerID){

	        int indx2 = 0;
	        for (int w = 0; w < Trainers.size(); w ++){
	            if (Trainers.get(w).getID()==TrainerID){
	                break;
	            }
	                indx2 = indx2 + 1;
	            
	        }
	    for (int i = 0 ; i < members.size() ; i++){
	        if( members.get(i).getID() == ID){
	            members.get(i).setTrainer(Trainers.get(indx2));
	        }
	    }
	    System.out.println("assigned");
	    
	    
	}
	public String viewTrainersInfo(){
	    System.out.println(Trainers);
	    return Trainers.toString();
		}

	}