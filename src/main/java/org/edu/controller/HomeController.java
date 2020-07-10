package org.edu.controller;

import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.edu.service.IF_MemberService;
import org.edu.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
	@Inject
	private IF_MemberService memberService;
	
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
   
   
   /**
    * 스프링 시큐리티 secutiry-context.xml 설정한 로그인 처리 결과 화면
    * @param locale
    * @param request
    * @param rdat
    * @return
 * @throws Exception 
    */
   @RequestMapping(value = "/login_success", method = RequestMethod.GET)
   public String login_success(Locale locale,HttpServletRequest request, RedirectAttributes rdat) throws Exception {
      logger.info("Welcome login_success! The client locale is {}.", locale);
      Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
     
      String levels = "";//ROLE_ANONYMOUS
      Boolean enabled = false;
      String userid = "";//아이디 출력
      Object principal = authentication.getPrincipal();
      if (principal instanceof UserDetails) {
    	  //인증이 처리되는 로직(아이디,암호를 스프링시큐리티 던져주고 인증은 쿼리를 통해서 인증)
         enabled = ((UserDetails)principal).isEnabled();
      }
      HttpSession session = request.getSession();//세션을 초기화 시켜줌
      if (enabled) {//인증처리가 완료된 사용자의 권한체크(아래)
         Collection<? extends GrantedAuthority>  authorities = authentication.getAuthorities();
         if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_ANONYMOUS")).findAny().isPresent())
         {levels = "ROLE_ANONYMOUS";}
         if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_USER,")).findAny().isPresent())
         {levels = "ROLE_USER,";}
         if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_ADMIN")).findAny().isPresent())
         {levels = "ROLE_ADMIN";}
         userid =((UserDetails)principal).getUsername();
         //로그인 세션 저장
         session.setAttribute("session_enabled", enabled);//인증확인
         session.setAttribute("session_userid", userid);//사용자
         session.setAttribute("session_levels", levels);//사용자권한
         //=============상단은 스피링시큐리티에서 기본제공 세션 변수처리
         //=============하단은 우리가 추가하는 세션 변수처리
         //회원이름 구하기추가
         String username = "";//이름
         MemberVO memberVO = memberService.viewMember(userid);
         session.setAttribute("session_username", memberVO.getUser_name());//사용자명
           }
      rdat.addFlashAttribute("msg", "로그인");//result 데이터를 숨겨서 전송
      return "redirect:/";//새로고침 자동 등록 방지를 위해서 아래처럼 처리
   }
   
   /**
    * 로그인 페이지 파일 입니다.
    */
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login(Locale locale, Model model) {
      
      return "login";
   }
   
  
   
   /**
    * work 테스트용 파일 입니다.
    */
   @RequestMapping(value = "/sample/work", method = RequestMethod.GET)
   public String work(Locale locale, Model model) {
      
      return "sample/work";
   }
   /**
    * we are 테스트용 파일 입니다.
    */
   @RequestMapping(value = "/sample/weare", method = RequestMethod.GET)
   public String weare(Locale locale, Model model) {
      
      return "sample/weare";
   }
   
   /**
    * blog 테스트용 파일 입니다.
    */
   @RequestMapping(value = "/sample/blog", method = RequestMethod.GET)
   public String blog(Locale locale, Model model) {
      
      return "sample/blog";
   }
   /**
    * contact us 테스트용 파일 입니다.
    */
   @RequestMapping(value = "/sample/contactus", method = RequestMethod.GET)
   public String contactus(Locale locale, Model model) {
      
      return "sample/contactus";
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
   /**
    * 슬라이드 페이지 파일 입니다.
    */
   @RequestMapping(value = "/sample/slide", method = RequestMethod.GET)
   public String slide(Locale locale, Model model) {
      
      return "sample/slide";
   }
   /**
    * 샘플 파일 홈 입니다.
    */
   @RequestMapping(value = "/sample", method = RequestMethod.GET)
   public String sample(Locale locale, Model model) {
      
      return "sample/home";
   }
}