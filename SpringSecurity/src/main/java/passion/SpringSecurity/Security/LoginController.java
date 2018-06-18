package passion.SpringSecurity.Security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage(){
		
		return "showMyLoginPage";
	}
	
	@GetMapping("/leader")
	public String leaderPage() {
		
		return "leaderPage";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		
		return "adminPage";
	}
	
	@GetMapping("/access-denied")
	public String deniedPage() {
		
		return "deniedPage";
	}
	
}
