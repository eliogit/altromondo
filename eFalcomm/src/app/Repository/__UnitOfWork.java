package app.Repository;

import app.Model.AccountDetails;
import app.Model.Alarms;
import app.Model.DoorAlarms;
import app.Service.AccountDetailsService;
import app.Service.AccountService;
import app.Service.AlarmsService;
import app.Service.DoorAlarmsService;

public class __UnitOfWork {
    private static __UnitOfWork instance;

    public static __UnitOfWork getInstance() {
        if (instance == null) {
            instance = new __UnitOfWork();
        }
        return instance;
    }

    public AccountService getAccountService() {
        return new AccountService();
    }
    public AccountDetailsService getAccountDetailsService() {
        return new AccountDetailsService();
    }

    public AlarmsService getAlarmsService() {
        return new AlarmsService();
    }
    public DoorAlarmsService getDoorAlarmsService() {
        return new DoorAlarmsService();
    }

}
