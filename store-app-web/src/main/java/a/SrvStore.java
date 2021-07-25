package a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String itemName = req.getParameter("itemName");
//		double itemPrice = Double.parseDouble(req.getParameter("itemPrice"));
//		Item item = new Item(itemName, itemPrice);
//		store.add(item);
//		PrintWriter out = resp.getWriter();
//		out.println("Added: " + item);
//	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String[]> map = req.getParameterMap();
		String[] names = map.get("itemName");
		String[] prices = map.get("itemPrice");

		PrintWriter out = resp.getWriter();
		for (int i = 0; i < names.length; i++) {
			Item item = new Item(names[i], Double.parseDouble(prices[i]));
			store.add(item);
			out.println("Added: " + item);
		}
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String itemName = req.getParameter("itemName");
		double itemPrice = Double.parseDouble(req.getParameter("itemPrice"));
		Item item = new Item(itemName, itemPrice);
		PrintWriter out = resp.getWriter();
		if (store.update(item)) {
			out.println("Updated: " + item);
		} else {
			out.println("Update of: " + item + " failed - not found");
		}
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String itemName = req.getParameter("itemName");
		PrintWriter out = resp.getWriter();
		if (store.delete(itemName)) {
			out.println("Deleted " + itemName);
		} else {
			out.println("Delete " + itemName + " failed - not found");
		}
	}

}
