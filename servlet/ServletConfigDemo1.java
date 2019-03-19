package day08_servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletConfigDemo1 extends HttpServlet {
    private ServletConfig config;
    public void init(ServletConfig config){
        this.config = config;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取配置文件中的信息
        //方式一
        //String line = config.getInitParameter("encoding");
        //方法二
        String line = this.getServletConfig().getInitParameter("encoding");
        //方法三
        //String line = this.getInitParameter("encoding");
        System.out.println(line);
    }
}
