package sun.market.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.market.controller.admin.config.SiteConfig;
import sun.market.controller.admin.entity.admin.OperatorLog;

import java.util.*;

/**
 * 系统控制器
 */

@RequestMapping("/system")
@Controller
@Configurable
public class SystemController {

    @Autowired
    private SiteConfig siteConfig;

    private Logger log = LoggerFactory.getLogger(SystemController.class);

    @RequestMapping(value="/index")
    public String index( String name, Model model){
        OperatorLog operatorLog = new OperatorLog();
        operatorLog.setOperator("sun");
        operatorLog.setContent("校园二手交易平台的网址是：market.com");
        model.addAttribute("name",name);
        model.addAttribute("operator", operatorLog);
        model.addAttribute("data",new Date());
        String html = "<div>div</div>";
        model.addAttribute("html",html);
        Map<String,String>map = new HashMap<String,String>();
        map.put("name","zzz");
        map.put("tel","13952325745");
        map.put("age","23");
        model.addAttribute("map",map);
        Integer age = 20;
        model.addAttribute("age",age);
        return "index";
    }
}
