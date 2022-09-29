package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "PendingCommands")
public class PendingCommands {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long commandAckId;
  @DatabaseField
  private long controllerId;
  @DatabaseField
  private long readerId;
  @DatabaseField
  private String command;
  @DatabaseField
  private long executionCount;
  @DatabaseField
  private String executed;
  @DatabaseField
  private String executionError;
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


  public long getCommandAckId() {
    return commandAckId;
  }

  public void setCommandAckId(long commandAckId) {
    this.commandAckId = commandAckId;
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


  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public long getExecutionCount() {
    return executionCount;
  }

  public void setExecutionCount(long executionCount) {
    this.executionCount = executionCount;
  }


  public String getExecuted() {
    return executed;
  }

  public void setExecuted(String executed) {
    this.executed = executed;
  }


  public String getExecutionError() {
    return executionError;
  }

  public void setExecutionError(String executionError) {
    this.executionError = executionError;
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
