package controller;

import model.dataAccess.SickDetailDA;
import model.entity.Sick;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SickDetail extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SickDetailDA sickDetailDA = new SickDetailDA();
        ArrayList<Sick> result = new ArrayList<>();
        if(request.getParameter("name")!=null)
        {
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            result = sickDetailDA.getSickSearch(fname,lname);
        }
        else{
            result = sickDetailDA.getSicks();
        }
        request.setAttribute("result",result);
        request.getRequestDispatcher("/patients.jsp").forward(request,response);
    }
}
