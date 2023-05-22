package first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
	
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	
	String name = req.getParameter("name");
	int age = Integer.parseInt(req.getParameter("age"));
	String gender = req.getParameter("gender");
	String hobbies[] = req.getParameterValues("hobi");
	String address = req.getParameter("address");
	String comment = req.getParameter("textarea");
	/*
	Use Integer.parseInt() to Convert a String to an Integer. 
	This method returns the string as a primitive type int. ...
	
	Use Integer.valueOf() to Convert a String to an Integer. 
	This method returns the string as an integer object.
	*/
	
	pw.println("Name : "+name);
	pw.println("<br>Age : "+age);
	pw.println("<br>Gender : "+gender);
	pw.println("<br>Hobbies : ");
	 // using for each loop to display contents of hobbies
	for(String s : hobbies) {
		pw.println(" "+s+", ");
	}
	
	pw.println("<br>Address : "+address);
	pw.println("<br>Comment : "+comment);
	
	
	
	
	//GetSet gs = new GetSet();
	//gs.setName(name);
	
	//DisplayData dd = new DisplayData();
	//dd.display(gs);
	
	
}

}
