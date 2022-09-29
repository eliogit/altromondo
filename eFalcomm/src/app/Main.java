package app;

import app.DAL.__DaoFactory;
import app.Model.Account;
import app.Repository.__UnitOfWork;

public class Main {
    public static void main(String[] args) throws Exception {
        Account a = new Account();
        __UnitOfWork.getInstance().getAccountService().add(a);

        //__UnitOfWork.getInstance().getAccountService().delete(1l);

        Account b = new Account();
        b.setName("elio");
        b.setPassword("234");

        __UnitOfWork.getInstance().getAccountService().update(2l,b);

        System.out.println(__UnitOfWork.getInstance().getAccountService().findAll());


    }
}