package a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculator.model.Calculator;

@WebServlet({ "/MyServlet", "/add" })
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Calculator calculator = new Calculator();

	// http://localhost:8080/web-app/add?a=6&b=9
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		int sum = calculator.add(a, b);
		PrintWriter out = response.getWriter();
		out.print(a + " + " + b + " = " + sum);

	}

}
