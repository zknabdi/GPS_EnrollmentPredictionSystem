/**
 * 
 */
package edu.scsu.eps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.scsu.eps.entities.EPSCourse;

/**
 * @author Course Repositories
 *
 */
@Repository
public interface EPSCourserRepost extends JpaRepository<EPSCourse, String>{


	//List<EPSCourse> findbyCourseID(String course_id);
	
}
