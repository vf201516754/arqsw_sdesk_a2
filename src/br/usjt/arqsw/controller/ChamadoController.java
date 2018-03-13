package br.usjt.arqsw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;

@WebServlet("/ChamadoController")
public class ChamadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChamadoController() {
        super();
    }

	protected void doGett(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Teste get");
		
		//Obter lista do banco
		ChamadoDAO chamadoDAO = new ChamadoDAO();
		List<Chamado> lista = chamadoDAO.listarChamado();
		
		//Engavetar no request
		request.setAttribute("lista", lista);
		
		//Encaminhar para jsp
		RequestDispatcher saida = request.getRequestDispatcher("ChamadoListarExibir.jsp");
		saida.forward(request, response);
		
		/*
		String htmlSaida = "<html> <body> <table border= '1'>" +
		"<tr> <td> id </td> <td> Nome </td> <td>Login </td> <td> Senha </td> </tr>";
	
		for(Chamado chamado : lista) {
			htmlSaida += "<tr> <td>" + chamado.getIdChamado() + 
					     "</td> <td>" + chamado.getDescricao() + "</td> <td>" + chamado.getStatus() + "</td> <td>" + chamado.getDtAbertura() + 
						 "</td> <td>" + chamado.getDtFechamento() + "</td> <td> " + chamado.getFila()+ "</td> </tr>";
		}
		htmlSaida += "</table> </body> </html>";
		
		PrintWriter saida = response.getWriter();
		saida.println(htmlSaida); */
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("Teste post");
		
		
	}

}
