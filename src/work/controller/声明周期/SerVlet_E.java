package work.controller.声明周期;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class SerVlet_E extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("cc"));//获取的servlet初始化参数名
    }
}
