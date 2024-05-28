package beans.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StudentAdress")
public class StudentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer address_id;
	@Column
	private String address_details;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student_address", fetch = FetchType.LAZY)
	private Set<StudentData> students = new HashSet<StudentData>(0);

	public StudentAddress(Integer address_id, String address_details, Set<StudentData> students) {
		super();
		this.address_id = address_id;
		this.address_details = address_details;
		this.students = students;
	}

	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public String getAddress_details() {
		return address_details;
	}

	public void setAddress_details(String address_details) {
		this.address_details = address_details;
	}

	public Set<StudentData> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentData> set) {
		this.students = set;
	}

	@Override
	public String toString() {
		return "StudentAddress [address_id=" + address_id + ", address_details=" + address_details + "]";
	}

}
