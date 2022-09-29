package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DoorAlarms")
public class DoorAlarms {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long readerId;
  @DatabaseField
  private String doorLeftOpened;
  @DatabaseField
  private String doorForced;
  @DatabaseField
  private long alarmId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getReaderId() {
    return readerId;
  }

  public void setReaderId(long readerId) {
    this.readerId = readerId;
  }


  public String getDoorLeftOpened() {
    return doorLeftOpened;
  }

  public void setDoorLeftOpened(String doorLeftOpened) {
    this.doorLeftOpened = doorLeftOpened;
  }


  public String getDoorForced() {
    return doorForced;
  }

  public void setDoorForced(String doorForced) {
    this.doorForced = doorForced;
  }


  public long getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(long alarmId) {
    this.alarmId = alarmId;
  }

}
