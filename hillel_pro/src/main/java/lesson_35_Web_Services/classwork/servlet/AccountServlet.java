package lesson_35_Web_Services.classwork.servlet;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lesson_35_Web_Services.classwork.model.Account;
import lesson_35_Web_Services.classwork.service.AccountService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/account/servlet")
public class AccountServlet extends HttpServlet {

    private final AccountService accountService = new AccountService();
    private final Gson gson = new Gson();

    @Override
    protected void doGet(
            HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("GET");
        try(PrintWriter writer = resp.getWriter()) {
            final String id = req.getParameter("id");
            if (id == null) {
                System.out.println(accountService.getAccounts());
                writer.println(gson.toJson(accountService.getAccounts()));
            } else {
                try {
                    System.out.println(accountService.getAccountById(Integer.parseInt(id)));
                    writer.println(gson.toJson(accountService.getAccountById(Integer.parseInt(id))));
                    writer.println(accountService.getAccountById(Integer.parseInt(id)));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    resp.setStatus(404);
                    writer.println("Account not found!");
                }
            }
        }
    }

    @Override
    protected void doPost(
            HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("POST");
        final Account account = gson.fromJson(req.getReader(), Account.class);
        accountService.addAccount(account);
        System.out.println(account);
    }

    @Override
    protected void doPut(
            HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPut(req, resp);
    }
}
