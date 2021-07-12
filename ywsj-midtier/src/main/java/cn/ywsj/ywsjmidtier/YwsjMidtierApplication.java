package cn.ywsj.ywsjmidtier;

import cn.ywsj.core.CoreApplication;
import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoDataSourceProxy
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = {CoreApplication.class, YwsjMidtierApplication.class})
@ComponentScan(basePackageClasses = {CoreApplication.class, YwsjMidtierApplication.class})
@MapperScan(basePackages = "cn.ywsj.ywsjmidtier.mapper")
@EnableMethodCache(basePackages = "cn.ywsj.ywsjmidtier",order = -9999)
@EnableCreateCacheAnnotation
public class YwsjMidtierApplication {

    public static void main(String[] args) {
        SpringApplication.run(YwsjMidtierApplication.class, args);
    }

}
