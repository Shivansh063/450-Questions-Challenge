/* *********************************************

Problem Statement :- To Find the Kth smallest number in Array
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7

Approach in Below Solution :- First Sort the Array using Merge Sort (because it complexity even  in Worst case is O(n Log n))
                             After Sort (Ascending Order) our answer will be value at index k-1;

************************************************ */

class ArrayQuestion3 {

    void mergeArray(int[] sortedArray, int initialIndex, int midIndex, int lastValue) {
        int firstArraySize = midIndex - initialIndex + 1;
        int secondArraySize = lastValue - midIndex;
        int[] firstArray = new int[firstArraySize];
        int[] secondArray = new int[secondArraySize];

        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = sortedArray[initialIndex + i];
        }
        for (int j = 0; j < secondArraySize; j++) {
            secondArray[j] = sortedArray[j + midIndex + 1];
        }

        int firstVariable = 0;
        int secondVariable = 0;
        int finalArrayIndex = initialIndex;
        while (firstVariable < firstArraySize && secondVariable < secondArraySize) {
            if (firstArray[firstVariable] > secondArray[secondVariable]) {
                sortedArray[finalArrayIndex] = secondArray[secondVariable];
                secondVariable++;
                finalArrayIndex++;
            } else {
                sortedArray[finalArrayIndex] = firstArray[firstVariable];
                firstVariable++;
                finalArrayIndex++;
            }
        }
        while (firstVariable < firstArraySize) {
            sortedArray[finalArrayIndex] = firstArray[firstVariable];
            firstVariable++;
            finalArrayIndex++;
        }
        while (secondVariable < secondArraySize) {
            sortedArray[finalArrayIndex] = secondArray[secondVariable];
            secondVariable++;
            finalArrayIndex++;
        }

    }

    void mergeSort(int[] requiredArray, int startingIndex, int lastIndex) {
        if (startingIndex < lastIndex) {
            int midValue = (startingIndex + lastIndex) / 2;
            mergeSort(requiredArray, startingIndex, midValue);
            mergeSort(requiredArray, midValue + 1, lastIndex);
            mergeArray(requiredArray, startingIndex, midValue, lastIndex);
        }

    }
}

class RequiredClassForQuestion3 {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int kIndex = 3;
        ArrayQuestion3 newObject = new ArrayQuestion3();
        newObject.mergeSort(arr, 0, arr.length - 1);
        for (int values : arr) {
            System.out.print(values + " ");
        }

        System.out.println("\nKth Smallest value will be :- " + arr[kIndex - 1]);
    }
}
