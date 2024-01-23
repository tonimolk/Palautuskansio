package k24.backend.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class endpointContact {
    @RequestMapping("contact")
    
    public String returnMessage() {
        return "This is the contact page";

    }



}
