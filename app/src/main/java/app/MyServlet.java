package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// acts as a CGI
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private RandomNumber randomNumber = new RandomNumber();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int x = randomNumber.getRandomNumber();
		PrintWriter out = resp.getWriter(); // output to client
		System.out.println(x); // output to server console
		out.println("Your lucky number is: " + x); // output to client browser

	}

}
