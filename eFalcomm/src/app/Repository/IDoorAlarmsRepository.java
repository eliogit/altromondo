package app.Repository;

import app.Model.DoorAlarms;

import java.sql.SQLException;
import java.util.List;

public interface IDoorAlarmsRepository {
    public int update (int id, DoorAlarms object) throws SQLException;


    public void create(DoorAlarms o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public DoorAlarms find(int id) throws SQLException ;

    public List<DoorAlarms> findAll() throws SQLException ;
}
