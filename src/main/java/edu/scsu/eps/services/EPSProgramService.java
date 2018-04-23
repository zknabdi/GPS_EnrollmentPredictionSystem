/**
 * 
 */
package edu.scsu.eps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.scsu.eps.entities.EPSProgram;
import edu.scsu.eps.entities.EPSStudent;
import edu.scsu.eps.repositories.EPSProgramRepost;

/**
 * @author znabd
 *
 */
@Service
public class EPSProgramService {
	
	@Autowired
	private EPSProgramRepost epsProgramRepository;
	
	public void addStudent(EPSProgram program, List<EPSStudent> epsStudent) {
		
		program.setEpsStudent(epsStudent);
		
		epsProgramRepository.save(program);
		
		
	}
	public List<EPSProgram> findStudentProgram(EPSStudent program_code){
		return epsProgramRepository.findByepsStudent(program_code);
	}
	public List<EPSProgram> findAll(){
		return epsProgramRepository.findAll();
	}
}
