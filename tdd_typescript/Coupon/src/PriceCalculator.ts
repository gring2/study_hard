import Item from './Item'
import ICoupon from './ICoupon';
export default class PriceCalculator {

    public getOrderPrice(item: Item, coupon: ICoupon) {
        if (coupon.isValid() && coupon.isAppliable(item)) {
            return item.getPrice() * this.getDisCountRate(
                coupon.getDiscountPercent()
            )
        }
        return item.getPrice()
    }

    private getDisCountRate(percet: number): number {
        return (100 - percet) / 100
    }
}