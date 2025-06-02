package lesson_37_Web_Servers_Java_Servlets.homework.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lesson_37_Web_Servers_Java_Servlets.homework.model.Order;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet("/api/orders")
public class OrdersServlet extends HttpServlet {
    private final Map<Integer, Order> orderMap = new ConcurrentHashMap<>();
    private final ObjectMapper mapper = new ObjectMapper();

    {
        orderMap.put(1,new Order(1));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
    Order order = orderMap.get(Integer.parseInt(id));
    if (order == null) {
        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        return;
    }
    resp.setContentType("application/json");
    mapper.writeValue(resp.getOutputStream(), order);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Order order = mapper.readValue(req.getInputStream(), Order.class);
        orderMap.put(order.getId(), order);
        resp.setStatus(HttpServletResponse.SC_CREATED);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Order order = mapper.readValue(req.getInputStream(), Order.class);
        if (!orderMap.containsKey(order.getId())) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        orderMap.put(order.getId(), order);
        resp.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        orderMap.remove(Integer.parseInt(req.getParameter("id")));
        resp.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id;
        try {
           id = Integer.parseInt(req.getParameter("id"));
        } catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        if(!orderMap.containsKey(id)) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        } else {
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.setContentType("application/json");
        }
    }
}
