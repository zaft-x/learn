package zaft.learn.restonspringwebmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zaft.learn.restonspringwebmvc.http.message.PropertiesPersonHttpMessageConverter;

import java.util.List;

/**
 * @ClassName WebMvcConfig
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/22 0022
 * @Version V1.0
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new PropertiesPersonHttpMessageConverter());
        System.err.println("--converters--"+converters);
    }
}
