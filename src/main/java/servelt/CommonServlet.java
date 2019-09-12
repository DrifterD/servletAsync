/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CommonServelt.java
 * Author:   bigmoon
 * Description: webapp12
 */

package servelt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 3.0之前的一个常规servlet 服务
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since 0905
 */
public class CommonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get reqeust");
        runMethod();
        resp.getWriter().append("response");
        resp.getWriter().flush();
    }

    public void runMethod() {
        sleepThread(2000);
    }

    protected void sleepThread(long millis) {

        try {

            Thread.sleep(millis);
        } catch (Exception ex) {

        }
    }
}
