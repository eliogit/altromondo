package app.Service;

import app.Model.Account;
import app.Model.AccountDetails;
import app.Repository.AccountDetailsRepository;
import app.Repository.AccountRepository;

import java.sql.SQLException;
import java.util.List;

public class AccountDetailsService implements IAccountDetailsService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AccountDetailsRepository repo = new AccountDetailsRepository();

    @Override
    public void add(AccountDetails object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public AccountDetails findById(Long id) throws SQLException {
        return (AccountDetails) repo.find(id);
    }

    @Override
    public int delete(Long id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(Long id, AccountDetails object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<AccountDetails> findAll() throws SQLException {
        return (List<AccountDetails>) repo.findAll();
    }



}
