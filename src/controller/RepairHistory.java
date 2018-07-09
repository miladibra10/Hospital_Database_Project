package controller;

import model.dataAccess.RepairHistoryDA;
import model.entity.RepHistory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class RepairHistory extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RepairHistoryDA repairHistoryDA = new RepairHistoryDA();
        ArrayList<RepHistory> result = repairHistoryDA.getRepairHistory();
        request.setAttribute("result",result);
        request.getRequestDispatcher("/services.jsp").forward(request,response);

    }
}
