package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.DoorAlarms;

import java.sql.SQLException;
import java.util.List;

public class DoorAlarmsRepository implements IDoorAlarmsRepository{
    @Override
    public int update(int id, DoorAlarms object) throws SQLException {
        DoorAlarms tempObject = (DoorAlarms) __DaoFactory.getInstance().getDoorAlarmsDao().queryForId(id);
        tempObject = object;
        tempObject.setId(id);
        return __DaoFactory.getInstance().getDoorAlarmsDao().update(tempObject);
    }
    @Override
    public void create(DoorAlarms o) throws SQLException {
        __DaoFactory.getInstance().getDoorAlarmsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getDoorAlarmsDao().delete(__DaoFactory.getInstance().getDoorAlarmsDao().queryForId(id));
    }

    @Override
    public DoorAlarms find(int id) throws SQLException {
        return (DoorAlarms) __DaoFactory.getInstance().getDoorAlarmsDao().queryForId(id);
    }

    @Override
    public List<DoorAlarms> findAll() throws SQLException {
        return __DaoFactory.getInstance().getDoorAlarmsDao().queryForAll();
    }

}
