package passion.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller 
public class Controller {

@GetMapping("/")
public String showHome() {
	
	return "hello";
}
	

}
