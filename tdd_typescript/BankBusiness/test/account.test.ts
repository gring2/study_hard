import Account from "../src/Account";

describe('testAccount', () => {
    test('testAccount', () => {
        let account = new Account(1000)
        expect(account !== null).toBeTruthy()
        expect(account["balance"] !== undefined).toBeTruthy()

    });

})

describe('testGetBalance', () => {
    test('create account with 1000 balance and inquiry balance', () => {
        let account = new Account(1000)
        expect(account.getBalance()).toBe(1000);
    });

    test('create account with 100 balance and inquiry balance', () => {
        let account = new Account(100)

        expect(account.getBalance()).toBe(100);

    })

    test('create account with 0 balance and inquiry balance', () => {
        let account = new Account(0)
        expect(account.getBalance()).toBe(0);
    });


})

describe('testDeposit', () => {
    let account = new Account(100);

    account.deposit(100);

    test('expect 200 after deposit', () => {
        expect(account.getBalance()).toBe(200)
    })
})

describe('testWidthDraw', () => {
    let account = new Account(100);
    account.withdraw(100);
    test('expect 0 after withdraw', () => {
        expect(account.getBalance()).toBe(0)
    })

})