package com.spring.ui;  
  
import java.util.ArrayList;

import org.springframework.stereotype.Service;
  
@Service
public class Config {  
		
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
