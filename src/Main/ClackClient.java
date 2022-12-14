package Main;


import Data.ClackData;

//Class declaration for ClackClient
public class ClackClient {

    //Local variable declaration
    public String userName;
    public String hostName;
    public int port;
    public int defaultPort = 7000;
    public boolean closeConnection;

    //ClackData object representing data sent to server
    ClackData dataToSendToServer = new ClackData() {

        //Allows for ClackData object
        public String getData() {
            return null;
        }
    };

    ClackData dataToReceiveFromServer = new ClackData() {
    //Allows for ClackData Object
    public String getData() {
        return null;
    }


    };

    //Constructor that takes userName, hostName, port, and connection. Sets dataToSendToServer and dataToReceiveFromServer as null.
    public void ClackClient(String userName, String hostName, int port){
        this.userName = userName;
        this.hostName = hostName;
        this.port = port;
        dataToSendToServer = null;
        dataToReceiveFromServer = null;
    }
    //Constructor that takes userName and hostName, and sets port value to 7000
    public void ClackClient (String userName, String hostName){
        this.ClackClient(userName,hostName,7000);
    }

    //Constructor that takes userName, and sets hostName to "localHost"
    public void ClackClient (String userName){
        this.userName = userName;
        hostName = "localhost";
    }

    //Default constructor for ClackClient. Sets userName to "anonymouse"
    public void ClackClient(){
        this.ClackClient("anonymous");
    }

    //Method to start
    public void start(){

    }

    //Method to read client data
    public void readClientData(){

    }

    //Method to send data
    public void sendData() {

    }

    //Method to receive data
    public void receiveData(){

    }

    //Method to print data
    public void printData(){

    }

    //Method that returns the user-name
    public String getUserName(){
        return this.userName;
    }

    //Method that returns the host name
    public String getHostName(){
        return this.hostName;
    }

    //Method that returns the port
    public int getPort(){
        return this.port;
    }

    //Overwritten Hashcode
    public int hashCode(){
        String.str;
        str.hashCode();
    }

    //Overwritten equals method
    public boolean equals(ClackClient other){
        return
                this.port == other.port &&
                        this.userName == other.userName &&
                        this.hostName == other.hostName;
    }

    public String toString(){
        return "This class is called the ClackClient class." + "\n " +
                " It is responsible for overwriting," + "\n" +
                " Hashcode(), equals() and this toString() method. " +"\n" +
                "This class also sets up constructors for" + "Clackclient" + "\n" +
                "It also inherits from Clack Data." + "\n" +
                "This class uses instance variables port, username, and hostname";
    }
}
