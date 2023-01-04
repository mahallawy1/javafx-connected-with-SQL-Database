package application;

public class Membership {
	 private String name;
	    private int ID;
	    private int numofmember;
	    
	   public Membership(){
	      
	       
	       
	   }
	   public Membership(String name, int ID ,int numofmember){
	       this.name=name;
	       this.ID=ID;
	       this.numofmember=numofmember;
	       
	   }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getID() {
	        return ID;
	    }
	}