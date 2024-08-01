package Register_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Register_Entity.UserDtl;
import Register_Repository.UserRepository;
import jakarta.servlet.http.HttpSession;



@RestController
public class UserController {
	

	@Autowired
	private UserRepository Repo;


	@GetMapping("/home")
	public String Home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtl u,HttpSession session) {
		System.out.println(u);
		Repo.save(u);
		session.setAttribute("message", "User Registeration Successful..!");
		return "redirect:/";
	}

	@GetMapping("/myname")
	public String getMethodName() {
		return "<h1>Gaikwad Pralhad</h1>";
	}
	
}
