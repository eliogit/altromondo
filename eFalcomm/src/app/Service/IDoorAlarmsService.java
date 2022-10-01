package app.Service;

import app.Model.DoorAlarms;

import java.sql.SQLException;
import java.util.List;

public interface IDoorAlarmsService {
    public void add(DoorAlarms object) throws SQLException;
    public DoorAlarms findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, DoorAlarms object) throws SQLException;
    public List<DoorAlarms> findAll () throws SQLException;
}
