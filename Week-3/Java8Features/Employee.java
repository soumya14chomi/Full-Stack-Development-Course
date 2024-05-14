package Java8Features;

public class Employee {
	private Integer id;
	private String name;
	private String dept;
	private Float salary;
	private String address;

	public Employee(int id, String name, String dept, Float salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", address="
				+ address + "]";
	}
}
