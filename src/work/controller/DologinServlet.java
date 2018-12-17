package work.controller;

import work.pojo.User;
import work.service.IUserService;
import work.service.UserServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DologinServlet extends HttpServlet {
    /*
    登陆-- 表单提交
    method get/post
    区别
    get 参数在地址栏上进行拼接
    post  不会再地址栏上拼接 ( 数据包的形式进行传送 )
    post相对安全----表单提交用Post   文件上传file用post
     浏览器的地址栏最多容纳2M

    * */







    private IUserService service = new UserServicelmpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        String username= req.getParameter("username");
        String password= req.getParameter("pwd");
        System.out.println(username+"     "+password );
       User u= service.getOne(username);
       if (u==null){
                resp.sendRedirect("register");
       }else{
           if (u.getPassword().equals(password)){
               resp.sendRedirect("list");
           }
       }

    }
}
