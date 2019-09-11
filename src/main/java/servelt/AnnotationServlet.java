/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: AnnotationServlet.java
 * Author:   17081794
 * Date:     19-9-11 下午5:18
 * Description: servletAsync
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 17081794     19-9-11 下午5:18      版本号        描述
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
 * @author 17081794
 * @see [相关类/方法]（可选）
 * @since 0905
 */
@WebServlet(asyncSupported = true,name = "annotationServlet",value = "/servlet/annotation")
public class AnnotationServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        System.out.println("annoation servlet");
        resp.getWriter().write("annotation response");
    }
}
