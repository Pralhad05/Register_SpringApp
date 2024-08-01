package Register_Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Data")
public class UserDtl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "Name")
    private String fname;
	
	@Column(name = "Gender")
    private String gender;
	
	@Column(name = "DOB")
    private String dob;
	
	@Column(name = "Address")
    private String address;
	
	@Column(name = "Email")
    private String email;
	
	@Column(name = "Password")
    private String pass;
    
    @Override
	public String toString() {
		return "UserDtl [id=" + id + ", fname=" + fname + ", gender=" + gender + ", dob=" + dob + ", address=" + address
				+ ", email=" + email + ", pass=" + pass + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
