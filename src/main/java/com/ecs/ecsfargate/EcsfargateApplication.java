package com.ecs.ecsfargate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class EcsfargateApplication {

	@GetMapping
	public String applicationStatus(){
		return "Application is up and running";
	}

	@GetMapping("/{name}")
	public String welcome(@PathVariable String name){
		return "Hi" + name + " Welcome to wolrd !";
	}

	public static void main(String[] args) {
		SpringApplication.run(EcsfargateApplication.class, args);
	}

}
/*
echo "# github-actions-" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/shubhampatil1850-sudo/github-actions-.git
git push -u origin main*/
