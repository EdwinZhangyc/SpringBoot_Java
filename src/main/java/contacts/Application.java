package contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 程序清单21.7 初始化Spring Boot配置的简单启动类
 */
@ComponentScan
//启用自动配置
@EnableAutoConfiguration
public class Application {

    public static void main (String[] args){
        //运行应用
        SpringApplication.run(Application.class, args);
    }
}