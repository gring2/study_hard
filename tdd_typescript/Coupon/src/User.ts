import ICoupon from './ICoupon';
export default class User {
    private coupons: Array<ICoupon> = new Array();
    public constructor(id: string) {
    }

    public addCoupon(coupon: ICoupon) {
        if (coupon.isValid()) {

        }
        this.coupons.push(coupon)

    }

    public getTotalCouponCount() {
        return this.coupons.length

    }

    public getLastCoupon() {
        return this.coupons.pop()
    }
}