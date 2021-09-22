package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Divide;

/**
 * Servlet implementation class divideNumbersServlet
 */
@WebServlet("/divideNumbersServlet")
public class divideNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public divideNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNum = request.getParameter("userNum");
		String userNum1 = request.getParameter("userNum1");
		Divide userResult = new Divide(Double.parseDouble(userNum),Double.parseDouble(userNum1));
		request.setAttribute("userNumResult", userResult);
		
		getServletContext().getRequestDispatcher("/divideResult.jsp").forward(request, response);
	}

}
