package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String enteredValue;
       enteredValue = request.getParameter("enteredValue");
        String [] selectedOptions = request.getParameterValues("options");
        try{
            response.setContentType("text/html");
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<br/>");
            if(selectedOptions!=null){
                for (String option:selectedOptions){
                    printWriter.print(option);
                    printWriter.println("<br/>");

                }
            }
            printWriter.println("<p>");
           printWriter.println(enteredValue);
            printWriter.println("</p>");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
