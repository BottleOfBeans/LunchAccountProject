package classes;

import classes.*;
import java.util.List;

public class cafeteria {

    List<lunchAccount> accounts = manager.listAccounts();

    public cafeteria(){
        ;
    }
    public boolean processLunch(int ID, double Price){
        //Creating placeholder for the new ID;
        for(int x=accounts.toArray().length-1; x>=0; x--){
            if(accounts.get(x).getID() == ID){
                accounts.get(x).buyLunch(Price);
                return true;
            }else{
                return false;
            }
        }
        return false;




    }
    public java.util.List<lunchAccount> displayAccounts(){
        return manager.listAccounts();
    }



}