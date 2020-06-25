package org.edu.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

   /**
    * 관리자 홈 입니다.
    */
   @RequestMapping(value = "/admin/member/list", method = RequestMethod.GET)
   public String memberList(Locale locale, Model model) {//Local=다국어지원,Model=데이터베이스와연동
      
      return "admin/member/list";
   }
   
   /**
    * 게시물관리 리스트 입니다. 
    */
   @RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)
   public String boardList(Locale locale, Model model) {//Local=다국어지원,Model=데이터베이스와연동
      
      return "admin/board/list";
   }
   
   /**
    * 회원관리 리스트 입니다.
    */
   @RequestMapping(value = "/admin", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {//Local=다국어지원,Model=데이터베이스와연동
      
      return "admin/home";
   }
}