import classes.lunchAccount;

public class App {
    public static void main(String[] args) throws Exception {
        lunchAccount Josh = new lunchAccount(100, 13482, true);
        Josh.Display();
        Josh.refreshFunds(10000);
        Josh.buyLunch(10080);
        Josh.refreshFunds(1);
        Josh.Display();
    }
}

