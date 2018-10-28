describe('Basic Types', () => {
    test('Enum#number', () => {
        enum Color { Red, Green, Blue }
        let c: Color = Color.Green
        expect(c).toBe(1)
    })
    test('Enum#name', () => {
        enum Color { Red = 1, Green, Blue }
        let colorName: string = Color[2]
        expect(colorName).toBe('Green')
    })
})

import { compile } from '../utils'

describe('Basic Types', () => {
    test('Boolean', () => {
        let isDone: boolean = false
        expect(typeof isDone).toBe('boolean')

        const diagnostics = compile(`
      let isDone: boolean = 1
    `)

        expect(diagnostics[0]).toEqual(`Type '1' is not assignable to type 'boolean'.`)
    })
})