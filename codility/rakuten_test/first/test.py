from unittest import TestCase

from rakuten_test.first import solution


class XOR_TestCase(TestCase):

    def test_xor_product(self):
        result = solution.get_xor_product(5, 8)
        self.assertEqual(12, result)

        result = solution.get_xor_product(5, 7)
        self.assertEqual(4, result)

        result = solution.get_xor_product(1, 7)
        self.assertEqual(0, result)

    def test_xor_product_tail(self):
        result = solution.get_xor_product_iterable(5, 8)
        self.assertEqual(12, result)

        result = solution.get_xor_product_iterable(5, 7)
        self.assertEqual(4, result)

        result = solution.get_xor_product_iterable(1, 7)
        self.assertEqual(0, result)

    def test_biggest_call_stack(self):
        tail = solution.get_xor_product_iterable(1, 10000000)
        self.assertEqual(True, True)
        no_tail = solution.get_xor_product(1, 256)
        self.assertEqual(True, True)
