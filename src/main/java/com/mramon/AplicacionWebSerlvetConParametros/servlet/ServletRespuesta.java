package com.mramon.AplicacionWebSerlvetConParametros.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRespuesta
 */
public class ServletRespuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRespuesta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("respuesta.jsp").forward(request, response);; //<- le indicamos a donde queremos que nos mande "respuesta.jsp" y el forward nos manda la petición y la respuesta 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		float numeroUno;
    	float numeroDos;
    	float suma;
    	
    	numeroUno = Float.parseFloat(request.getParameter("txtNumeroUno"));
    	numeroDos = Float.parseFloat(request.getParameter("txtNumeroDos"));
    	
    	suma = numeroUno + numeroDos;
    	
    	request.setAttribute("respuestaSuma", String.valueOf(suma)); //setAttribute, estamos asignando un atributo, en el primero ponemos el valor  "respuestaSuma" y el argumento será el valor suma, String.valueO lo conviente a string
    	
    	//enviando la infomación
    	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	}

}
