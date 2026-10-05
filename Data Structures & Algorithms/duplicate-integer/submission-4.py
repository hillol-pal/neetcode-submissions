class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        input_length = len(nums);
        print(input_length);

        hs = set(nums);
        
        if(len(hs) == input_length):
            return False;

        return True;
