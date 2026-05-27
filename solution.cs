public class Solution {
    public IList<int> TwoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Dictionary<int, int> d = new Dictionary<int, int>();
        IList<int> list = new List<int>();

        for(int i = 0; i < nums1.Length; i++) d[nums1[i]] = 1;
        
        Dictionary<int, int> check = new Dictionary<int, int>();
        for(int i = 0; i < nums2.Length; i++){
            if(!d.ContainsKey(nums2[i])){
                d[nums2[i]] = 1;
                check[nums2[i]] = 1;
            }
            else{
                if(d[nums2[i]] == 1 && !check.ContainsKey(nums2[i])){
                    list.Add(nums2[i]);
                    d[nums2[i]] = 2;
                }
            }
        }

        for(int i = 0; i < nums3.Length; i++){
            if(d.ContainsKey(nums3[i]) && d[nums3[i]] == 1){
                list.Add(nums3[i]);
                d[nums3[i]] = 2;
            }
        }

        return(list);
    }
}
