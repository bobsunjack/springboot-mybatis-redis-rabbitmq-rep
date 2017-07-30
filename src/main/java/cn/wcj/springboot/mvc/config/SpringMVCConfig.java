package cn.wcj.springboot.mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.wcj.springboot.mvc.interceptors.MyInterceptor;

/**
 * 
 * <p>Module:SpringMVCConfig </p>
 * <p>Description:拦截器等配置 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月31日 上午12:11:26
 */
@Configuration
public class SpringMVCConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private MyInterceptor myInterceptor   ;
	
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 判断用户是否登录的拦截器
        registry.addInterceptor(myInterceptor).addPathPatterns("/Member/**");
    }


}
