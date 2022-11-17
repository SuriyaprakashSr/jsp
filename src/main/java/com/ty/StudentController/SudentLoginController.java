package com.ty.StudentController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.StudentDAO.StudentDao;
import com.ty.StudentDTO.Student;
@WebServlet("/login")
public class SudentLoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		
		String email =req.getParameter("email");
		String password = req.getParameter("password");
		Student student = dao.getStudentByEmail(email);
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("email", email);
		dao.getStudentByEmail(email);
		
		if(student.getPassword().equals(password)) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
			dispatcher.forward(req, resp);
		}
		else {
			req.setAttribute("invalid", "invalid password");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req, resp);
		}
	}

}
