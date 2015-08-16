package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
//@RequestMapping("/hello")
@RequestMapping("/")
public class HelloController{
 
//   @RequestMapping(method = RequestMethod.GET)
//   public String printHello(ModelMap model) {
//      model.addAttribute("message", "Hi Spring MVC Framework!");
//      return "hello";
//   }
	@RequestMapping(method = RequestMethod.GET)
	public String display(ModelMap model)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("example.xml");
	    example e = (example) context.getBean("eg");
		System.out.println(e.getPrefix());
		System.out.println(e.getSuffix());
		model.addAttribute("message", "Hi Spring MVC Framework here :)!");
		return "hello";
		//return "hi";
	}
}