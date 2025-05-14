package lesson_35_Web_Services.classwork.service;

import lesson_35_Web_Services.classwork.dao.AccountDAO;
import lesson_35_Web_Services.classwork.model.Account;

import java.util.Map;

public class AccountService {

    public Map<Integer, Account> getAccounts() {
        return AccountDAO.ACCOUNTS;
    }

    public Account getAccountById(int id) {
        final Account account = AccountDAO.ACCOUNTS.get(id);
        if (account == null) {
            throw new RuntimeException("Account not found by id - " + id);
        }
        return account;
    }

    public Account addAccount(Account account) {
        return AccountDAO.ACCOUNTS.put(account.getId(), account);
    }

    public Account updateAccount(int id, Account account) {
        final Account result = AccountDAO.ACCOUNTS.get(id);
        if (result != null) {
            result.setFirstName(account.getFirstName());
            result.setLastName(account.getLastName());
            return result;
        }
        throw new RuntimeException("Account wasn't been found");
    }

    public Account deleteAccount(int id) {
        return AccountDAO.ACCOUNTS.remove(id);
    }
}
