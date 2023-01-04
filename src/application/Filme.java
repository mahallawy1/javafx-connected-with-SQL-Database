package application;

public class Filme {

	private String filmname;
	private String country;
	private String released;
	private String language;
	
	private String cid;
	public Filme(String filmname, String country, String released, String language, String cid) {
		this.filmname = filmname;
		this.country = country;
		this.released = released;
		this.language = language;
		this.cid = cid;
	}
	public String getFilmname() {
		return filmname;
	}
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	


}
