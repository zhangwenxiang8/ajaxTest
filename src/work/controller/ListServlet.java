package work.controller;

import com.alibaba.fastjson.JSONObject;
import work.pojo.Product;
import work.service.ProductService;
import work.service.ProductServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/list")
public class ListServlet extends HttpServlet {

            private ProductService service=new ProductServiceimpl();  //从service层调过来方法

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> lists= service.getLists();    //从service层调过来方法

       String lis =JSONObject.toJSONString(lists);
       resp.setCharacterEncoding("utf-8");
     resp.getWriter().write(lis);
//        req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);
    }
}
