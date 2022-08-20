package com.example.hien_thi_danh_sach_khach_hang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class HelloServlet extends HttpServlet {


    private static List<Customer> customerList = new ArrayList<>();



    @Override
    public void init() throws ServletException {
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang"));
        customerList.add(new Customer("Nguyễn Thái Hoà","1983-08-22","Nam Định"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        request.setAttribute("customerList", customerList);
        requestDispatcher.forward(request, response);
    }

    }
