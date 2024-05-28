package beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	private Integer rollNo;
	private String stuName;
	private Integer marks;

	@OneToOne(targetEntity = Laptop.class, cascade = CascadeType.ALL)
	private Laptop laptop;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer rollNo, String stuName, Integer marks, Laptop laptop) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.marks = marks;
		this.laptop = laptop;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", marks=" + marks + ", laptop=" + laptop + "]";
	}

}
