package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TablaMultiplicarServlet
 */
public class TablaMultiplicarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TablaMultiplicarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		Integer num_int=0;
		int total=0;
		try {
			num_int = Integer.parseInt(num);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		for(int i=0;i<=num_int;i++) {
			total=total+i;
		}
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("</head>");
		out.print("<body>");
		out.print("La tabla de multiplicar es: ");
		out.print("</br>");
		for(int i=0;i<=10;i++) {
			out.println(num_int+"x"+i+" = "+ num_int*i);
			out.print("</br>");
			
		}
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
