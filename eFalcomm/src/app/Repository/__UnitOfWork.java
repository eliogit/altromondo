package app.Repository;

import app.Service.AccountService;

public class __UnitOfWork {
    private static __UnitOfWork instance;

    public static __UnitOfWork getInstance() {
        if (instance == null) {
            instance = new __UnitOfWork();
        }
        return instance;
    }

    public AccountService getAccountService() {
        return new AccountService();
    }
}
