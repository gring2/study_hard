import unittest
from line.solution import Structure, add_comma


class TestSolution(unittest.TestCase):

    # def test_add(self):
    #     s = Structure()
    #     s.add(5, 3)
    #     self.assertEqual(3, s.get(5))
    #
    #     s.add(5, 6)
    #     self.assertEqual(6, s.get(5))
    #
    # def test_get_null(self):
    #     s = Structure()
    #     s.add(5, 3)
    #     self.assertEqual(3, s.get(5))
    #
    #     self.assertEqual(-1, s.get(6))
    #
    # def test_remove(self):
    #     s = Structure()
    #     s.add(5, 3)
    #     self.assertEqual(3, s.get(5))
    #     s.remove(5)
    #     self.assertEqual(-1, s.get(5))
    #
    # def test_evict_one(self):
    #     s = Structure()
    #     s.add(5, 3)
    #     self.assertEqual(3, s.get(5))
    #     s.evict()
    #     self.assertEqual(-1, s.get(5))
    #
    # def test_evict_one_two(self):
    #     s = Structure()
    #     s.add(5, 3)
    #     self.assertEqual(3, s.get(5))
    #     s.add(6, 1)
    #     s.get(5)
    #     s.evict()
    #     self.assertEqual(-1, s.get(6))
    #
    # def test_null_evict(self):
    #     s = Structure()
    #     s.evict()

    def test_navie(self):
        result = add_comma('12345')
        self.assertEqual('12,345', result)

    def test_negative(self):
        result = add_comma('-12345')
        self.assertEqual('-12,345', result)

    def test_zero(self):
        result = add_comma('0')
        self.assertEqual('0', result)

    def test_sosu(self):
        result = add_comma('12345.1235')
        self.assertEqual('12,345.1235', result)

    def test_sosu_nega(self):
        result = add_comma('-12345.1235')
        self.assertEqual('-12,345.1235', result)

    def test_zero_sosu_nega(self):
        result = add_comma('-12340.1235')
        self.assertEqual('-12,340.1235', result)

