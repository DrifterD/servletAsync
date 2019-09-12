/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: AnnotationFilter.java
 * Author:   bigmoon
 * Date:     19-9-11 下午5:26
 * Description: servletAsync
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 17081794     19-9-11 下午5:26      版本号        描述
 */

package filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 通过注解形式实现webFilter
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since 0905
 */
@WebFilter(filterName = "annotationFiler", servletNames = "annotationServlet", asyncSupported = true)
public class AnnotationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("annotation filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("annotation filter doFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("annotation filter destroy");
    }
}
