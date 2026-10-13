package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc 
{

	@GetMapping("Calc/add/{a}/{b}")
	int add(@PathVariable int a , @PathVariable int b)
	{
		
		return a+b;
	}
	@GetMapping("calc/sub/{a}/{b}")
	int sub(@PathVariable int a,@PathVariable int b)
	{
		 
		return a-b;
		
	}

	@GetMapping("Calc/mul/{a}{b}")
	int mul(@PathVariable int a, @PathVariable int b)
	{
		return a*b;
	}
	
} 
