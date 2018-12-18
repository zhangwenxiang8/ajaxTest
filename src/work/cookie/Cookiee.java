package work.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/cookie")
public class Cookiee  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




      HttpSession session = req.getSession();//查询JSESSIONID的ID
        System.out.println(session.getId());
session.setMaxInactiveInterval(60);         //指定有效时间内可以生效,超过就无效了
        session.invalidate();


        //        Cookie cookie=new Cookie("names","sad");
//
//        cookie.setMaxAge(60*60*24*7); //cookie,存储方式,key value. 默认单位为秒(>0计时,<或=0等同没设置)
//
//        resp.addCookie(cookie);
//
//        Cookie[] cookies =req.getCookies();
//        for (Cookie c:cookies){
//            System.out.println(c.getName());   //获取账号和密码
//            System.out.println(c.getValue());
//        }

    }
}
