/*
 * Copyright (c) 2004- 2019 All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * FileName: CommonFilter.java
 * Author:   bigmoon
 * Date:     19-9-11 下午4:55
 * Description: servletAsync
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 17081794     19-9-11 下午4:55      版本号        描述
 */

package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author bigmoon
 * @see [相关类/方法]（可选）
 * @since 0905
 */
public class CommonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("common-filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("common-filter dofilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

        System.out.println("filter destroy");
    }
}
