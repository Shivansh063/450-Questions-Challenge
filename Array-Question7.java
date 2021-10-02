/* ******************************
Problem Statement :- Cyclically rotate an array by one
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
First Logic = 1) stores values in new Array. 
              2) Implemented below using two variables
              
**********************************/
class ArrayQuestion7{
    public void requiredFunction(int[] arr){
        int firstValue = arr[arr.length-1];
        int mid=0;
        //int[] newArray = new int[arr.length];
        //newArray[0] = firstValue;
        for(int i=0;i<arr.length;i++){
            mid = arr[i];
            //newArray[i+1] =arr[i];
            arr[i] = firstValue;
            firstValue = mid; 
        }
        //return newArray;
    }
}
class RequiredClassForArray7{
    public static void main(String[] args){
        int A[] = {9, 8, 7, 6, 4, 2, 1, 3};
        //int A[] = {1,2, 3,4,5};
        ArrayQuestion7 newObject = new ArrayQuestion7();
        newObject.requiredFunction(A);
        //for(int values : newObject.requiredFunction(A))
        for(int values: A)
        {
            System.out.print(values + " ");
        } 
    }
}