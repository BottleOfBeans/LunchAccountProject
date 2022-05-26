package classes;

import java.util.*;

public class manager {

    public static List<lunchAccount> accountList = new ArrayList<>(Arrays.asList());
    
    public static void addObject(lunchAccount newObject){
        accountList.add(newObject);
    }
    
    public static List listAccounts(){
        return accountList;
    }
}
