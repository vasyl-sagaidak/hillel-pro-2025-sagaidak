package lesson_35_Web_Services.classwork.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lesson_35_Web_Services.classwork.model.Account;
import lesson_35_Web_Services.classwork.service.AccountService;

import java.io.IOException;

@WebServlet("/account/servlet-jsp")
public class AccountViewServlet extends HttpServlet {
    private final AccountService accountService = new AccountService();


    @Override
    protected void doGet(
            HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(
            HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String idParam = req.getParameter("id");
        if (idParam == null || idParam.isEmpty()) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing 'id' parameter");
            return;
        }
        int id;

        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "'id' must be a number");
            return;
        }
        final Account accountById = accountService.getAccountById(id);
        req.setAttribute("accountRecord", accountById);

        RequestDispatcher dispatcher = req.getRequestDispatcher(
                "WEB-INF/jsp/account-record.jsp"
        );
        dispatcher.forward(req, resp);
    }
}
