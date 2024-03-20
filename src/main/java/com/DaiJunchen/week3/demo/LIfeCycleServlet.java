package com.DaiJunchen.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LIfeCycleServlet", value = "/LIfeCycleServlet")
public class LIfeCycleServlet extends HttpServlet {
    public LIfeCycleServlet(){
        System.out.println("i am in constructor --> LifeCycleServlet() ");
    }
    @Override
    public void init(){
        System.out.println("i am in init() ");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in servlet () --> doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy() {
        System.out.println("i am in destroy() ");
    }
}
