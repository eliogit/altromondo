package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessLevelDetails")
public class AccessLevelDetails {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long accessLevelId;
  @DatabaseField
  private long doorGroupId;
  @DatabaseField
  private long scheduleId;
  @DatabaseField
  private String updateTime;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAccessLevelId() {
    return accessLevelId;
  }

  public void setAccessLevelId(long accessLevelId) {
    this.accessLevelId = accessLevelId;
  }


  public long getDoorGroupId() {
    return doorGroupId;
  }

  public void setDoorGroupId(long doorGroupId) {
    this.doorGroupId = doorGroupId;
  }


  public long getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(long scheduleId) {
    this.scheduleId = scheduleId;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

}
