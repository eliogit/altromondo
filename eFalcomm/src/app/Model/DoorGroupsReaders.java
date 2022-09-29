package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DoorGroupsReaders")
public class DoorGroupsReaders {
  @DatabaseField
  private long doorGroupId;
  @DatabaseField
  private long readerId;


  public long getDoorGroupId() {
    return doorGroupId;
  }

  public void setDoorGroupId(long doorGroupId) {
    this.doorGroupId = doorGroupId;
  }


  public long getReaderId() {
    return readerId;
  }

  public void setReaderId(long readerId) {
    this.readerId = readerId;
  }

}
