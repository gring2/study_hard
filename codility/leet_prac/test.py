import unittest
from leet_prac.solution import Solution, TreeNode


class SolutionTest(unittest.TestCase):

    def setUp(self):
        self.s = Solution()

    def test_navi(self):
        root = TreeNode(3)
        root_left = TreeNode(3)
        root_right = TreeNode(3)




        dept = self.s.maxDepth()