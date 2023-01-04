package application;



public class Member {
	private String name;
    private int ID;
    private String gender;
    private String mobile;
    private String membershiptype;
    private String attended;
    private Trainer t;
    private Membership SH;
    Member(){
    	
    }
    
    Member(String name,int ID,String gender,String mobile,Membership HTYPE,String attended)
    {
        this.name=name;
        this.ID=ID;
        this.gender=gender;
        this.mobile=mobile;
        this.SH =HTYPE;
        this.attended=attended;
        
    }
   

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getMembershiptype() {
        return membershiptype;
    }

    public String getAttended() {
        return attended;
    }

    public Trainer getT() {
        return t;
    }

    public void setTrainer(Trainer t) {
        this.t = t;
    }

    public void setSH(Membership SH) {
        this.SH = SH;
    }

    public Membership getSH() {
        return SH;
    }
    

public String toString(){
    return "name : "+ name+" ID : "+ID+" gender : "+gender+" Mobile : "+mobile+" Membershiptype: "+SH.getName()+" Attended : "+attended  ;
}

 
        

    
 
        

    
}