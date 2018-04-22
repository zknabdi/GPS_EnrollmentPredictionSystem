/**
 * 
 */
package edu.scsu.eps.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.scsu.eps.entities.EPSCourse;
import edu.scsu.eps.entities.EPSProgram;
import edu.scsu.eps.entities.EPSStudent;
import edu.scsu.eps.repositories.EPSStudentRepost;

/**
 * @author znabd
 *
 */
@Service
public class EPSStudentService {

	@Autowired
	private EPSStudentRepost epsStudentRepository;
	
	
	public void createStudent(EPSStudent epsStudent) {
		EPSCourse epsCourse = new EPSCourse();
		List<EPSCourse> courses = new ArrayList<>();
		courses.add(epsCourse);
		epsStudent.setEpsCourse(courses);
		epsStudentRepository.save(epsStudent);
	}
	public EPSStudent findOne(String techID) {
		return epsStudentRepository.findOne(techID);
	}
	
	public List<EPSStudent> findAll(){
		return epsStudentRepository.findAll();
	}
	
	public List<EPSStudent> findByTechID(String techID){
		return epsStudentRepository.findByTechID(techID);
	}
	
	public long countByProgram(String programCode){
		return epsStudentRepository.countByepsProgram(programCode);
	}
	
}
