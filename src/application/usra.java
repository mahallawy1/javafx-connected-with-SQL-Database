package application;

public class usra {
	private String usrid;
	private String interest;
	private String usercountry;
	private String watched;
	private String age;
	private String nor;
	private String fwatched;
	public usra(String usrid, String interest, String usercountry, String watched, String age, String nor,
			String fwatched) {
		this.usrid = usrid;
		this.interest = interest;
		this.usercountry = usercountry;
		this.watched = watched;
		this.age = age;
		this.nor = nor;
		this.fwatched = fwatched;
	}
	
	public String getUsrid() {
		return usrid;
	}
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getUsercountry() {
		return usercountry;
	}
	public void setUsercountry(String usercountry) {
		this.usercountry = usercountry;
	}
	public String getWatched() {
		return watched;
	}
	public void setWatched(String watched) {
		this.watched = watched;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNor() {
		return nor;
	}
	public void setNor(String nor) {
		this.nor = nor;
	}
	public String getFwatched() {
		return fwatched;
	}
	public void setFwatched(String fwatched) {
		this.fwatched = fwatched;
	}

	
	
}
