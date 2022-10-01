package app.Repository;

import app.Model.Alarms;

import java.sql.SQLException;
import java.util.List;

public interface IAlarmsRepository {
    public int update (int id, Alarms object) throws SQLException;


    public void create(Alarms o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public Alarms find(int id) throws SQLException ;

    public List<Alarms> findAll() throws SQLException ;
}
