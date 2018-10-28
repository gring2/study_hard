import unittest
import lesson1.solution as solution


class Test(unittest.TestCase):

    def setUp(self):
        super().setUp()

    def test_edege_case(self):
        result = solution.get_binary_gap(100)
        self.assertNotEqual(0, result)
        result = solution.get_binary_gap(1)
        self.assertEqual(0, result)
        result_ = solution.get_binary_gap(1041)
        self.assertNotEqual(0, result_)

    def test_get_binary(self):
        result = solution.convert_to_binary(2)
        self.assertEqual([1,0], result)

        one = solution.convert_to_binary(1)
        self.assertEqual([1], one)

        three = solution.convert_to_binary(3)
        self.assertEqual([1,1], three)

    def test_calc_gap(self):
        single_result = solution.calc_gap([1,0,0,1])

        self.assertEqual(2, single_result)

        double_result = solution.calc_gap([1,0,1,0,0,0,1])

        self.assertEqual(3, double_result)

    def test_zero_gap(self):
        single_result = solution.calc_gap([0,1,0,0])

        self.assertEqual(0, single_result)

        double_two = '1100'
        double_result = solution.calc_gap([1,1,0,0])

        self.assertEqual(0, double_result)

        end = '0001'
        end_result = solution.calc_gap([0,0,0,1])

        self.assertEqual(0, end_result)
