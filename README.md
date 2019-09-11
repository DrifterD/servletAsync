# servlet 3.x 新增特性

## 异步处理支持
Servlet 线程不再需要一直阻塞，直到业务处理完毕才能再输出响应，最后才结束该 Servlet 线程.解放servelt 容器的请求线程，这样可以让线程对接其他
新的请求，提高并发能力。但是在前端请求响应上和3.x之前的Servlet是没有任何区别

实现异步处理步骤：
1. 配置 异步选项:
 xml配置：`<async-supported>true</async-supported>`
 注解配置：`@WebServlet(asyncSupported = true`
 
2. 在servlet中调用async功能


## 新增 注解支持

## 可插性支持

[参考文献](https://www.ibm.com/developerworks/cn/java/j-lo-servlet30/index.html)
