package sun.market.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//系统控制器
@Controller
@RequestMapping("/system")
public class SystemController {

    @RequestMapping(value="/index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
