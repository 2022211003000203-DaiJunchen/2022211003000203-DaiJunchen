package com.DaiJunchen.week2.homework;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet  extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name : DaiJunchen" +"\n"+
                "ID : 2022211003000203" +"\n"+
                "Date and Time : Sun March 13 21:00:00 CST 2024");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    {

    }
}
