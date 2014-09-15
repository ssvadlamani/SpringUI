package com.spring.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        c.hi();
        return "helloworld";
    }
    
    @RequestMapping("/hi")
    public String hi() {
       System.out.println("................");
        return "helloworld";
    }

}
