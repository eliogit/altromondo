package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Transactions")
public class Transactions {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long clientId;
  @DatabaseField
  private long controllerId;
  @DatabaseField
  private long readerId;
  @DatabaseField
  private long messageId;
  @DatabaseField
  private long eventCode;
  @DatabaseField
  private String eventDateTime;
  @DatabaseField
  private long accessCardId;
  @DatabaseField
  private String extra;
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


  public long getReaderId() {
    return readerId;
  }

  public void setReaderId(long readerId) {
    this.readerId = readerId;
  }


  public long getMessageId() {
    return messageId;
  }

  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }


  public long getEventCode() {
    return eventCode;
  }

  public void setEventCode(long eventCode) {
    this.eventCode = eventCode;
  }


  public String getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  public long getAccessCardId() {
    return accessCardId;
  }

  public void setAccessCardId(long accessCardId) {
    this.accessCardId = accessCardId;
  }


  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
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
