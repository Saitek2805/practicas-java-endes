package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dia=request.getParameter("dia");
		Integer dia_int=0;
		try {
			dia_int = Integer.parseInt(dia);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("</head>");
		out.print("<body>");
		
		switch (dia_int) {
		case 1:
			out.print("el día es lunes");
			break;
		case 2:
			out.print("Martes");
	        break;
	    case 3:
	    	out.print("Miércoles");
	        break;
	    case 4:
	    	out.print("Jueves");
	        break;
	    case 5:
	    	out.print("Viernes");
	        break;  
	    case 6:
	    	out.print("Sábado");
	        break;
	    case 7:
	    	out.print("Domingo");
	        break;

		default:
			break;
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
