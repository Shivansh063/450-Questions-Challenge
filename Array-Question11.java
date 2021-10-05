/*
Problem Statement :- Given an array of integers nums containing n + 1 integers where each integer is 
                    in the range [1, n] inclusive.There is only one repeated 
                    number in nums, return this repeated number.

Input: nums = [1,3,4,2,2]
Output: 2
*/
class ArrayQuestion11 {
    int requiredFunction(int[] arr){
        int value=0;
        int[] newArray = new int[100001];
        for(int i=0;i<arr.length;i++){
            if(newArray[arr[i]] == 1){
                value = arr[i];
                break;
            }
            ++newArray[arr[i]];
        }
        return value;
    }
}
class RequiredClassForArray11{
    public static void main(String[] args){
        int[] arr = {1,1,2};
        ArrayQuestion11 newObject = new ArrayQuestion11();
        int ans = newObject.requiredFunction(arr);
        System.out.println(ans);
    }
}
