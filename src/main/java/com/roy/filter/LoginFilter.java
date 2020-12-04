package com.roy.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description：
 * author：dingyawu
 * date：created in 9:11 2020/9/11
 * history:
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uriPath = request.getServletPath();
        String url = request.getRequestURL().toString();
        String remoteAddr = request.getRemoteAddr();
        if (uriPath.indexOf("/help/") > -1){
            filterChain.doFilter(servletRequest, servletResponse);
            return ;
        }
    }

    @Override
    public void destroy() {

    }
}
