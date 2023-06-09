package sun.market.controller.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 网站基础信息配置
 */

@Component
@PropertySource(value="classpath:site.properties")
public class SiteConfig {

    @Value("${sun.site.name}")
    private String siteName;
    @Value("${sun.site.url}")
    private String siteUrl;
    public String getSiteName(){
        return siteName;
    }
    public void setSiteName(String siteName){
        this.siteName = siteName;
    }
    public String getSiteUrl(){
        return siteUrl;
    }
    public void setSiteUrl(String siteUrl){
        this.siteUrl=siteUrl;
    }
}
