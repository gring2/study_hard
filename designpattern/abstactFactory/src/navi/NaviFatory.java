package navi;

public class NaviFatory {
    public static Navi getModelFactory(Grade grade){
        Navi fatory = null;
        switch (grade){
            case BASIC:
                fatory = new BasicModelFactory();
                break;
            case PREMIUM:
                fatory = new PremiumModelFactory();
                break;
        }
        return fatory;
    }
}
