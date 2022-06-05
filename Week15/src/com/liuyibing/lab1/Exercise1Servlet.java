package com.liuyibing.lab1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Exercise1Servlet", value = "/exercise1")
public class Exercise1Servlet extends HttpServlet {
    private int times=0;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
        System.out.println("I Am from default constructor");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service");
        times++;
        request.setAttribute("times",times);
        request.getRequestDispatcher("lab1/exercise1.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public void destroy(){
        System.out.println("destroy");
    }
}
