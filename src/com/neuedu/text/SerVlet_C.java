package com.neuedu.text;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SerVlet_C extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //servlet:页面是做逻辑判断,在数据库中获取数据
        //jsp: 显示页面


        //设值转发
//        req.setAttribute("key","value");                                          //一次请求
        //以k,v值的方式传入到jsp页面,java表达内容的值相对应.将value值带到jsp页面使用
//        req.getRequestDispatcher("jsp/12.10.jsp").forward(req,resp);
        /*一个方法只能针对一个jsp页面使用.不能对多个
        *forward(req,resp)相当于将这个方法的req,resp一块都放到jsp页面去共用.
         */


        HttpSession session=req.getSession();
        //session作用域一直有效 登入买东西,可以用session的作用域
        session.setAttribute("session","session");
        req.getRequestDispatcher("jsp/12.10.jsp").forward(req,resp);
//        req.getServletContext().setAttribute("servletContext","servletContext");
                // servletContext作用域是全局,服务器关闭,才停止生效. 根据情况使用
//        req.getRequestDispatcher("jsp/12.10.jsp").forward(req,resp);
    }
}
            /*转发 特点:
            *       服务器端的行为 :一次请求
            *       转发的是文件
            *       转发后地址栏上的地址不变
            *       转发的文件的路径  只能在当前项目中
            *       可以共用同一个request 和response对象   通过setAttribute()
            *   */