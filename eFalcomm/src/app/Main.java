package app;

import app.DAL.__DaoFactory;
import app.Model.Account;
import app.Model.AccountDetails;
import app.Model.Alarms;
import app.Model.DoorAlarms;
import app.Repository.__UnitOfWork;
import com.j256.ormlite.dao.EagerForeignCollection;
import com.j256.ormlite.dao.ForeignCollection;

import java.time.Instant;
import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //creo alarm

        Alarms alarm = new Alarms();
        alarm.setAcAlarm(true);
        alarm.setBatteryAlarm(true);
        alarm.setClientId(56);
        alarm.setTamperAlarm(false);
        alarm.setConfirmed(true);
        alarm.setConfirmationError(false);
        alarm.setControllerId(88);
        alarm.setTimeStamp(Date.from(Instant.now()));

        __UnitOfWork.getInstance().getAlarmsService().add(alarm);

        //Creo 3 door alarm para Alarm
        DoorAlarms dAlarm = new DoorAlarms();
        dAlarm.setAlarms(alarm);
        dAlarm.setDoorForced(true);
        dAlarm.setReaderId(12);
        dAlarm.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().add(dAlarm);

        DoorAlarms dAlarm2 = new DoorAlarms();
        dAlarm2.setAlarms(alarm);
        dAlarm2.setDoorForced(true);
        dAlarm2.setReaderId(13);
        dAlarm2.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().add(dAlarm2);

        DoorAlarms dAlarm3 = new DoorAlarms();
        dAlarm3.setAlarms(alarm);
        dAlarm3.setDoorForced(true);
        dAlarm3.setReaderId(14);
        dAlarm3.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().add(dAlarm3);


        //update
        DoorAlarms updated = __UnitOfWork.getInstance().getDoorAlarmsService().findById(2);
        updated.setAlarms(alarm);
        updated.setDoorForced(true);
        updated.setReaderId(99);
        updated.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().update(2,updated);

        //delete
        __UnitOfWork.getInstance().getAlarmsService().delete(12);

        //find
        Alarms alarmaShow = __UnitOfWork.getInstance().getAlarmsService().findById(13);
        System.out.println(alarmaShow.getControllerId() +" - "+ alarmaShow.getConfirmationCount());
        for (DoorAlarms da:alarmaShow.getDoorAlarms())
        {
            System.out.println(da.getId());
        }




    }
}