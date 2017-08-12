package vending;

/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class VendingMachine {
    private State noMoneyState;
    private State noEnoughMoneyState;
    private State enoughMoneyState;
    private State soldOutState;

    private State state;

    private MoneyBox moneyBox;
    private  Drinking drinking;
    public VendingMachine(int stock, int price){
        noMoneyState = new NoMoneyState(this);
        noEnoughMoneyState = new NoEnoughMoneyState(this);
        enoughMoneyState = new EnoughMoneyState(this);
        soldOutState = new SoldOutState(this);
        moneyBox = new MoneyBox();
        drinking = new Drinking(stock, price);

        if(drinking.getStock() > 0) {
            state = noMoneyState;
        }
        else{
            state = soldOutState;
        }
    }
    public void setState(State state){
        this.state = state;
    }

    public void insertMoney(int money){
        state.insertCoin(money);
    }

    public void  pushButton(){
        int price = drinking.getPrice();
        state.pushButton(price);
    }

    public void returnMoeny(){
        state.returnCoin();
    }

    public MoneyBox getMoneyBox(){
        return moneyBox;
    }

    public Drinking getDrinking(){
        return drinking;
    }

    public State getNoEnoughMoneyState() {
        return noEnoughMoneyState;
    }

    public State getEnoughMoneyState() {
        return enoughMoneyState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }


}
