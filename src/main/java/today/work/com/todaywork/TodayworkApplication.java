package today.work.com.todaywork;
import today.work.com.todaywork.freelancer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
@SpringBootApplication
public class TodayworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodayworkApplication.class, args);
	}
    @RequestMapping(value = "/")
	public String hello() {
	   return "index";
	}
}
