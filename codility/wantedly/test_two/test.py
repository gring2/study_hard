import math
import sys

from wantedly.test_two.solution import solution
import unittest

class SolutionTest(unittest.TestCase):

    def test_onlyops(self):
        data = "+ -"

        result = solution(data)
        self.assertEqual(-1, result)

    def test_single_number(self):
        data = "13"

        result = solution(data)
        self.assertEqual(13, result)

    def test_none(self):
        data = " "

        result = solution(data)
        self.assertEqual(-1, result)

    def test_navie(self):
        data = "13 DUP 4 POP 5 DUP + DUP + -"

        result = solution(data)
        self.assertEqual(7, result)

    def test_navie_err(self):
        data = "5 6 + -"

        result = solution(data)
        self.assertEqual(-1, result)

    def test_big_number(self):

        data = "1048576 DUP + DUP +"

        result = solution(data)
        self.assertEqual(-1, result)

    def test_prod(self):
        r = math.pow(2, 20)
        self.assertEqual(1048576, r)
