public class linear_search {
    public static void main(String args[]){
        int nums []={1154,220,32,45,54,96,84};
        int target =  51;
        int ans = linearsearch(nums , target);
        System.out.println(ans);
    }
    static int linearsearch(int arr[] , int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index<arr.length ; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
