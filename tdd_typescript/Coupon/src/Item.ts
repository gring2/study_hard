export default class Item {
    private price: number;
    public name: string;
    public brand: string;

    public constructor(brand: string, name: string, price: number) {
        this.price = price
        this.brand = brand
        this.name = name
    }

    public getPrice() {
        return this.price
    }




}