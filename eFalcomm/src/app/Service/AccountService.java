package app.Service;

import app.Model.Account;
import app.Repository.AccountRepository;

import java.sql.SQLException;
import java.util.List;

public class AccountService implements IAccountService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AccountRepository repo = new AccountRepository();

    @Override
    public void add(Account object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public Account findById(Long id) throws SQLException {
        return (Account) repo.find(id);
    }

    @Override
    public int delete(Long id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(Long id, Account object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<Account> findAll() throws SQLException {
        return (List<Account>) repo.findAll();
    }



}
