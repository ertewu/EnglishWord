package zystudio.englishword.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import zystudio.englishword.web.WebConfig;


public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    //这个与ServletContext的初始化有关，主要是与ServletContainerInitializer有关。随着Spring的发展，更简单的方法就是继承ＡbstractAnnotationConfigDispatcherServletInitializer，
    // 重写getServletConfigClasses,getServletMappings,getRootConfigClasses　来配置DispatcherServlet
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[0];
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
//        return new String[0];
        return new String[]{"/"};
    }

}
