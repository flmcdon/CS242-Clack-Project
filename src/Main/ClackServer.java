package Main;

public class ClackServer  {
    public int port;
    public boolean closeConnection;
    public final int defPort = 7000;

    public String dataToReceiveFromClient;
    public String dataToSendToClient;


    public void ClackServer( int port ){
        this.port = port;
        this.dataToReceiveFromClient = null;
        this.dataToSendToClient = null;
    }
    public void SlackServer(){
        this.ClackServer(defPort);
    }
    public void start(){

    }

    public void receiveData(){

    }
    public void sendData(){

    }

    public int getPort(){
        return this.port;
    }

    public int hashCode(){
        return 0x800;
    }
    public boolean equals(ClackServer other){
        return
                this.port == other.port &&
                this.dataToSendToClient == other.dataToSendToClient &&
                this.dataToReceiveFromClient == other.dataToReceiveFromClient;
    }

    public String toString(){
        return "This class is called the ClackServer class." + "\n " +
                " It is responsible for overwriting," + "\n" +
                " Hashcode(), equals() and this toString() method. " +"\n" +
                "This class also sets up constructors for" + "ClackServer, start, receiveData, sendData, and getPort" + "\n" +
                "It also inherits from Clack Data." + "\n" +
                "This class uses instance variables port, closeConnection, dataToReceiveFromClient, and dataToSendToClient";
    }


}
