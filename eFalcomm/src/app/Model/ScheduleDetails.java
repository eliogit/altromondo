package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ScheduleDetails")
public class ScheduleDetails {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long scheduleId;
  @DatabaseField
  private long weekDay;
  @DatabaseField
  private String timeFrom;
  @DatabaseField
  private String timeTo;
  @DatabaseField
  private String updateTime;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(long scheduleId) {
    this.scheduleId = scheduleId;
  }


  public long getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(long weekDay) {
    this.weekDay = weekDay;
  }


  public String getTimeFrom() {
    return timeFrom;
  }

  public void setTimeFrom(String timeFrom) {
    this.timeFrom = timeFrom;
  }


  public String getTimeTo() {
    return timeTo;
  }

  public void setTimeTo(String timeTo) {
    this.timeTo = timeTo;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

}
