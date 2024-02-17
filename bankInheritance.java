import java.util.*;

class Account {
    int aid, aamt, camt, nvalue;
    String hname;

    Account(int aid, String hname, int aamt, int camt, int nvalue) {
        this.aid = aid;
        this.hname = hname;
        this.aamt = aamt;
        this.camt = camt;
        this.nvalue = nvalue;
    }

    public String toString() {
        return aid + " " + hname + " " + aamt + "\n" + camt + "\n" + camt + " The balance can be negative but no less than " + nvalue;
    }
}

class VIPAccount extends Account {
    VIPAccount(int aid, String hname, int aamt, int camt, int nvalue) {
        super(aid, hname, aamt, camt, nvalue);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class bankInheritance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int aid = in.nextInt();
        String hname = in.nextLine();
        int aamt = in.nextInt();
        int camt = in.nextInt();
        int nvalue = in.nextInt();
        Account a = new VIPAccount(aid, hname, aamt, camt, nvalue);
        System.out.print(a);
        in.close();
    }
}