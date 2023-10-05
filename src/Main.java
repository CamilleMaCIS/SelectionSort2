public class Main {
    public static void main(String[] args) {
        int[] intArray = {5, 1, 4, 2, 8, 10, 35, 21, 34, 20, 19, 16, 17, 12, 7, 3, 6, 41, 54, 53, 67, 39, 44};
        System.out.println("Before selectionSort:");
        for (int e: intArray){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("After selectionSort:");
        selectionSort(intArray);
        for (int e: intArray){
            System.out.print(e + " ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //finding the minimum
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}