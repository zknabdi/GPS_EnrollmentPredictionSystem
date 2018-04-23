/**
 * 
 */
package edu.scsu.eps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.scsu.eps.services.EPSCourseService;
import edu.scsu.eps.services.EPSProgramService;
import edu.scsu.eps.services.EPSStudentService;

/**
 * @author znabd
 *
 */
@Controller
public class EPSCourseController {

	/*
	 *  Check if the cours alreayd in the system
	 */
	@Autowired
	private EPSCourseService epsCourseService;
	
	@Autowired
	private EPSStudentService epsStudentService;
	
	@Autowired
	private EPSProgramService epsProgramService;
	


	@GetMapping("/course_lists")
	public String CourseList(Model model, @RequestParam(defaultValue="") String course_id){
		model.addAttribute("courses",epsCourseService.findAll());
		
		return "views/course_lists";
	}
	@GetMapping("/programs")
	public String programList(Model model, @RequestParam(defaultValue="") String program_code){
		
		model.addAttribute("programs",epsProgramService.findAll());
		model.addAttribute("studentID", epsStudentService.findOne(program_code));
		model.addAttribute("count", countByStudent());
		
		
		return "views/programs";
	}
	

	public long countByStudent() {
		
		return epsStudentService.countAll();
	}
	
	
	
}
