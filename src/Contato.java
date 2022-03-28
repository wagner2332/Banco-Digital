
public class Contato {
	public String email;
	public String tel;
	public String linkedin;
	
	public String getemail(){
		email = "wagner_silva2332@hotmail.com";
		return email;
	}
	public String gettel() {
		tel = "(81)98619-2880";
		return tel;
	}
	public String getlinkedin() {
		linkedin = "https://www.linkedin.com/in/wagner-wilson-/";
		return linkedin;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void settel(String tel) {
		this.tel = tel;
	}
	public void setlinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
}
