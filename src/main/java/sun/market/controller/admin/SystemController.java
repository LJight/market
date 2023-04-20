package sun.market.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.market.controller.admin.config.SiteConfig;

//系统控制器
@RequestMapping("/system")
@Controller
@Configurable
public class SystemController {

    @Autowired
    private SiteConfig siteConfig;

    private Logger log = LoggerFactory.getLogger(SystemController.class);

    @RequestMapping(value="/index")
    public String index( String name, Model model){
        model.addAttribute("siteUrl",siteConfig.getSiteName());//变量赋值到模板引擎，freemark取出变量替换value指定目录下相对应的变量。转换为html展示给用户
        log.warn("sitename="+siteConfig.getSiteName());
        log.error("siteUrl="+siteConfig.getSiteUrl());
        return "index";
    }
}
