/*package com.maxdev.sn.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    @RequestMapping(value = "/")
    public String index(){
        return "redirect:/logon";
    }
   @RequestMapping(value = "")
   public  String home(){
        return "redirect:/logon";
   }
   @RequestMapping(value = "/logon")
   public String logon(ModelMap map,HttpServletRequest req,HttpServletResponse res){
        //Methode1:Recuperation du username == email(ou principal)
       String user=req.getRemoteUser();//Email
       System.out.println("principal is: "+ user);
       //Methode2 :recuperation du username(ou principal)
       /*String name= SecurityContextHolder.getContext().getAuthentication().getName();
       System.out.println("principal is:" + name);*/
       /*if(user!=null)
           return "accueil";
       else
           return  "redirect:/login";


   }
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value="/logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth= SecurityContextHolder.getContext().getAuthentication();
        if(auth!=null){
            new SecurityContextLogoutHandler().logout(request,response,auth);
        }
        return  "redirect:/login?logout";
    }

    @RequestMapping(value = "/Admin/403")
    public String denied(){
        return "403";
    }
}*/
