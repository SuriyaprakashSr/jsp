package com.ty.StudentController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.StudentDAO.StudentDao;
import com.ty.StudentDTO.Student;
@WebServlet("/signin")
public class StudentSigninController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		Student student = new Student();
		
		
		student.setName(req.getParameter("name"));
		student.setPhone(Long.parseLong(req.getParameter("phone")));
		student.setEmail(req.getParameter("email"));
		student.setPassword(req.getParameter("password"));
		
		dao.saveStudent(student);
		
		
		req.setAttribute("message", "signin Sucessfull");
		RequestDispatcher dispatcher = req.getRequestDispatcher("signin.jsp");
		dispatcher.forward(req, resp);
		
		
	}

}
