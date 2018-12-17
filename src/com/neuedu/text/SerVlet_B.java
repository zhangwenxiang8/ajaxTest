package com.neuedu.text;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SerVlet_B extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("B的访问");    //测试

        resp.setContentType("text/html;charset=utf-8");  //文字编译utf-8

        PrintWriter pw=resp.getWriter();    /*获取一个流*/
//        pw.write("Hello Word");     /*流输出 文字 "Hello Word"*/
//        pw.write("<div style='background-color:green'>12345</div>"); /*输出嵌入html样式*/
            pw.write("中文");   /*中文显示,并解决编译*/
    }
}
