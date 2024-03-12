
public class User {
	private String username;
	private String password;
	private String fullName;
	private int age;
	
	User(String username,String password, String fullName, int age){
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.age = age;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setFullName(String newFullName) {
		this.fullName = newFullName;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return "Your username is " + this.username +  ".Your full name is " + this.fullName + ".Your age is " + this.age + ".";
	}
	
	public boolean equals(User user) {
		if(user.getUsername() == this.getUsername()) {
			return true;
		}
		if(user.getFullName() == this.getFullName()) {
			return true;
		}
		if(user.getPassword() == this.getPassword()) {
			return true;
		}
		if(user.getAge() == this.getAge()) {
			return true;
		}
		else 
			return false;
	}
	
}
