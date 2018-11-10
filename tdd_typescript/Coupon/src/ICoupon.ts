import Item from './Item'
export default interface ICoupon {
    getDiscountPercent(): number

    getName(): string
    isAppliable(item: Item): boolean

    isValid(): boolean

    doExipre()
}