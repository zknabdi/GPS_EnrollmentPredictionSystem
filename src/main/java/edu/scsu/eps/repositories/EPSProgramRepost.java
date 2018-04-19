/**
 * 
 */
package edu.scsu.eps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.scsu.eps.entities.EPSProgram;

/**
 * @author znabd
 * @About Program Repository
 *
 */
@Component
@Repository
public interface EPSProgramRepost extends JpaRepository<EPSProgram, String>{





	
	 

}
