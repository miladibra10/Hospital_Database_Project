package controller;

import model.dataAccess.DoctorDetailDA;
import model.entity.Doctor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class DoctorDetail extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DoctorDetailDA doctorDetailDA = new DoctorDetailDA();
        ArrayList<Doctor> result;
        if(request.getParameter("firstname")!=null || request.getParameter("lastname")!=null)
        {
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            result = doctorDetailDA.getDoctorSearch(fname,lname);
        }
        else{
            result = doctorDetailDA.getDoctors();
        }
        request.setAttribute("result",result);
        request.getRequestDispatcher("/doctors.jsp").forward(request,response);
    }
}
