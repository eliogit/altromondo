package app.Service;

import app.Model.Alarms;

import java.sql.SQLException;
import java.util.List;

public interface IAlarmsService {
    public void add(Alarms object) throws SQLException;
    public Alarms findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, Alarms object) throws SQLException;
    public List<Alarms> findAll () throws SQLException;
}
