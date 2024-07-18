package com.helix.gpo.github_actions_ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCiCdApplication {

	@GetMapping(value = "/welcome")
	public String welcome() {
		return "Welcome to Helix GPO!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCiCdApplication.class, args);
	}

	/*echo "# github-actions-example" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/FB6202/github-actions-example.git
	git push -u origin main*/

}
