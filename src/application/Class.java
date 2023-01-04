package application;

import java.util.ArrayList;


public class Class {
	  private int capacity;
	    private int ID;
	    private String classdate;
	    
	    private Trainer trainer;
	    ArrayList<Member> b = new ArrayList<Member>();

	    public Class(int capacity, int id, String classdate) {
	        this.capacity = capacity;
	        this.ID = id;
	        this.classdate = classdate;
	        
	    }

	    public int getCapacity() {
	        return capacity;
	    }

	    public int getID() {
	        return ID;
	    }

	    public String getClassdate() {
	        return classdate;
	    }


	    public ArrayList<Member> getB() {
	        return b;
	    }

	    public void setCapacity(int capacity) {
	        this.capacity = capacity;
	    }

	    public void setID(int id) {
	        this.ID= id;
	    }

	    public void setClassdate(String classdate) {
	        this.classdate = classdate;
	    }

	  
	    public void setB(ArrayList<Member> b) {
	        this.b = b;
	    }

	    public Trainer getTrainer() {
	        return trainer;
	    }

	    public void setTrainer(Trainer trainer) {
	        this.trainer = trainer;
	    }

	 
	 

	   

	    @Override
	    public String toString() {
	        return "Class{" + "capacity=" + capacity + ", id=" + ID + ", classdate=" + classdate + ", b=" + b + ", Trainer : "+ trainer+ '}';
	    }

	   

    
}