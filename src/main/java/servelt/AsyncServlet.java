/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: AsyncServlet.java
 * Author:   bigmoon
 * Date:     19-9-11 下午2:58
 * Description: servletAsync
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
 * @author bigmoon
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
