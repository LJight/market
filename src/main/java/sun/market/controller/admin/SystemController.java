package sun.market.controller.admin;

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

    @RequestMapping(value="/index")
    public String index( String name, Model model){
        model.addAttribute("siteUrl",siteConfig.getSiteUrl());//变量赋值到模板引擎，freemark取出变量替换value指定目录下相对应的变量。转换为html展示给用户
        return "index";
    }
}
