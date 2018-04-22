/**
 * 
 */
package edu.scsu.eps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.scsu.eps.entities.EPSProgram;
import edu.scsu.eps.entities.EPSStudent;


/**
 * @author znabd
 * @About Program Repository
 *
 */


public interface EPSProgramRepost extends JpaRepository<EPSProgram, String>{

	@Query
	List<EPSProgram> findByepsStudent(@Param(value="epsStudent")EPSStudent epsStudent);
	
	@Query
	List<EPSProgram> findByProgramCode(String program_code);
	
	





	
	 

}
