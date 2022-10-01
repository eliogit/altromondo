package app.Service;

import app.Model.DoorAlarms;
import app.Repository.DoorAlarmsRepository;

import java.sql.SQLException;
import java.util.List;

public class DoorAlarmsService implements IDoorAlarmsService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    DoorAlarmsRepository repo = new DoorAlarmsRepository();

    @Override
    public void add(DoorAlarms object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public DoorAlarms findById(int id) throws SQLException {
        return (DoorAlarms) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, DoorAlarms object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<DoorAlarms> findAll() throws SQLException {
        return (List<DoorAlarms>) repo.findAll();
    }



}
