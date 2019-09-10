package springMvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(method=RequestMethod.GET,name="/showview")
	public String hello_student()
	{
		return "hello_student";
	}
//	@RequestMapping(method = RequestMethod.POST,name="processStudent")
//	public String Student_display()
//	{
//		return "student_display";
//	}
	@RequestMapping(method=RequestMethod.POST,name="processStudentUpper")
	public String Student_display_Uppercase(HttpServletRequest req, Model themodel) 
	{
		String name="Hi "+(req.getParameter("name")).toUpperCase();
		themodel.addAttribute("M",name);
		return "student_display";
	}
}
