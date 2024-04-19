package treeSort;

public class TreeSort {
    public static void main(String args[]) {

        for (int i = 100; i <= 10000; i+= 100) {
            int[] array = testArrayGenerator(i);
            int[] newArray = treeSort(array);
        }
    }

    static int[] treeSort(int[] array) {
        Tree tree = new Tree(array[0]);
        for (int j = 1; j < array.length; j++) {
            tree.insert(new Tree(array[j]));
        }
        int[] newArray = new int[array.length];
        tree.traverse(newArray);
        return newArray;
    }

    static int[] testArrayGenerator(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
}
