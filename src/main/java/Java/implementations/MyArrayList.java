package Java.implementations;

public class MyArrayList {
    // add(), remove(index), get(index)
    // arr[]
    private int arr[];
    int end;

    MyArrayList() {
        arr = new int[3];
        end = -1;
    }

    public void add(int x) {
        end++;
        if (end == arr.length - 1) {
            // resize
            int newArray[] = new int[2 * arr.length];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                newArray[k] = arr[i];
                k++;
            }
            arr = newArray;
        }
        arr[end] = x;
    }

    // returns elemt
    public int remove(int index) {
        // [1,2,3,4]
        if (end == -1 || index < 0 || index >= arr.length) {
            return -1;
        }

        int newArr[] = new int[end];
        int k = 0, removedElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length && k < end; i++) {
            if (i != index) {
                // copy
                newArr[k] = arr[i];
                //System.out.println(k + " " + newArr[k]);
                k++;

            } else {
                removedElement = arr[i];
            }
        }

        arr = newArr;
        end = end - 1;
        return removedElement;

    }


    public int get(int index) {
        if (end == -1 || index < 0 || index >= arr.length) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                // match
                return arr[i];
            }
        }
        return -1;

    }

    public int size() {
        return end;
    }


}
