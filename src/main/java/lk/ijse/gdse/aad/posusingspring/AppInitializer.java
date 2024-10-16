package lk.ijse.gdse.aad.posusingspring;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import lk.ijse.gdse.aad.posusingspring.config.WebAppConfig;
import lk.ijse.gdse.aad.posusingspring.config.WebAppRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }



}
