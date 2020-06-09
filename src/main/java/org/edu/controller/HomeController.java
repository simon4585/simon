package org.edu.controller;

 

import java.text.DateFormat;

import java.util.Date;

import java.util.Locale;

 

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

 

/**

 * Handles requests for the application home page.

 */

@Controller

public class HomeController {

	

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	

	/**

	 * we are 페이지 파일 입니다.

	 */

	@RequestMapping(value = "/sample/weare", method = RequestMethod.GET)

	public String weare(Locale locale, Model model) {

		

		return "sample/weare";

	}

	/**

	 * WORK 페이지 파일 입니다.

	 */

	@RequestMapping(value = "/sample/work", method = RequestMethod.GET)

	public String work(Locale locale, Model model) {

		

		return "sample/work";

	}

	/**

	 * BLOG 페이지 파일 입니다.

	 */

	@RequestMapping(value = "/sample/blog", method = RequestMethod.GET)

	public String blog(Locale locale, Model model) {

		

		return "sample/blog";

	}

	/**

	 * CONTACT US 페이지 파일 입니다.

	 */

	@RequestMapping(value = "/sample/contactus", method = RequestMethod.GET)

	public String contactus(Locale locale, Model model) {

		

		return "sample/contactus";

	}

	/**

	 * HTML 페이지 파일 입니다.

	 */

	@RequestMapping(value = "/sample/htmltest", method = RequestMethod.GET)

	public String htmltest(Locale locale, Model model) {

		

		return "sample/htmltest";

	}

	

	/**

	   slide 페이지 파일 입니다.

	 */

	@RequestMapping(value = "/sample/slide", method = RequestMethod.GET)

	public String slide(Locale locale, Model model) {

		

		return "sample/slide";

	}

	/**

	   sample 파일 홈 입니다.

	 */

	@RequestMapping(value = "/sample/", method = RequestMethod.GET)

	public String sample(Locale locale, Model model) {

		

		return "sample/home";

	}

	

	/**

	 * Simply selects the home view to render by returning its name.

	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);

		

		Date date = new Date();

		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		

		String formattedDate = dateFormat.format(date);

		

		model.addAttribute("serverTime", formattedDate );

		

		return "home";

	}

	

}