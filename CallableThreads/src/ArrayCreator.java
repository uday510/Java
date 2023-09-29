import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {

    int n;

    ArrayCreator(int num){
        this.n = num;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer>ar = new ArrayList<>();

        for(int i = 1 ; i <= n ; i++){
            ar.add(i);
        }
        return  ar;
    }
}
