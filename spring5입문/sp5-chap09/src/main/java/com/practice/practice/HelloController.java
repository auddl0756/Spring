package com.practice.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */

//spring mvc에서 controller로 처리될 클래스는 @Controller가 붙어야 한다.
//또한 @GetMapping,@RequestMapping 같은 것으로 처리할 경로를 지정해줘야 한다.
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
	
	//처리할 요청 경로를 지정. 여기선 "/hello" 경로로 들어온 요청을 hello() 메서드를 이용해서 처리.
	//@GetMapping("/hello")
	//model parameter는 컨트롤러의 처리 결과를 view에 전달할 때 사용.
	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	//@RequestMapping(value="/hello",method=RequestMethod.GET)
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello(Model model,@RequestParam(value="name",required=false)String name) {
		model.addAttribute("greeting","hello"+name);
		return "hello";
	}
	
}
