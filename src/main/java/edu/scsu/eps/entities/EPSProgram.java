/**
 * 
 */
package edu.scsu.eps.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author znabd
 *
 */
@Entity
public class EPSProgram {
	@Id
	@Column(unique=true)
	private String programCode;
	@NotEmpty
	private String program_name;
	private String program_type;
	@OneToMany(mappedBy="epsProgram")
	private List<EPSStudent> epsStudent;
	/**
	 * @param programCode
	 * @param program_name
	 * @param program_type
	 * @param epsStudent
	 */
	public EPSProgram(String programCode, String program_name, String program_type, List<EPSStudent> epsStudent) {
		this.programCode = programCode;
		this.program_name = program_name;
		this.program_type = program_type;
		this.epsStudent = epsStudent;
	}
	
	
	
	
	/**
	 * @param programCode
	 * @param program_name
	 * @param program_type
	 */
	public EPSProgram(String programCode, String program_name, String program_type) {
		this.programCode = programCode;
		this.program_name = program_name;
		this.program_type = program_type;
	}




	/**
	 * @return the programCode
	 */
	public String getProgram_code() {
		return programCode;
	}
	/**
	 * @param programCode the programCode to set
	 */
	public void setProgram_code(String programCode) {
		this.programCode = programCode;
	}
	/**
	 * @return the program_name
	 */
	public String getProgram_name() {
		return program_name;
	}
	/**
	 * @param program_name the program_name to set
	 */
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	/**
	 * @return the program_type
	 */
	public String getProgram_type() {
		return program_type;
	}
	/**
	 * @param program_type the program_type to set
	 */
	public void setProgram_type(String program_type) {
		this.program_type = program_type;
	}
	/**
	 * @return the epsStudent
	 */
	public List<EPSStudent> getEpsStudent() {
		return epsStudent;
	}
	/**
	 * @param epsStudent the epsStudent to set
	 */
	public void setEpsStudent(List<EPSStudent> epsStudent) {
		this.epsStudent = epsStudent;
	}
	/**
	 * 
	 */
	public EPSProgram() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EPSProgram [programCode=" + programCode + ", program_name=" + program_name + ", program_type="
				+ program_type + ", epsStudent=" + epsStudent + "]";
	}
	
	
	
}
