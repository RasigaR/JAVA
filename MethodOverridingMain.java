package Aug07;
class Bank{
    float rateOfInterest() {
        return 0;
    }
}
class SBIBank extends Bank{
    float rateOfInterest() {
        return 7;
    }
}
class PnbBank extends Bank{
    float rateOfInterest() {
        return 8;
    }
}

public class MethodOverridingMain {
    public static void main(String[] args) {
        SBIBank sobj = new SBIBank();
         PnbBank pobj=new PnbBank();
        
        System.out.println("Rate of interest = "+sobj.rateOfInterest());
        
        System.out.println("Rate of interest SBI bank= "+pobj.rateOfInterest());
        
        System.out.println("Rate of interest PNB bank= "+sobj.rateOfInterest());
        
    }

}
