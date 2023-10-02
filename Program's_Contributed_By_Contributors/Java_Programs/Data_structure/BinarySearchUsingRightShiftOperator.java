class main {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + end >>> 1;
            
            if(target < nums[mid]) {
                end = --mid;
            }
            else if(target > nums[mid]){
                start = ++mid;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
