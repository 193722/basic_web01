# basic_web01
采用Spring5+SpringMVC5+Mybatis3+Shiro搭建的一套web基本架构，提供标准的RestFul API接口，可以很方便的进行二次开发！

>## 目录
<ul>
  <li><a href="https://github.com/bobi1234/basic_web01#%E6%A8%A1%E5%9D%97%E4%BB%8B%E7%BB%8D">模块介绍</a></li>
  <li><a href="https://github.com/bobi1234/basic_web01#%E6%8A%80%E6%9C%AF%E7%89%B9%E8%89%B2">技术特色</a></li>
  <li><a href="https://github.com/bobi1234/basic_web01#%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AB%AF%E9%80%9A%E7%94%A8%E5%93%8D%E5%BA%94%E7%B1%BB%E5%B0%81%E8%A3%85">服务器端通用响应类封装</a></li>
  <li><a href="https://github.com/bobi1234/basic_web01#%E5%85%A8%E5%B1%80%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E5%B0%81%E8%A3%85">全局异常处理封装</a></li>
  <li><a href="">Maven环境隔离</a></li>
</ul>

>## 模块介绍
<ul>
  <li>web01-common: 公告模块</li>
  <li>web01-mapper: 数据库访问层模块</li>
  <li>web01-pojo: 实体类模块</li>
  <li>web01-service: 业务处模块</li>
  <li>web01-shiro: 权限模块</li>
  <li>web01-web: 接口模块</li>
</ul>

>## 技术特色

<ul>
  <li>Spring5</li>
  <li>SpringMVC5</li>
  <li>Mybatis3</li>
  <li>Shiro</li>
  <li>Spring Session</li>
  <li>Druid</li>
</ul>

>## 服务器端通用响应类封装

测试URL地址
http://localhost:8080/hello/abc

效果演示
![](https://note.youdao.com/yws/public/resource/061267ec637009aca0b1e0244567f3dd/xmlnote/B0ECDEF5581840D3A8EE0004061F8671/3405)

主要参数说明
```
SUCCESS(0, "成功"),
ERROR(1, "失败"),
ILLEGAL_ARGUMENT(2, "参数错误");
```

>## 全局异常处理封装

测试URL地址
http://localhost:8080/hello/exception

效果演示
![](https://note.youdao.com/yws/public/resource/061267ec637009aca0b1e0244567f3dd/xmlnote/DEACBFF6FD47422E939D7D362C472074/3403)
