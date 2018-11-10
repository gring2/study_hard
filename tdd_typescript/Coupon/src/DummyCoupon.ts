import ICoupon from './ICoupon'
import Item from './Item'
export default class DummyCoupon implements ICoupon {
    public getDiscountPercent(): number {
        return 0
    }

    public getName(): string {
        return null
    }

    public isAppliable(item: Item): boolean {
        return false
    }

    public isValid(): boolean {
        return false
    }

    public doExipre() {

    }
}