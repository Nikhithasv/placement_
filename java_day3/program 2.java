import java.util.*;

public class ArrayPartitionAndMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int partitionSize = scanner.nextInt();

        int[] partitionOrder = new int[size / partitionSize];
        for (int i = 0; i < partitionOrder.length; i++) {
            partitionOrder[i] = scanner.nextInt();
        }

        int[] result = partitionAndMerge(array, partitionSize, partitionOrder);

        System.out.println("Output:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    static int[] partitionAndMerge(int[] array, int partitionSize, int[] partitionOrder) {
        List<List<Integer>> partitions = new ArrayList<>();
        int n = array.length;

        for (int i = 0; i < n; i += partitionSize) {
            List<Integer> partition = new ArrayList<>();
            for (int j = i; j < i + partitionSize && j < n; j++) {
                partition.add(array[j]);
            }
            partitions.add(partition);
        }

        int[] result = new int[n];
        int index = 0;
        for (int order : partitionOrder) {
            if (order <= partitions.size()) {
                List<Integer> partition = partitions.get(order - 1);
                for (int value : partition) {
                    result[index++] = value;
                }
            }
        }

        return result;
    }
}
