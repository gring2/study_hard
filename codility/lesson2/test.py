import unittest
import lesson2.solution as solution


class Test(unittest.TestCase):

    def setUp(self):
        super().setUp()

    def test_shift_one_time(self):
        payload = [1,2,3,4,5]

        result = solution.solution(payload, 1)
        self.assertEqual( [5, 1, 2, 3, 4], result)

    def test_shift_three_time(self):
        payload = [3, 8, 9, 7, 6]

        result = solution.solution(payload, 3)
        self.assertEqual([9, 7, 6, 3, 8], result)

    def test_shift_len_time(self):
        payload = [3, 8, 9, 7, 6]

        result = solution.solution(payload, len(payload))
        self.assertEqual(payload, result)

    def test_one_element(self):

        result = solution.solution([-4], 0)
        self.assertEqual([-4], result)

    def test_one_element(self):

        result = solution.solution([1000], 5)
        self.assertEqual([1000], result)

    def test_empty(self):
        result = solution.solution([], 1)
        self.assertEqual([], result)

    def test_bigger_loop(self):
        result = solution.solution([1, 1, 2, 3, 5], 42)
        self.assertEqual( [3, 5, 1, 1, 2], result)