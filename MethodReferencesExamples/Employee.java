package MethodReferencesExamples;

public class Employee {
	private String name;
	private Integer age;
	private String dept;
	private Integer salary;

	public Employee(String name, Integer age, String dept, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
