package com.example.product_discount_calculator;



import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name = "DiscountServlet", value = "/discount_calculator")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name=request.getParameter("p_name");
double price= Double.parseDouble(request.getParameter("p_price"));
double percent=Double.parseDouble(request.getParameter("p_percent"));
double discount_Amount = price * percent * 0.01;
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");

        request.setAttribute("ketQua",discount_Amount);
        request.setAttribute("p_price",price);
        request.setAttribute("p_percent",percent);
        request.setAttribute("p_name",name);
        requestDispatcher.forward(request,response);
    }


}