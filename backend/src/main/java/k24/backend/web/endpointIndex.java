package k24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class endpointIndex {
    @RequestMapping("index")
    
    public String returnMessage() {
        return "This is the main page";

    }
}


    
    
