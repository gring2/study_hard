from unittest import TestCase

from rakuten_test.second import solution


class SolutionTest(TestCase):
    def test_navie_case(self):
        s = 'BAR'
        count = solution.solution(s)
        self.assertEqual(2, count)

    def test_navie_case2(self):
        s = 'AABB'
        count = solution.solution(s)
        self.assertEqual(1, count)

    def test_navie_case3(self):
        s = 'AABCY'
        count = solution.solution(s)
        self.assertEqual(6, count)

    def test_navie_case_zero1(self):
        s = 'AAAB'
        count = solution.solution(s)
        self.assertEqual(0, count)

    def test_single_c(self):
        s = 'B'
        count = solution.solution(s)
        self.assertEqual(1, count)

    def test_single_v(self):
        s = 'A'
        count = solution.solution(s)
        self.assertEqual(0, count)

    def test_all_v(self):
        s = 'AAAAA'
        count = solution.solution(s)
        self.assertEqual(0, count)

    def test_all_c(self):
        s = 'BBBBB'
        count = solution.solution(s)
        self.assertEqual(0, count)

    def test_nn(self):
        s = 'AAAAAAAAAAAAAAABBBBBBBBBBBBBBB'
        count = solution.solution(s)
        self.assertEqual(1, count)

    def test_nn2(self):
        s = 'ABABC'
        count = solution.solution(s)
        self.assertEqual(3, count)

    def test_nn3(self):
        s = 'AAAAAAAAAAAAAABBBBBBBBBBBBBFC'
        count = solution.solution(s)
        self.assertEqual(210, count)

    def test_duple3set(self):
        s = 'BABABACICICICIDIDIDID'
        count = solution.solution(s)
        self.assertEqual(210, count)

