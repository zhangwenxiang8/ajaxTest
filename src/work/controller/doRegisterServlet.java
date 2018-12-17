package work.controller;

import work.pojo.Product;
import work.pojo.User;
import work.service.IUserService;
import work.service.UserServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/doRegister")
public class doRegisterServlet extends HttpServlet {

    private IUserService service = new UserServicelmpl();
//       Product process=new Product();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("names");

        //获取到jsp页面接收到的将ajax的data值 names  转化成字符串类型
        String upw = req.getParameter("p");
        String upwd = req.getParameter("ps");
        String tele = req.getParameter("tele");

//       String names =req.(process.getProductName());
        User user = service.getOne(uname);
        if (user == null) {
            if (upw.equals(upwd)) {
                User u = new User();
                u.setUsername(uname);
                u.setPassword(upw);
                u.setTele(tele);
                service.insert(u);
                resp.getWriter().write("1");

        }else {
                resp.getWriter().write("3");
            }
            }else{
                resp.getWriter().write("2");
            }

        }
    }


//
//        String username=req.getParameter("username");
//        String pwd= req.getParameter("pwd");
//        String pwds=req.getParameter("pwds");
//        String tele=req.getParameter("tele");
//        User u=new User();
//        u.setUsername(username);
//        u.setPassword(pwd);
//        u.setTele(tele);
//        if (pwd.equals(pwds)){
//            service.insert(u);
//            resp.sendRedirect("list");

//}
