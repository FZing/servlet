package day08_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ServletPathDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //test1();
        //test2();
        String path = this.getServletContext().getRealPath("/WEB-INF/classes/day08_servlet/c.properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream(path));
        System.out.println(pro.getProperty("key"));
    }

    public void test2() throws IOException {
        String path = this.getServletContext().getRealPath("/WEB-INF/classes/b.properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream(path));
        System.out.println(pro.getProperty("key"));
    }

    public void test1() throws IOException {
        //获取WEB-INF下的文件
        String path = this.getServletContext().getRealPath("/WEB-INF/a.properties");
        //System.out.println(path);//D:\JavaWeb\out\artifacts\JavaWeb_war_exploded\WEB-INF\a.properties
        Properties pro = new Properties();
        pro.load(new FileInputStream(path));
        System.out.println(pro.getProperty("key"));
    }
}
