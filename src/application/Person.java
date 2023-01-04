package application;

abstract class Person {
	 private String name ;
	  
	    private String gender;
	    private String phone;
	    private String nationalid ;
	    
	    Person(){
	    }
	    
	  Person (String name,String phone, String gender,String nationalid ){
	    this.name=name;
	    
	     this.gender=gender;
	     this.nationalid=nationalid;
	     this.phone=phone;
	    
	}

	    public String getName() {
	        return name;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public String getNationalid() {
	        return nationalid;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public void setNationalid(String nationalid) {
	        this.nationalid = nationalid;
	    }
	  

	}