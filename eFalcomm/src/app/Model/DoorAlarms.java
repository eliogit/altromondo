package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DoorAlarms")
public class DoorAlarms {
  @DatabaseField(generatedId = true )
  private int id;
  @DatabaseField
  private int readerId;
  @DatabaseField(canBeNull = false)
  private boolean doorLeftOpened;
  @DatabaseField(canBeNull = false)
  private boolean doorForced;

  @DatabaseField(canBeNull = false, foreign = true, columnName="AlarmId")
    private Alarms alarm;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getReaderId() {
    return readerId;
  }

  public void setReaderId(int readerId) {
    this.readerId = readerId;
  }


  public boolean getDoorLeftOpened() {
    return doorLeftOpened;
  }

  public void setDoorLeftOpened(boolean doorLeftOpened) {
    this.doorLeftOpened = doorLeftOpened;
  }


  public boolean getDoorForced() {
    return doorForced;
  }

  public void setDoorForced(boolean doorForced) {
    this.doorForced = doorForced;
  }


  public Alarms getAlarms() {
    return alarm;
  }

  public void setAlarms(Alarms alarm) {
    this.alarm = alarm;
  }

}
