package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.Alarms;

import java.sql.SQLException;
import java.util.List;

public class AlarmsRepository implements IAlarmsRepository{
    @Override
    public int update(int id, Alarms object) throws SQLException {
        Alarms tempObject = (Alarms) __DaoFactory.getInstance().getAlarmsDao().queryForId(id);
        tempObject = object;
        tempObject.setId(id);
        return __DaoFactory.getInstance().getAlarmsDao().update(tempObject);
    }
    @Override
    public void create(Alarms o) throws SQLException {
        __DaoFactory.getInstance().getAlarmsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getAlarmsDao().delete(__DaoFactory.getInstance().getAlarmsDao().queryForId(id));
    }

    @Override
    public Alarms find(int id) throws SQLException {
        return (Alarms) __DaoFactory.getInstance().getAlarmsDao().queryForId(id);
    }

    @Override
    public List<Alarms> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAlarmsDao().queryForAll();
    }

}
