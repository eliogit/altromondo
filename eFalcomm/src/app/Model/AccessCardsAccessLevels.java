package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessCardsAccessLevels")
public class AccessCardsAccessLevels {
  @DatabaseField
  private long accessCardId;
  @DatabaseField
  private long accessLevelId;


  public long getAccessCardId() {
    return accessCardId;
  }

  public void setAccessCardId(long accessCardId) {
    this.accessCardId = accessCardId;
  }


  public long getAccessLevelId() {
    return accessLevelId;
  }

  public void setAccessLevelId(long accessLevelId) {
    this.accessLevelId = accessLevelId;
  }

}
