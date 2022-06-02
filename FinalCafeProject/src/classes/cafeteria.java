package classes;

import classes.*;
import java.util.List;

public class cafeteria {

    List<lunchAccount> accounts = manager.listAccounts();

    public cafeteria(){
        ;
    }
    public boolean processLunch(int ID, double Price){
        //Creating new variable for the new account list
        List<lunchAccount> accountList = manager.listAccounts();

        for(int x = 0; x<accountList.toArray().length; x++){
            if((accountList.get(x).getID()) == (ID)){
                return accountList.get(x).buyLunch(Price);
            }
        }
        return false;



    }
    public String displayAccount(int ID){
        List<lunchAccount> accountList = manager.listAccounts();

        for(int x = 0; x<accountList.toArray().length; x++){
            if((accountList.get(x).getID()) == (ID)){
                return accountList.get(x).Display();
            }
        }
        return "No User Nothing Found (Account may have been closed)";

    }
    public void ValuedGift(){
        List<lunchAccount> accountList = manager.listAccounts();

        for(int x = 0; x<accountList.toArray().length; x++){
            if((accountList.get(x).getSpecialCustomer())){
                accountList.get(x).refreshFunds(5);
            }
        }
    }
    public void ClosingAccounts(int ID){
        List<lunchAccount> accountList = manager.listAccounts();
        for(int x = 0; x<accountList.toArray().length; x++){
            if((accountList.get(x).getID()) == (ID)){
                accountList.get(x).closeAccount();
            }
        }
    }
    public boolean wireMoney(int IDFrom, int TOID, double TransferValue){
        List<lunchAccount> accountList = manager.listAccounts();

        lunchAccount FromAccount;
        lunchAccount ToAccount;

        for(int x = 0; x<accountList.toArray().length; x++){
            if((accountList.get(x).getID()) == (IDFrom)){
                FromAccount = accountList.get(x);
                for(int i = 0; i<accountList.toArray().length; i++){
                    if((accountList.get(i).getID()) == (TOID)){
                        ToAccount = accountList.get(i);
                        return FromAccount.lendMoney(TransferValue,ToAccount);

                    }
                }
            }
        }
        return false;
    }
}