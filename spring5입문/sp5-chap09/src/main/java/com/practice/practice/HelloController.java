package com.practice.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */

//spring mvc���� controller�� ó���� Ŭ������ @Controller�� �پ�� �Ѵ�.
//���� @GetMapping,@RequestMapping ���� ������ ó���� ��θ� ��������� �Ѵ�.
@Controller
public class HelloController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
	//ó���� ��û ��θ� ����. ���⼱ "/hello" ��η� ���� ��û�� hello() �޼��带 �̿��ؼ� ó��.
	//@GetMapping("/hello")
	//model parameter�� ��Ʈ�ѷ��� ó�� ����� view�� ������ �� ���.
	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello(Model model,@RequestParam(value="name",required=false)String name) {
		model.addAttribute("greeting","hello"+name);
		return "hello";
	}
	
}
