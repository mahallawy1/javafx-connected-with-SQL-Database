package application;

import java.util.ArrayList;



public class Trainer extends Person {
	 private int classesheld=0;
	  private int membersheld=0;
	    private int ID;
	ArrayList<Class> Classes = new ArrayList<Class>();
	ArrayList<Member> Members = new ArrayList<Member>();
	   

	    public Trainer(String name, String phone, String gender, String nationalid,int ID) {
	        
	        super(name, phone, gender, nationalid);
	        this.ID = ID;
	    }

	    @Override
	    public String toString() {
	        return "name : " + super.getName()+" Phone : "+super.getPhone() + " Gender : " + super.getGender()+" NationalID :"+super.getNationalid()+" ID : " + this.ID +" membersheld : " + membersheld + " classesheld : " + classesheld;
	    }  
	    

	  //


	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public ArrayList<Class> getClasses() {
	        return Classes;
	    }

	    public void setClasses(ArrayList<Class> Classes) {
	        this.Classes = Classes;
	    }



	    @Override
	    public void setNationalid(String nationalid) {
	        super.setNationalid(nationalid); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	    }

	    @Override
	    public void setPhone(String phone) {
	        super.setPhone(phone); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	    }

	    @Override
	    public void setGender(String gender) {
	        super.setGender(gender); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	    }

	    @Override
	    public void setName(String name) {
	        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	    }
	    public void incClassesheld(){
	        classesheld = classesheld + 1;
	    }
	    
	    public void increaseMembersHeld (int number){
	        membersheld = membersheld + number;
	    }
	     public int getID() {
	        return ID;
	    }
	}

