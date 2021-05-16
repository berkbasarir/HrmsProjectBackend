package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="candidates")
public class Candidate {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;

	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	public Candidate() {

	}
	
	public Candidate(int id, String identificationNumber, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.id = id;
		this.identificationNumber = identificationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	

}
