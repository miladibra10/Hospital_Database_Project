package controller;

import model.dataAccess.DrugDetailDA;
import model.entity.Drug;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class DrugDetail extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DrugDetailDA drugDetailDA = new DrugDetailDA();
        ArrayList<Drug> result = drugDetailDA.getDrugs();
        request.setAttribute("result",result);
        request.getRequestDispatcher("/drugs.jsp").forward(request,response);
    }
}
