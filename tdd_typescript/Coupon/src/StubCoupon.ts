import ICoupon from './ICoupon'
import Item from './Item'
export default class StubCoupon implements ICoupon {
    public getDiscountPercent(): number {
        return 7
    }

    public getName(): string {
        return 'Vip customer coupon'
    }

    public isAppliable(item: Item): boolean {
        if (item.name === 'knife') {
            return true

        }
        return false
    }

    public isValid(): boolean {
        return true
    }

    public doExipre() {

    }
}