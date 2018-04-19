/**
 * 
 */
package edu.scsu.eps.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.scsu.eps.entities.EPSCourse;
import edu.scsu.eps.entities.EPSStudent;
import edu.scsu.eps.repositories.EPSCourserRepost;

/**
 * @author znabd
 *
 */
@Service
public class EPSCourseService {

	@Autowired
	private EPSCourserRepost epsCourserRepost;

	
	
	// return list of course
	public List<EPSCourse> findAll(){
				
			return epsCourserRepost.findAll();
	}

}
