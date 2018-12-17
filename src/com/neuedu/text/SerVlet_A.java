package com.neuedu.text;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SerVlet_A extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getContextPath());//获取项目名
        System.out.println(req.getRequestURL());//获取路径 范围更大
        System.out.println(req.getRequestURI());//获取全路径
        System.out.println(req.getServletPath()); //获取这个servlet的路径
        System.out.println(req.getScheme());     //获取协议 http
        System.out.println(req.getCharacterEncoding());//获取编码集
        System.out.println(req.getContentType());       //获取内容类型
        System.out.println(req.getServerName());    //获取本地Web路径名
        System.out.println(req.getServerPort()); //获取本地Web端口号


    }
}
