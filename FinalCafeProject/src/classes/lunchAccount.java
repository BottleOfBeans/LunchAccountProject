package classes;
import classes.manager;

public class lunchAccount{
    //Initilizing all variables
    public double value;
    public int ID;
    public boolean specialCustomer;
    public String customerName;

    public lunchAccount(double ValueInput, int IDInput, boolean CustomerInput, String CustomerNameInput){
        value = ValueInput;
        ID = IDInput;
        specialCustomer = CustomerInput;
        customerName = CustomerNameInput;
    }

    //One more function for ease of life
    public void checkForSpecial(){
        if(value>50){
            specialCustomer = true;
            System.out.println("Congrats you're valid");
        }else{
            System.out.println("Congrats you're NOT VALID L");
            specialCustomer = false;
        }
    }

    //Setting the information
    public  void setValue(double valueGiven){
        value = valueGiven;
    }
    public  void setID(int IDGiven){
        ID = IDGiven;
    }
    public  void setSpecialCustomer(boolean specialGiven){
        specialCustomer = specialGiven;
    }

    //Getting the information
    public  double getValue(){
        return value;
    }
    public  int getID(){
        return ID;
    }
    public  boolean getSpecialCustomer(){
        return specialCustomer;
    }

    //Custom Methods
    public  void Display(){
        if(ID == -1){
            System.out.println("Account Has Been Closed, L+Ratio");
            return;
        }
        checkForSpecial();
        String statement;
        if(specialCustomer){
            statement = "Rich mf";
        }else{
            statement = "Broke mf";
        }
        System.out.println(String.format("Student ID                : "+ID));
        System.out.println(String.format("Student Amount            : "+value));
        System.out.println(String.format("Student Valued Customer   : "+statement));
    }

    public  boolean buyLunch(int price){
        if(ID == -1){
            System.out.println("Account Has Been Closed, L+Ratio");
            return false;
        }
        System.out.println("Attempting to buy lunch \n");
        if(specialCustomer){
            price = price-(price/10);
        }
        if(ID != -1){
            if(value>=price){
                value = value-price;
                System.out.println("Lunch has been bought");
                checkForSpecial();
                return true;
            }else{
                System.out.println("Error with purchase.");
                checkForSpecial();
                return false;
            }
        }else{
            System.out.println("Error with purchase.");
            checkForSpecial();
            return false;
        }
    }

    public  void refreshFunds(int addAmount){
        if(ID == -1){
            System.out.println("Account Has Been Closed, L+Ratio");
            return;
        }
        System.out.println("Attempting to refresh funds");
        value = value+addAmount;
        checkForSpecial();
    }

    public void closeAccount(){
        if(ID == -1){
            System.out.println("Account Has Been Closed, L+Ratio");
            return;
        }
        value = 0;
        ID = -1;
        System.out.println("Thank you for NOT USING this service, go away man it hurt my feelings :)...");
    }

    public void lendMoney(double amountLend, lunchAccount accountLendTo){
        if(value>amountLend){
            accountLendTo.setValue(accountLendTo.getValue()+amountLend);
            value = value-amountLend;
        }else{
            accountLendTo.setValue(accountLendTo.getValue()+value);
            value = 0;
        }
    }
}
