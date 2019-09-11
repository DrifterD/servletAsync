/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: AsyncServlet.java
 * Author:   17081794
 * Date:     19-9-11 下午2:58
 * Description: servletAsync
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 17081794     19-9-11 下午2:58      版本号        描述
 */

package servelt;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 *  3.0 servlet 服务，提供异步处理能力
 *  必须在servlet中启用异步处理选项
 *  xml： <async-supported>true</async-supported>
 *  annotation：asyncSupported
 *
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 0905
 */
public class AsyncServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get async reqeust");
        AsyncContext asyncContext = req.startAsync();
        asyncContext.addListener(new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent event) throws IOException {

                System.out.println("listener-async complete");
            }

            @Override
            public void onTimeout(AsyncEvent event) throws IOException {
                System.out.println("listener-async timeout");
            }

            @Override
            public void onError(AsyncEvent event) throws IOException {
                System.out.println("listener-async error");
            }

            @Override
            public void onStartAsync(AsyncEvent event) throws IOException {
                System.out.println("listener-async start");
            }
        });


        asyncContext.start(() -> {
            runMethod();
            try {
                asyncContext.getResponse().getWriter().write("Hello World!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            asyncContext.complete();
        });

    }


    public void runMethod() {
        sleepThread(2000);
    }

    protected void sleepThread(long millis) {
        System.out.println("start sleepThread");

        try {
            Thread.sleep(millis);
            System.out.println("end sleepThread");
        } catch (Exception ex) {

        }
    }
}
