import unittest
from cookpad.solution import solution


class SolutionTest(unittest.TestCase):

    def test_true(self):
        input = "- **bold***italic*%keyword%\n - %**bold keyword**%%*italic keyword*%\n- %%"
        result = solution(input)
        print(result)