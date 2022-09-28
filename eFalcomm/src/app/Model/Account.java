package app.Model;

import app.DAL._GenericDaoImpl;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Account")
public class Account {
    @DatabaseField(generatedId = true )
    private Long id;
    @DatabaseField
    private String name;
    @DatabaseField
    private String password;
    public Account() {
// ORMLite needs a no-arg constructor
    }
    public Account( String name, String password) {

        this.name = name;
        this.password = password;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}