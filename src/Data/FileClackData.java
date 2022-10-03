package Data;

public class FileClackData extends ClackData {
    private String fileName;
    private String fileContents;

    public void FileClackData (String userName, String fileName, int type){
        super.ClackData(userName, type);
        this.fileName = fileName;
    }

    public void FileClackData() {
        super.ClackData();
        this.fileName = fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }

    public String getData() {
        return this.fileContents;
    }

    public void readFileContents() {

    }

    public void writeFileContents(){

    }

    public String toString() {
        return "This class is called the FileClackData class." + "\n " +
                " It is responsible for overwriting," + "\n" +
                " Hashcode(), equals() and this toString() method. " +"\n" +
                "This class also sets up constructors for" + "FileClackData." + "\n" +
                "It also inherits from Clack Data." + "\n" +
                "Both classes use the instance variables username and type";
    }

    public int hashCode() {
         return 0x900;
    }

    public boolean equals(FileClackData other){
        return this.fileName == other.fileName && this.fileContents == other.fileContents;
    }

}
