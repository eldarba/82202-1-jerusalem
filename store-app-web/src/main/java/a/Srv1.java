package a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/srv1")
public class Srv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

// url:
// http://localhost:8080/store-app-web/srv1
// GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// out will add content to the http response body
		PrintWriter out = response.getWriter();
		out.println("hello from srv1 - GET");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// out will add content to the http response body
		PrintWriter out = resp.getWriter();
		out.println("hello from srv1 - POST");
	}

}
