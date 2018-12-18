package work.controller;

import work.pojo.User;
import work.service.IUserService;
import work.service.UserServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dologin")
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

        String uname = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        User user = service.getOne(uname);
        if (uname != null) {
            if (user.getPassword().equals(pwd)) {
                resp.getWriter().write("1");   //登陆成功

        } else{
                resp.getWriter().write("3");  //密码不对,登陆不成功
                }
    }else {
        resp.getWriter().write("2");  //账号为空
    }
}
}
//
//        String username= req.getParameter("username");
//           String password= req.getParameter("pwd");
//           System.out.println(username+"     "+password );
//           User u= service.getOne(username);
//           if (u==null){
//               resp.sendRedirect("register");
//           }else{
//               if (u.getPassword().equals(password)){
//                   resp.sendRedirect("list");
//               }


