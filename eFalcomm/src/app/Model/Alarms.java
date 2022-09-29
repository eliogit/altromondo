package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Alarms")
public class Alarms {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long clientId;
  @DatabaseField
  private long controllerId;
  @DatabaseField
  private String tamperAlarm;
  @DatabaseField
  private String batteryAlarm;
  @DatabaseField
  private String acAlarm;
  @DatabaseField
  private long confirmationCount;
  @DatabaseField
  private String confirmed;
  @DatabaseField
  private String confirmationError;
  @DatabaseField
  private java.sql.Timestamp timeStamp;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public long getControllerId() {
    return controllerId;
  }

  public void setControllerId(long controllerId) {
    this.controllerId = controllerId;
  }


  public String getTamperAlarm() {
    return tamperAlarm;
  }

  public void setTamperAlarm(String tamperAlarm) {
    this.tamperAlarm = tamperAlarm;
  }


  public String getBatteryAlarm() {
    return batteryAlarm;
  }

  public void setBatteryAlarm(String batteryAlarm) {
    this.batteryAlarm = batteryAlarm;
  }


  public String getAcAlarm() {
    return acAlarm;
  }

  public void setAcAlarm(String acAlarm) {
    this.acAlarm = acAlarm;
  }


  public long getConfirmationCount() {
    return confirmationCount;
  }

  public void setConfirmationCount(long confirmationCount) {
    this.confirmationCount = confirmationCount;
  }


  public String getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(String confirmed) {
    this.confirmed = confirmed;
  }


  public String getConfirmationError() {
    return confirmationError;
  }

  public void setConfirmationError(String confirmationError) {
    this.confirmationError = confirmationError;
  }


  public java.sql.Timestamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(java.sql.Timestamp timeStamp) {
    this.timeStamp = timeStamp;
  }

}
