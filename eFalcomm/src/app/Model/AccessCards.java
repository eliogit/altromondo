package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessCards")
public class AccessCards {

  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long updateCount;
  @DatabaseField
  private long accessCardId;
  @DatabaseField
  private String format;
  @DatabaseField
  private long facilityCode;
  @DatabaseField
  private long number;
  @DatabaseField
  private String validFrom;
  @DatabaseField
  private String validTo;
  @DatabaseField
  private String enabled;
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


  public long getUpdateCount() {
    return updateCount;
  }

  public void setUpdateCount(long updateCount) {
    this.updateCount = updateCount;
  }


  public long getAccessCardId() {
    return accessCardId;
  }

  public void setAccessCardId(long accessCardId) {
    this.accessCardId = accessCardId;
  }


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public long getFacilityCode() {
    return facilityCode;
  }

  public void setFacilityCode(long facilityCode) {
    this.facilityCode = facilityCode;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }


  public String getValidTo() {
    return validTo;
  }

  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }


  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
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
