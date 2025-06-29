

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class DateTimeServlet
 */
@WebServlet("/DateTimeServlet")
public class DateTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DateTimeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date now = new Date();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Current Date and Time: " + now.toString() + "</h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
