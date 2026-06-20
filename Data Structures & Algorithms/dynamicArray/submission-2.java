class DynamicArray {
    private int[] arr;
    private int size;
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == arr.length)
            resize();
        arr[size++] = n;
    }

    public int popback() {
        return arr[--size];
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
