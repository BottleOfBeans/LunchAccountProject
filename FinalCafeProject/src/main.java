//Class Imports
import classes.*;

//UI Test Imports
import javax.swing.*;
import java.util.*;


public class main {
    public static void main(String[] args) throws Exception {
        new UI();

        lunchAccount Josh = new lunchAccount(100, 13482, true, "Josh");
        manager.addObject(Josh);

        lunchAccount Will = new lunchAccount(200, 13157, true, "Will");
        manager.addObject(Will);

        lunchAccount Luca = new lunchAccount(300, 14582, true, "Luca");
        manager.addObject(Luca);

        List<lunchAccount> accountList = manager.listAccounts();
        lunchAccount FirstAccount = accountList.get(0);
        System.out.println(FirstAccount.getID());

        //MainMenu();
        Josh.Display();
        Will.Display();


    }
}

