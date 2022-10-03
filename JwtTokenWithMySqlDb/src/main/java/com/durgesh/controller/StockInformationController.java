package com.durgesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockInformationController {
	
	
	@GetMapping("/api/StockPriceByCompanyName/{name}")
	public String getStockPriceByCompanyName(@PathVariable("name") String name) {
		
		if(name.equalsIgnoreCase("cognizant")) {
			return "Cognizant Stock Price Rate today is $70";
		}else if(name.equalsIgnoreCase("here")) {
			return "Here Stock Price Rate today is $60";
		}
		else if(name.equalsIgnoreCase("LTI")) {
			return "LTI Stock Price Rate today is $50";
		}
		else if(name.equalsIgnoreCase("Wipro")) {
			return "Wipro Stock Price Rate today is $40";
		}
		else if(name.equalsIgnoreCase("Oracle")) {
			return "Oracle Stock Price Rate today is $40";
		}
		else if(name.equalsIgnoreCase("Google")) {
			return "Google Stock Price Rate today is $40";
		}else {
			return "Please try to adjust your search with this company lists [cognizant,here,LTI,Wipro,Oracle,Google]";
		}
		
		
	}
	
	@GetMapping("/StockPriceByCompanyName/{name}")
	public String getStockPriceByCompanyNames(@PathVariable("name") String name) {
		
		if(name.equalsIgnoreCase("cognizant")) {
			return "Cognizant Stock Price Rate today is $70";
		}else if(name.equalsIgnoreCase("here")) {
			return "Here Stock Price Rate today is $60";
		}
		else if(name.equalsIgnoreCase("LTI")) {
			return "LTI Stock Price Rate today is $50";
		}
		else if(name.equalsIgnoreCase("Wipro")) {
			return "Wipro Stock Price Rate today is $40";
		}
		else if(name.equalsIgnoreCase("Oracle")) {
			return "Oracle Stock Price Rate today is $40";
		}
		else if(name.equalsIgnoreCase("Google")) {
			return "Google Stock Price Rate today is $40";
		}else {
			return "Please try to adjust your search with this company lists [cognizant,here,LTI,Wipro,Oracle,Google]";
		}
		
	}

}
