第二十一章 借助Spring Boot简化Spring开发
    本章内容：
        1、使用Spring Boot Starter添加项目依赖
        2、自动化配置bean
        3、Groovy与Spring Boot CLI
        4、Spring Boot Actuator
    21.1 Spring Boot 简介
        21.1.1 添加Starter依赖
        21.1.2 自动配置
        21.1.3 Spring Boot CLI
        21.1.4 Actuator
            Spring Boot Actuator为Spring Boot项目带来了很多有用的特性，包括：
                1、管理端点
                2、合理的异常处理以及默认的“/error”映射端点
                3、获取应用信息的“/info”端点
                4、当启动Spring Security时会有一个审计事件框架。
    21.2 使用Spring Boot构建应用
        21.2.1 处理请求
        21.2.2 创建视图
            Spring Boot将会自动探索到类路径中的Thymeleaf，然后会自动配置：
                1、视图解析器
                2、模板解析器
                3、模板引擎
        21.2.3 添加静态内容
            在采用Spring Boot的Web自动配置来定义Spring MVC bean时，这些bean中会包含一个resource handler，
            它会将“/**”映射到几个资源路径中这些资源路径包括（相对于类路径的根）：
                /META-INF/resources/
                /resources/
                /static/
                /public/
        21.2.4 持久化数据（Persistence Data）
        21.2.5 尝试运行
            添加一个启动类
            使用命令：gradle build  或 maven package 进行打包
            可以使用jar包同时也可以使用war包的形式
            使用命令：java -jar build/libs/contacts-0.1.0.jar或java -jar build/libs/contacts-0.1.0.war进行启动，如果是maven的话，则在target文件夹下
    21.3 组合使用Groovy与Spring Boot CLI
        该节内容放到另外一个项目中