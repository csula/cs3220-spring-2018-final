package edu.csula.cs3220.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo/edit")
public class EditTodoServlet extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO: implement rendering the todo edit.jsp page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(
			String.format("<h1>%s!</h1>", "Hello Edit Todo")
		);
	}

	public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO: handle editing an existing todo item
	}
}
