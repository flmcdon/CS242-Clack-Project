package Data;

import java.util.Date;
public abstract class ClackData {
    public final int CONSTANT_LISTUSERS = 0;
    public final int CONSTANT_LOGOUT = 1;
    public final int CONSTANT_SENDMESSAGE = 2;
    public final int CONSTANT_SENDFILE = 3;


    private String username;
    private int type;
    private Date date;

    public void ClackData(String userName, int type){

        this.username = userName;
        this.type = type;
        this.date = new Date();

    }
    public void ClackData (int type) {
        this.ClackData("Anon" , type);
    }

    public void ClackData() {
        this.ClackData("Anon", CONSTANT_LISTUSERS);
        this.date = new Date();
    }

    public int getType() {
        return type;
    }

    public String getUserName() {
        return this.username;
    }

    public abstract Date getDate();


}

