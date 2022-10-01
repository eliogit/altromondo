package app.Service;

import app.Model.Alarms;
import app.Repository.AlarmsRepository;

import java.sql.SQLException;
import java.util.List;

public class AlarmsService implements IAlarmsService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AlarmsRepository repo = new AlarmsRepository();

    @Override
    public void add(Alarms object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public Alarms findById(int id) throws SQLException {
        return (Alarms) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, Alarms object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<Alarms> findAll() throws SQLException {
        return (List<Alarms>) repo.findAll();
    }



}
