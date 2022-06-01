package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class manager {

    public static List<lunchAccount> accountList = new ArrayList<>(Arrays.asList());

    public static void addObject(lunchAccount newObject){
        accountList.add(newObject);
    }

    public static List<lunchAccount> listAccounts(){
        return accountList;
    }
}