# 架构摘要 
## 工程结构   
    dolphin  
        dolphin-manager：系统管理    
        dolphin-common：公共  
        dolphin-tools：工具
        dolphin-logging：日志     
        dolphin-zuul：网关  
        dolphin-eureka：注册中心  
 ##   架构图
    ![dolphin架构图]（images/jgt.png  ''dolphin架构图''）
 
 # 模块说明
  ## 系统管理模块(dolphin-manager)
 * 基于SpringSecurity实现登录
 * 基于Graphics2D实现验证码，并进行了干扰线、扭曲、噪点增加机器识别难度防止暴力破解  
 * 采用SpringSecurity实现基于角色的权限维护包括用户、机构、角色、菜单、功能的维护  
 * 基于redis缓存技术实现数据字典功能  
   ## 网关（dolphin-zuul）
 * 实现基于网关的统一认证  
   ## 注册中心（dolphin-eureka）  
 * 实现高可用服务注册中心  
 
 # 本地开发说明  
1. idea需安装lombok通过增加一些“处理程序”，可以让java变得简洁、快速    
2. 更新代码至最新后，首先编译dolphin下的pom文件，生成各个子工程所需依赖    
3.  为简化配置，需在hosts配置文件中配置：  
    127.0.0.1 com.dolphin.eureka1 com.dolphin.eureka2    
4.  更新项目所需依赖，编译dolphin生成所需依赖
5. 启动注册中心节点1
    C:\Users\Administrator\.m2\repository\com\zhiyun\dolphin-eureka\1.0-SNAPSHOT通过执行dos命令  
     java -jar .\dolphin-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=node1
6. 启动网关服务  

