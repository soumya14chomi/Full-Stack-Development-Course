package beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {

	@Id
	private Integer lid;
	private String lname;
	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "rollNo")
	private Student student;

	public Laptop(Integer lid, String lname, Student student) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	}

}
