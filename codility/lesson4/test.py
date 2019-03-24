import unittest
from lesson4.solution import solution


class Test(unittest.TestCase):

    def test_navie(self):
        A = [3, 4, 4, 6, 1, 4, 4]
        N = 5
        result = solution(N, A)

        self.assertEqual([3, 2, 2, 4, 2], result)

    def test_one(self):
        A = [3]
        N = 5
        result = solution(N, A)

        self.assertEqual([0,0,1,0,0], result)

        A_n = [6]

        N_n = 5
        r_n = solution(N_n, A_n)

        self.assertEqual([0,0,0,0,0], r_n)

    def test_edge(self):
        A = [1, 100000]

        N = 1

        result = solution(N, A)

        self.assertEqual([1], result)
