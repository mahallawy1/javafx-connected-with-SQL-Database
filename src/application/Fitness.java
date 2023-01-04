package application;

import java.util.ArrayList;



public class Fitness extends Class {
    
	 public Fitness(int capacity, int id, String classdate) {
	        super(capacity, id, classdate);
	    }

	    public ArrayList<Member> getB() {
	        return b;
	    }

	    public void setB(ArrayList<Member> b) {
	        this.b = b;
	    }

	    @Override
	    public String toString() {
	        return "Class{" + "capacity=" + super.getCapacity() + ", id=" + super.getID() + ", classdate=" + super.getClassdate() + ", classtype= Fitness"   + ", Trainer : "+ super.getTrainer()+ '}'+", class members :"+ super.b+'}';
	    }
    
}
