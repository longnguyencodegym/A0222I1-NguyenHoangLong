package com.example.simple_calculator;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class HelloServlet extends HttpServlet {




    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
float num1=Float.parseFloat(request.getParameter("operand1"));
        float num2=Float.parseFloat(request.getParameter("operand2"));
        String operator=request.getParameter("operator");
        String result="";
        if (operator.equals("+")){
            result=num1 + "+"+num2+"="+(num1+num2);
        }
        if (operator.equals("-")){
            result=num1 + "-"+num2+"="+(num1-num2);
        }
        if (operator.equals("*")){
            result=num1 +"*"+num2+"="+(num1*num2);
        }
        if (operator.equals("/")){
            result=num1 + "/"+num2+"="+(num1/num2);
        }
        if (operator.equals("/")&& num2==0){
            result="Loi chia cho so 0";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/result.jsp");
        request.setAttribute("result", result);
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}