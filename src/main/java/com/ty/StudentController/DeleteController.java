package com.ty.StudentController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.StudentDAO.StudentDao;
import com.ty.StudentDTO.Student;
@WebServlet("/delete")
public class DeleteController  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));
	StudentDao dao = new StudentDao();
	Student student=dao.DeleteStudentById(id);
	req.setAttribute("student",student);
	req.getRequestDispatcher("delete.jsp").include(req, resp);
	
	
}	

}
