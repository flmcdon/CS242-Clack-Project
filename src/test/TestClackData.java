package test;

import Data.FileClackData;
import Data.MessageClackData;
import Data.ClackData;

public class TestClackData {
    public void main (String[] args) {
        MessageClackData messagecd = new MessageClackData();
        FileClackData fcd = new FileClackData();

        messagecd.getData();
        messagecd.equals("message");




    }
}
