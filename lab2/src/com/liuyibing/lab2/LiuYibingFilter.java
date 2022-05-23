package com.liuyibing.lab2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "LiuYibingFilter")
public class LiuYibingFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("LiuYibingFilter-->before chain");
        chain.doFilter(request, response);
        System.out.println("LiuYibingFilter-->after chain");
    }
}
