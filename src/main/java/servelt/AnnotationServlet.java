/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: AnnotationServlet.java
 * Author:   bigmoon
 * Date:     19-9-11 下午5:18
 * Description: servletAsync
 */

package servelt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 基于3.0 servelt注解实现 servelt
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since 0905
 */
@WebServlet(asyncSupported = true, name = "annotationServlet", value = "/servlet/annotation")
public class AnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("annoation servlet");
        resp.getWriter().write("annotation response");
    }
}
