package comm.example.Rest.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.internal.bind.v2.TODO;

import comm.example.Rest.domain.ToDo;

@RestController
@RequestMapping("/api")
public class MyController {

	public List<ToDo> list=null;
	
	@PostConstruct
	public void init()
	{
		list=new ArrayList<ToDo>();
	}
	
	@GetMapping("/todos")
	public List<ToDo> gettodo_details()
	{
		list.add(new ToDo("The current date is:",new Date()));
		list.add(new ToDo("The current date is:",new Date()));
		return list;
	}
	
}
