/**
 * 
 */
package edu.scsu.eps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.scsu.eps.entities.EPSStudent;

/**
 * @author znabd
 * @About Student Repository 
 *
 */
@Repository
public interface EPSStudentRepost extends JpaRepository<EPSStudent, String>{

	

}
