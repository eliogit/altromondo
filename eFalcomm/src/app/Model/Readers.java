package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Readers")
public class Readers {
  @DatabaseField(generatedId = true )
  private long id;
  @DatabaseField
  private long readerType;
  @DatabaseField
  private long accessDirection;
  @DatabaseField
  private long normalAccessTime;
  @DatabaseField
  private long extendedAccessTime;
  @DatabaseField
  private long doorRetentionTime;
  @DatabaseField
  private long strikeRelayTime;
  @DatabaseField
  private long minimumOpeningTime;
  @DatabaseField
  private long rexOpeningTime;
  @DatabaseField
  private long doorOpeningMode;
  @DatabaseField
  private long rexOpeningMode;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getReaderType() {
    return readerType;
  }

  public void setReaderType(long readerType) {
    this.readerType = readerType;
  }


  public long getAccessDirection() {
    return accessDirection;
  }

  public void setAccessDirection(long accessDirection) {
    this.accessDirection = accessDirection;
  }


  public long getNormalAccessTime() {
    return normalAccessTime;
  }

  public void setNormalAccessTime(long normalAccessTime) {
    this.normalAccessTime = normalAccessTime;
  }


  public long getExtendedAccessTime() {
    return extendedAccessTime;
  }

  public void setExtendedAccessTime(long extendedAccessTime) {
    this.extendedAccessTime = extendedAccessTime;
  }


  public long getDoorRetentionTime() {
    return doorRetentionTime;
  }

  public void setDoorRetentionTime(long doorRetentionTime) {
    this.doorRetentionTime = doorRetentionTime;
  }


  public long getStrikeRelayTime() {
    return strikeRelayTime;
  }

  public void setStrikeRelayTime(long strikeRelayTime) {
    this.strikeRelayTime = strikeRelayTime;
  }


  public long getMinimumOpeningTime() {
    return minimumOpeningTime;
  }

  public void setMinimumOpeningTime(long minimumOpeningTime) {
    this.minimumOpeningTime = minimumOpeningTime;
  }


  public long getRexOpeningTime() {
    return rexOpeningTime;
  }

  public void setRexOpeningTime(long rexOpeningTime) {
    this.rexOpeningTime = rexOpeningTime;
  }


  public long getDoorOpeningMode() {
    return doorOpeningMode;
  }

  public void setDoorOpeningMode(long doorOpeningMode) {
    this.doorOpeningMode = doorOpeningMode;
  }


  public long getRexOpeningMode() {
    return rexOpeningMode;
  }

  public void setRexOpeningMode(long rexOpeningMode) {
    this.rexOpeningMode = rexOpeningMode;
  }

}
