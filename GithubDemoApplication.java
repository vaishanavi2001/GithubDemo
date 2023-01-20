package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubDemoApplication
{
    @RequestMapping(value="/")
    
	 public String index()
	 {
		 return "<!DOCTYPE html>\n"+
	             "<html>\n"+
				 "<head>\n"+
	             "<title>Page title</title>"+
				 "<body>\n"+
				 "<h1 style=\background-color:blue;\">Hello world</h1>"+
				 "<h2>welcome</h2>"+
				 "</body>"+
				 "</html>";
		         
	             
	 }
	public static void main(String[] args)
	{
		SpringApplication.run(GithubDemoApplication.class, args);
		
	}

}
