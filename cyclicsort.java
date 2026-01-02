static void sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
        int correct = arr[i] - 1;

        if (arr[i] != arr[correct]) {
            swap(arr, i, correct);
        } else {
            i++;
        }
    }
}

static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
