class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = hashMapOf<Int, Int>()
        for(i in 0..nums.size-1){
            val temp = target - nums[i]
            if(map.containsValue(nums[i])){
                val keys = map.filterValues { it == nums[i] }.keys
                return intArrayOf(keys.first(), i)
            }
            map.put(i, temp)
        }
        throw IllegalArgumentException("No two sum solution");
    }
}
