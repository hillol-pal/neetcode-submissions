class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        items = set();
        for item in nums:
            if item in items:
                return True
            else:
                items.add(item)

        return False;
        