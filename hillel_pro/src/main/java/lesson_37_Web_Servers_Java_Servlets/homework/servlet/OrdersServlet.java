package lesson_37_Web_Servers_Java_Servlets.homework.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lesson_37_Web_Servers_Java_Servlets.homework.model.Order;
import lesson_37_Web_Servers_Java_Servlets.homework.model.Product;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet("/api/orders")
public class OrdersServlet extends HttpServlet {
    private final Map<Integer, Order> orderMap = new ConcurrentHashMap<>();
    private final ObjectMapper mapper = new ObjectMapper();

    {
        // По умолчанию Jackson не умеет сериализовать LocalDateTime без доп. настройки.
        // По этой причине возникает необходимость добавить депенденси jackson-jsr310 версия которого
        // должна быть такой же как у Jackson Core, а так же прописать настройки здесь
        // при инициализации маппера:
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        Order order = new Order(1);
        order.addProduct(new Product(1, "Oranges", 15.0));
        order.addProduct(new Product (2, "Nuts", 3.99));
        order.addProduct(new Product(3, "Water", 1.50));
        orderMap.put(1,order);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String id = req.getParameter("id");
        if (id == null) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.setContentType("text/plain");
            resp.getWriter().write("Missing required parameter 'id' which must be a number in form ?id={'id'}");
            return;
        }

        try {
            Order order = orderMap.get(Integer.parseInt(id));
            if (order == null) {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                return;
            } else {
                resp.setContentType("application/json");
                mapper.writeValue(resp.getOutputStream(), order);
                resp.setStatus(HttpServletResponse.SC_OK);
            }
        } catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.setContentType("text/plain");
            resp.getWriter().write("Invalid id parameter, must be a number");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Order order = mapper.readValue(req.getInputStream(), Order.class);

        // Нужно добавить пересчет orderCost вручную после чтения, потому что Jackson не
        // вызывает метод addProduct а просто устанавливает поля напрямую. Что-бы
        // orderCost не был 0.0 после передачи в JSON продуктов.

        double totalCost = order.getProducts().stream()
                .mapToDouble(Product::getProductCost)
                        .sum();

        order.setOrderCost(totalCost);

        orderMap.put(order.getId(), order);
        resp.setStatus(HttpServletResponse.SC_CREATED);
        resp.setContentType("application/json");
        mapper.writeValue(resp.getOutputStream(), order);
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
}
