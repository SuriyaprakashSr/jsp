package com.ty.StudentController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.StudentDAO.StudentDao;
import com.ty.StudentDTO.Student;
@WebServlet("/view")
public class ViewController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		String email = (String)httpSession.getAttribute("email");
		if(email !=null) {
			int id = Integer.parseInt(req.getParameter("id"));
			StudentDao dao = new StudentDao();
			Student student = dao.findById(id);
			
			req.setAttribute("student", student);
			RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
			dispatcher.forward(req, resp);
			
		}
		else {
			req.setAttribute("invalid", "login first");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
