package com.albg.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/20 21:24
 * @Description:
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator bingGateWayRouter(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("routeBing",
                r -> r.path("/news")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }



}
