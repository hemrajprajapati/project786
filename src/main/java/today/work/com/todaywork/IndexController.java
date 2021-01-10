package today.work.com.todaywork;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
   @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
   @RequestMapping(value = "/register")
   public String register() {
      return "register";
   }
   @RequestMapping(value = "/login")
   public String login() {
      return "login";
   }
   @RequestMapping(value = "/aboutus")
   public String aboutus() {
      return "aboutus";
   }
   @RequestMapping(value = "/contactus")
   public String contactus() {
      return "contactus";
   }
}