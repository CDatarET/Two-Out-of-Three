class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], 1);
        }
        
        HashMap<Integer, Integer> check = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums2.length; i++){
            if(map.get(nums2[i]) == null){
                map.put(nums2[i], 1);
                check.put(nums2[i], 1);
            }
            else{
                if(map.get(nums2[i]) == 1 && check.get(nums2[i]) == null){
                    list.add(nums2[i]);
                    map.put(nums2[i], 2);
                }
            }
        }

        for(int i = 0; i < nums3.length; i++){
            if(map.get(nums3[i]) != null && map.get(nums3[i]) == 1){
                list.add(nums3[i]);
                map.put(nums3[i], 2);
            }
        }

        return(list);
    }
}
