/* ******************************
Requirement :- Move all negative numbers to beginning and 
positive to end with constant extra space

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5

Complexity of Below Solution :- O(n) 
********************************* */
class ArrayQuestion5 {
    public void sortingNumberFunction(int[] arr){
        int countNegetive=0,countPositive=0;
        for(int val : arr){
            if(val < 0){
                countNegetive++;
            }
        }
        countPositive = arr.length - countNegetive;
        int[] positiveArray = new int[countPositive];
        int[] negetiveArray = new int[countNegetive];
        int firstIndex=0,secondIndex=0;
        for(int val : arr){
            if(val < 0){
                negetiveArray[firstIndex] = val;
                firstIndex++;
            }
            else{
                positiveArray[secondIndex] = val;
                secondIndex++;
            }
        }
        int i=0,j=0;
        int k=0;
        while(i<firstIndex || j< secondIndex){
            if(i == firstIndex){
                arr[k] = positiveArray[j];
                j++;
            }
            else{
                arr[k] = negetiveArray[i];
                i++;
            }
            k++;
        }

    }
}

class RequiredClassForArray5{
    public static void main(String[] args){
        int[] arr =  {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        ArrayQuestion5 newObject = new ArrayQuestion5();
        newObject.sortingNumberFunction(arr);
        for(int values : arr){
            System.out.print(values + " ");
        }
    }
}
