package com.spring.saas.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.saas.model.Status;


@Controller
@RequestMapping(value="/usermanagement")
public class UserController {
	
	
	@RequestMapping(value="/register")
	public String createUser(){
		System.out.println("Welcome to usermanagement...........");
		return "usermanagement/register";
	}
	
	@RequestMapping(value="/availablityCheck")
    public @ResponseBody Status hello(@RequestParam("name") String name) throws IOException, InterruptedException  {
		Status s=new Status();		
		System.out.println("Name Request Param    :     "+name);
        boolean flag=hi(name);
        s.setStatus(flag);
        Thread.currentThread().sleep(10000);
        System.out.println("Flag   :  "+flag);
        System.out.println(s.isStatus());
		return s;
    }
	
	public boolean hi(String name){
		 ArrayList list =new ArrayList();
		   list.add("siva");
		   list.add("sankar");
		   list.add("naresh");
		   list.add("vadlamani");
		   list.add("rama");
		   list.add("Hajarathaiah");
		   list.add("Dora");
 
 System.out.println("Name     :    "+name);
 
 System.out.println(".....................");
 return list.contains(name);
	}
}
