/* ************************************
Given two arrays a[] and b[] of size n and m respectively. The task is to 
find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements 
from both the arrays. If there are repetitions, then only one 
occurrence of element should be printed in the union.


two array size :- 5 3
int[] arr = {1 2 3 4 5}
int[] arr2 = {1 2 3}

Logic :- Both Array can/cannot be sorted. So I have used 4 seperate loops to implement.

****************************************************** */

class ArrayQuestion6 {
    public int requiredArrayFunction(int[] first, int[] second){
        int totalSize = 0;
        //int[] newArray = new int[first.length + second.length];
        int max = first[0];
        for(int values : first){
            if(values > max){
                max = values;
            }
        }
        for(int val : second){
            if(val > max){
                max = val;
            }
        }
        int[] newArray = new int[max+1];
        for(int values : first){
            if(newArray[values] == 0){
                newArray[values]++;
                ++totalSize;
            }
        }
        for(int values : second){
            if(newArray[values] ==0){
                ++totalSize;
            }
        }        
        return totalSize;
    }
}
class RequiredClassForArray6{
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 4, 5, 6,6};
        int[] arr2 = {1, 2,3,6};
        ArrayQuestion6 newObject = new ArrayQuestion6();
        int finalArraySize = newObject.requiredArrayFunction(arr, arr2);
        System.out.println(finalArraySize);

    }
} 
