import java.util.*;
import java.util.concurrent.*;
public class MergeSort implements Callable<List<Integer>> {
    private final List<Integer> list;

    MergeSort(List<Integer> list) {
        this.list = list;
    }
    public List<Integer> call() throws  Exception {

        if (list.size() <= 1) {
            return list;
        }

        List<Integer> leftSubList = new ArrayList<>();
        List<Integer> rightSubList = new ArrayList<>();

        int n = list.size();
        int midIdx = n / 2;

        for (int i = 0; i < midIdx; ++i) {
            leftSubList.add(list.get(i));
        }

        for (int i = midIdx; i < n; ++i) {
            rightSubList.add(list.get(i));
        }

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSort unsortedLeftList = new MergeSort(leftSubList);
        MergeSort unsortedRightList = new MergeSort(rightSubList);


        Future<List<Integer>> left = executorService.submit(unsortedLeftList);
        Future<List<Integer>> right = executorService.submit(unsortedRightList);


        List<Integer> sortedLeftList = left.get();

        List<Integer> sortedRightList = right.get();

        return getSortedArray(sortedLeftList, sortedRightList);
    }

    private static List<Integer> getSortedArray(List<Integer> sortedLeftList, List<Integer> sortedRightList) {
        int leftIdx = 0, rightIdx = 0;
        int leftLen = sortedLeftList.size();
        int rightLen = sortedRightList.size();

        List<Integer> sortedArray = new ArrayList<>();

        while (leftIdx < leftLen && rightIdx < rightLen) {
            int leftVal = sortedLeftList.get(leftIdx);
            int rightVal = sortedRightList.get(rightIdx);

            if (leftVal < rightVal) {
                sortedArray.add(leftVal);
                leftIdx++;
            } else {
                sortedArray.add(rightVal);
                rightIdx++;
            }
        }

        while (leftIdx < leftLen) {
            int val = sortedLeftList.get(leftIdx);
            sortedArray.add(val);
            leftIdx++;
        }

        while (rightIdx < rightLen) {
            int val = sortedRightList.get(rightIdx);
            sortedArray.add(val);
            rightIdx++;
        }
        return sortedArray;
    }
}
