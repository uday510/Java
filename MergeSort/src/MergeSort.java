import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> list;


    MergeSort(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> call() throws  Exception {

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


        int i = 0, j = 0;
        int leftIdx = 0, rightIdx = midIdx;

        List<Integer> sortedArray = new ArrayList<>();


        while (i < )









        return null;
    }


}
