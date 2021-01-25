package spring;

import java.time.LocalDateTime;

public class Member {
	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	public Member(String email,String password,String name,LocalDateTime 
			regDateTime) {
		this.email=email;
		this.password=password;
		this.name=name;
		this.registerDateTime=regDateTime;
	}
	
	void setId(Long id) {
		this.id=id;
	}
	
	Long getId() {
		return id;
	}
	
	String getEmail() {
		return email;
	}
	
	String getPassword() {
		return password;
	}
	
	String getName() {
		return name;
	}
	
	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	
	public void changePassword(String oldPassword,String newPassword) {
		if(!oldPassword.equals(password)) 
			throw new WrongIdPasswordException();
		else
			this.password=newPassword; 
		
		
		this.password=newPassword;
	}
	
	
}
