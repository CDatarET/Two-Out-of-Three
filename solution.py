class Solution:
    def twoOutOfThree(self, nums1, nums2, nums3):
        d = {}
        ret = []

        for n in nums1:
            d[n] = 1

        check = {}
        for n in nums2:
            if n not in d:
                check[n] = 1
                d[n] = 1
            else:
                if d[n] == 1 and n not in check:
                    ret.append(n)
                    d[n] = 2
        
        for n in nums3:
            if n in d and d[n] == 1:
                ret.append(n)
                d[n] = 2

        return ret
