package com.devnokiyo.demo.config

import com.devnokiyo.demo.filter.SessionFilter
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.thymeleaf.spring5.SpringTemplateEngine
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.spring5.view.ThymeleafViewResolver
import org.thymeleaf.templatemode.TemplateMode


class WebConfig : WebMvcConfigurer {

    @Bean
    fun templateResolver(): SpringResourceTemplateResolver {
        return SpringResourceTemplateResolver()
                .apply {
                    prefix = "classpath:/templates/"
                    suffix = ".html"
                    templateMode = TemplateMode.HTML
                }
    }

    @Bean
    fun templateEngine(): SpringTemplateEngine {
        return SpringTemplateEngine()
                .apply { setTemplateResolver(templateResolver()) }
    }

    @Bean
    fun viewResolver(): ThymeleafViewResolver {
        return ThymeleafViewResolver()
                .apply {
                    templateEngine = templateEngine()
                    order = 1
                }
    }

    @Bean
    fun sessionFilter(): FilterRegistrationBean<SessionFilter> {
        return FilterRegistrationBean(SessionFilter())
                .apply {
                    addUrlPatterns("/*")
                    order = Int.MIN_VALUE
                }
    }
}