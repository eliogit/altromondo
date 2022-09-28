package app.Model;

import com.j256.ormlite.*;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "prueba")
public class Prueba {
    @DatabaseField(id = true)
    private int id;
    @DatabaseField
    private String varc;
    @DatabaseField
    private int Column1;

    public Prueba() {
// ORMLite needs a no-arg constructor
    }
    public Prueba(int p1, String p2, int p3) {
        this.id = p1;
        this.varc = p2;
        this.Column1 = p3;
    }

    //-------------------------------------------------
    public int getId() {
        return id;
    }
    public void setId(int name) {
        this.id = name;
    }
    //-------------------------------------------------
    public String getVarc() {
        return varc;
    }
    public void setVarc(String password) {
        this.varc = password;
    }
    //-------------------------------------------------
    public int getColumn1() {
        return Column1;
    }
    public void setColumn1(int name) {
        this.Column1 = name;
    }
}