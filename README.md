#架构摘要
服务鉴权
通过JWT的方式来加强服务之间调度的权限验证，保证内部服务的安全性。
代码生成
采用freemarker模板引擎

#模块说明  
    dolphin-modules：平台模块    
        dolphin-modules/dolphin-generator：代码生成模块  
        dolphin-modules/dolphin-manager：后台管理模块  
            主要包括：用户、功能、角色、权限、服务鉴权 五个子模块  
        dolphin-modules/dolphin-login：登录模块  
        dolphin-modules/dolphin-log：日志模块  
     dolphin-gateway：网关模块  
    business-system：业务系统A  
    business-system：业务系统B  
    business-system：业务系统C  
 #本地开发说明  
 1、idea需安装lombok通过增加一些“处理程序”，可以让java变得简洁、快速    
 2、更新代码至最新后，首先编译dolphin下的pom文件，生成各个子工程所需依赖    
 3、为简化配置，需在hosts配置文件中配置：127.0.0.1 com.dolphin.eureka1 com.dolphin.eureka2    
