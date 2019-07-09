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
        