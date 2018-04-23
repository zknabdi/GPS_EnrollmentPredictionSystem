/**
 * 
 */
package edu.scsu.eps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.scsu.eps.entities.EPSCourse;

/**
 * @author Course Repositories
 *
 */

public interface EPSCourserRepost extends JpaRepository<EPSCourse, String>{


//	List<EPSCourse> findByCourse_id(String course_id);
	
}
