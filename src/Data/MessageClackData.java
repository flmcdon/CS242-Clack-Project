package Data;

public class MessageClackData extends ClackData {

    public String message;
    public void MessageClackData(String userName, String message, int type) {
        super.ClackData(userName,type);
        this.message = message;
    }

    public String getData() {
        return this.message;
    }

    public String toString(){
        return "This class is called the MessageClackData class." + "\n " +
                " It is responsible for overwriting," + "\n" +
                " Hashcode(), equals() and this toString() method. " +"\n" +
                "This class also sets up constructors for" + "MessageClackData." + "\n" +
                "It also inherits from Clack Data." + "\n" +
                "Both classes use the instance variables username, message, and type";



    }
}
