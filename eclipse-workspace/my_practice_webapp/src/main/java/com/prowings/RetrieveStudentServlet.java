package com.prowings;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.entity.Student;
import com.prowings.utils.HibernateUtils;

@WebServlet("/RetrieveStudent")
public class RetrieveStudentServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the roll number from the query string
		String rollNumber = request.getParameter("rollNumber");

		// Set the content type for the response
		response.setContentType("text/html");

		// Output the roll number to the response
//		response.getWriter().println("<html>");
//		response.getWriter().println("<head><title>Retrieve Student Info</title></head>");
//		response.getWriter().println("<body>");
//		response.getWriter().println("<h1>Retrieve Student Info</h1>");
//		if (rollNumber != null && !rollNumber.isEmpty()) {
//			response.getWriter().println("<p>Roll Number: " + rollNumber + "</p>");
//			// You can add logic here to fetch student details from a database using the
//			// roll number
//			response.getWriter().println("<p>Name: " + "Shweta T Lokhande" + "</p>");
//			response.getWriter().println("<p>Email: " + "shweta123@gmail.com" + "</p>");
//			response.getWriter().println("<p>Age: " + 25 + "</p>");
//
//		} else {
//			response.getWriter().println("<p>No roll number provided!</p>");
//		}
//		response.getWriter().println("</body>");
//		response.getWriter().println("</html>");
//	}
		if (rollNumber != null && !rollNumber.isEmpty()) {

            SessionFactory sessionFactory = HibernateUtils.getSessionFactoryObj();
            Session session = sessionFactory.openSession();
            Transaction txn = session.beginTransaction();
            Student fetchedStudent = session.get(Student.class, Long.parseLong(rollNumber));
            System.out.println("---- Fetched Student object from DB successfully!! ----");
            System.out.println(fetchedStudent);
            txn.commit();
            session.close();

            // Set the student object as a request attribute
            request.setAttribute("student", fetchedStudent);

            // Forward the request back to register.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("StudentRegistration.jsp");
            dispatcher.forward(request, response);
        	
        } else {
            response.getWriter().println("<p>No roll number provided!</p>");
        }
    }

}
