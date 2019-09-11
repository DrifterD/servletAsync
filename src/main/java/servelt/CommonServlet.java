/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: AsyncServlet.java
 * Author:   17081794
 * Date:     19-9-10 下午2:59
 * Description: webapp12
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 17081794     19-9-10 下午2:59      版本号        描述
 */

package servelt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 3.0之前的一个常规servlet 服务
 * @author 17081794
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
