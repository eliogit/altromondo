package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Schedules")
public class Schedules {
  @DatabaseField(generatedId = true )
  private long id;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
