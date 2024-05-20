package reactiveProgramming;

public class User {
	
	private Integer id;
	private String lastName;
	private String FirstName;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String lastName, String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		FirstName = firstName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", lastName=" + lastName + ", FirstName=" + FirstName + "]";
	}
	

}
