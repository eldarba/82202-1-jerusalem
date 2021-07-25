package a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.core.Item;
import app.core.Store;

@WebServlet("/srv-store")
public class SrvStore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Store store = new Store();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Item> items = store.getItems();
		PrintWriter out = response.getWriter();
		out.println("===== Items =====");
		for (Item item : items) {
			out.println(item);
		}
		out.println("=====-------=====");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String itemName = req.getParameter("itemName");
		double itemPrice = Double.parseDouble(req.getParameter("itemPrice"));
		Item item = new Item(itemName, itemPrice);
		store.add(item);
		PrintWriter out = resp.getWriter();
		out.println("Added: " + item);
	}

}
