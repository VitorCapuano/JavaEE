package br.com.fiap.si.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.si.bo.Calculadora;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
       
    public HelloServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Double n1 = Double.parseDouble(request.getParameter("txtN1"));
		Double n2 = Double.parseDouble(request.getParameter("txtN2"));
		String op = request.getParameter("cboOp");
		
		Calculadora calc = new Calculadora(n1, op, n2);
		Double res = calc.calcular();
		
		request.setAttribute("resultado", res);
		
		String url = "positivo.jsp";
		if(res < 0){
			url = "negativo.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
