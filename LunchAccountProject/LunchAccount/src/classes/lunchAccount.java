package classes;

public class lunchAccount{
    //Initilizing all variables
    public double value;
    public int ID;
    public boolean specialCustomer;

    public lunchAccount(double ValueInput, int IDInput, boolean CustomerInput){
        value = ValueInput;
        ID = IDInput;
        specialCustomer = CustomerInput;
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
        System.out.println("Attempting to buy lunch \n");
        if(specialCustomer){
            price = price-(price/10);
        }
        if(ID != -1){
            if(value>price){
                value = value-price;
                System.out.println("Lunch has been bought");
                return true;
            }else{
                System.out.println("Error with purchase.");
                return false;
            }
        }else{
            System.out.println("Error with purchase.");
            return false;
        }
    }

    public  void refreshFunds(int addAmount){
        System.out.println("Attempting to refresh funds");
        value = value+addAmount;
        if(value>50){
            System.out.println("Congrats you're valid on god.");
            specialCustomer = true;
        }
    }


}
