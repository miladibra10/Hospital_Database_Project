package controller;

import model.dataAccess.EmptyRoomsDA;
import model.entity.Room;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class EmptyRooms extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmptyRoomsDA emptyRoomsDA = new EmptyRoomsDA();
        ArrayList<Room> result = new ArrayList<>();
        request.setAttribute("result",result);
        request.getRequestDispatcher("/free-rooms.jsp").forward(request,response);
    }
}
