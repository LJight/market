package sun.market.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.market.controller.admin.config.SiteConfig;
import sun.market.controller.admin.entity.admin.OperationLog;

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
        OperationLog operationLog = new OperationLog();
        operationLog.setOperator("sun");
        operationLog.setContent("校园二手交易平台的网址是：market.com");
        model.addAttribute("name",name);
        model.addAttribute("operator",operationLog);
        return "index";
    }
}
