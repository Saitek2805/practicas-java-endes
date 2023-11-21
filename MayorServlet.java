package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayorServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String primero=request.getParameter("primero");
		String segundo=request.getParameter("segundo");
		String tercero=request.getParameter("tercero");
		boolean pri=false,seg=false,ter=false;
		try {
			Integer primer_int = Integer.parseInt(primero);
			Integer segun_int = Integer.parseInt(segundo);
			Integer tercer_int = Integer.parseInt(tercero);
			if (primer_int>segun_int && primer_int>tercer_int){
				pri=true;
				System.out.println("El número primero es el mayor"); 
			}else if (segun_int>primer_int && segun_int>tercer_int){
				seg=true;
				System.out.println("El número segundo es el mayor") ;
			}else if (tercer_int>primer_int && tercer_int>segun_int){
				ter=true;
			    System.out.println("El número tercero es el mayor"); 
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='UTF-8'>");
		out.print("</head>");
		out.print("<body>");
		if(pri) {
		out.println("El primer número es el mayor");
		}
		if(seg) {
		out.println("El segundo número es el mayor");
		}
		if(ter) {
			out.println("El tercer número es el mayor");
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
