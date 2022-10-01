package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccountDetails")
public class AccountDetails {
    @DatabaseField(generatedId = true )
    private Long id;
    @DatabaseField(canBeNull = false, foreign = true)
    private Account account;
    @DatabaseField
    private String details;

    public AccountDetails() {
// ORMLite needs a no-arg constructor
    }
    public AccountDetails(Account account, String details) {

        this.account = account;
        this.details = details;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account accountId) {
        this.account = accountId;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

}