package com.ujiuye.servlet;

import com.ujiuye.dao.UserDao;
import com.ujiuye.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //创建jdbc类的对象调用查询方法
        UserDao ud = new UserDao();
        //User u=ud.login(username,password);

        //成功与否的判断
     /* if(u==null){
        //登录失败
        resonse.sendRedirect("login.html");
    }else{
       //登录成功，进入首页面
        resonse.sendRedirect("index.html");
    }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
