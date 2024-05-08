import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/textarea_register")
public class Textarea_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("user_id");
		String user_pw1 = request.getParameter("user_pw1");
		String user_pw2 = request.getParameter("user_pw2");
		String user_name = request.getParameter("user_name");
		String user_mail = request.getParameter("user_mail");
		String user_tel = request.getParameter("user_tel");
		
		boolean user_pw3 = user_pw1.equals(user_pw2);

		request.setAttribute("user_pw3", user_pw3);
		request.setAttribute("user_id", user_id);
		request.setAttribute("user_pw1", user_pw1);
		request.setAttribute("user_pw2", user_pw2);
		request.setAttribute("user_name", user_name);
		request.setAttribute("user_mail", user_mail);
		request.setAttribute("user_tel", user_tel);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/textarea_register.jsp");
			dispatch.forward(request, response);
	}
}
