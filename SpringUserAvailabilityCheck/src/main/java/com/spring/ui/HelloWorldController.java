package com.spring.ui;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController { 
	
	@Autowired(required=true)
	Config c;
	
    public void setC(Config c) {
		this.c = c;
	}

	public Config getC() {
		return c;
	}

	@RequestMapping(value="/hello")
    public @ResponseBody Status hello(@RequestParam("name") String name, HttpServletRequest request,HttpServletResponse response) throws IOException  {
		Status s=new Status();
			System.out.println("Name Request Param    :     "+name);
        boolean flag=c.hi(name);
        s.setStatus(flag);
        System.out.println("Flag   :  "+flag);
		return s;
    }
    
    @RequestMapping("/hi")
    public String hi() {
       System.out.println("................");
        return "helloworld";
    }

}



class Status{
	private boolean status;

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
}