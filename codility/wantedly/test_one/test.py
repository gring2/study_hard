from wantedly.test_one.solution import solution
import unittest


class SolutionTest(unittest.TestCase):

    def test_navie(self):
        data = 123456
        result = solution(data)
        self.assertEqual(162534, result)


    def test_one(self):

        data = 0
        result = solution(data)
        self.assertEqual(0, result)

    def test_samechar(self):

        data = 1000001
        result = solution(data)
        self.assertEqual(1100000, result)

    def test_big(self):

        data = 100000000

        result = solution(data)
        self.assertEqual(100000000, result)

    def test_navie2(self):

        data = 130

        result = solution(data)
        self.assertEqual(103, result)
