/**
 * 
 */
package edu.scsu.eps.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.scsu.eps.entities.EPSCourse;
import edu.scsu.eps.services.EPSCourseService;
import edu.scsu.eps.services.EPSProgramService;

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
	private EPSProgramService epsProgramService;
	
	/*
	
	@GetMapping("/course")
	public String courseForm(Model model) {
	
		model.addAttribute("course", new EPSCourse());
		return "views/courseForm";
	}
	
	@PostMapping("/course")
	public String addCourse(@Valid EPSCourse epsCourse,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "views/courseForm";
		}
		if(epsCourseService.isCourseExist(epsCourse.getCourse_id())) {
			model.addAttribute("exist", true);
			return "views/courseForm";
		}
		epsCourseService.createCourse(epsCourse);
		return "views/added_course";
		
	}
	
	*/
	@GetMapping("/course_lists")
	public String CourseList(Model model, @RequestParam(defaultValue="") String course_id){
		model.addAttribute("courses",epsCourseService.findAll());
		
		return "views/course_lists";
	}
	@GetMapping("/programs")
	public String programList(Model model, @RequestParam(defaultValue="") String program_code){
		model.addAttribute("programs",epsProgramService.findAll());
		
		return "views/programs";
	}
	
}
