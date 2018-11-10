import User from "../src/User";
import ICoupon from "../src/ICoupon";
import DummyCoupon from "../src/DummyCoupon";
import StubCoupon from "../src/StubCoupon";
import PriceCalculator from "../src/PriceCalculator";
import Item from "../src/Item";

describe('Counpon Test', () => {
    test('testAddCoupon', () => {
        let user: User = new User('area88')
        expect(user.getTotalCouponCount()).toBe(0)

        let counpon: ICoupon = new DummyCoupon();

        user.addCoupon(counpon)
        expect(user.getTotalCouponCount()).toBe(1)

    })

    test('testGetLastOccupiedCoupon', () => {
        let user: User = new User('area88')
        let coupon = new StubCoupon()
        user.addCoupon(coupon)
        let lastCoupon = user.getLastCoupon()
        expect(lastCoupon.getDiscountPercent()).toBe(7)
        expect(lastCoupon.getName()).toBe('Vip customer coupon')
    })

    test('testGetOrderPrice_discoutableItem', () => {
        let priceCalculator = new PriceCalculator()
        let item = new Item('LightSavor', 'knife', 100000)
        let coupon = new StubCoupon()

        expect(priceCalculator.getOrderPrice(item, coupon)).toBe(93000)
    })

    test('testGetOrderPrice_undiscountableItem', () => {
        let priceCalculator = new PriceCalculator()
        let item = new Item('R2D2', 'alarm', 20000)
        let coupon = new StubCoupon()
        expect(priceCalculator.getOrderPrice(item, coupon)).toBe(20000)

    })
    test('mock test', () => {
        let MockCounpon = jest.fn<ICoupon>(
            () => ({
                isValid: jest.fn().mockImplementationOnce(() => {
                    return true;
                })
            })
        );
        let mockCoupon = new MockCounpon()
        let user: User = new User('area88')
        user.addCoupon(mockCoupon)
        expect(mockCoupon.isValid).toHaveBeenCalled();
    })
})

