package com.cjc.Springboot_through_SpringInitilizer.controller;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.Springboot_through_SpringInitilizer.model.Student;

@Controller
public class HomeController {
	List<Student> slist=new CopyOnWriteArrayList<>();


	@RequestMapping("/h")
	public String preload()
	{
		return "Home";
	}
	@RequestMapping("/r")
	public String register()
	{
		return "Register";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String success(@ModelAttribute Student s)
	{
		System.out.println(s);
		slist.add(s);
		return "Home";
	}
	@RequestMapping("/s")
	public String get(Model m)
	{
		m.addAttribute("ad",slist);
		return "View";
	}
	@RequestMapping("/home")
	public String back()
	{
		return "Home";
	}
	@RequestMapping("/delete")
	public String deletedata(@RequestParam int id,Model m)
	{
		for(Student s:slist)
		{
			if(s.getId()==id)
			{
				int i=slist.indexOf(s);
				slist.remove(i);
			}
			
		}
		m.addAttribute("ad",slist);
		return "View";
		
	}
	@RequestMapping(value="/edit")
	public String editStudent(@RequestParam int id,Model m)
	{
		Student s1=new Student();
		for(Student s:slist)
		{
			if(s.getId()==id)
			{
				s1=s;
				
			}
			
		}
		
		m.addAttribute("stu", s1);
		return "Edit";
	}
	@RequestMapping(value="/update")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{
		 for(Student ss:slist)		
	        {
	        	if(ss.getId()==s.getId())
	        	{
	        	int i=slist.indexOf(ss)	;
	        	slist.set(i, s);
	        	}
	        }
		
		m.addAttribute("ad", slist);
		return "View";
	}
       System.out.println("Git practice");
	
}
