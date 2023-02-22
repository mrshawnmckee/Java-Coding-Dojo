package com.sam.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endevours!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an oportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String cityTravel) {
		if(cityTravel == null) {
			return "You should take some time to travel";
		}else {
			return "Congratulations! You will soon travel to " + cityTravel + "!";
		}
	}
	@RequestMapping("lotto/{luckyNumber}")
	public String lucky(@PathVariable("luckyNumber") int areYouLucky) {
		if(areYouLucky % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}

}
