package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Calc2
{
@GetMapping("Calc/{op}/{a}{b}")

	int Calculation( @PathVariable String op , @PathVariable int a ,@PathVariable int b) 
	{
		if(op=="add")	
		{
			
			return a+b ;
		}
		if(op=="sub") {
			return a-b;
		}
		if(op=="div")
		{
			return a/b;
					
		}
		if(op=="mul")
		{
			return a*b;
		}
		return 0;
	}
}
