export default class Account {
    private balance: number;
    public constructor(money: number) {
        this.balance = money;
    }

    public getBalance() {
        return this.balance;
    }

    public deposit(money: number) {
        this.balance += money;
    }
    public withdraw(money: number) {
        this.balance -= money;

    }

}