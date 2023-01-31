import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
public class PythagoreanTriplet {
    public static void main(String[] args) {
//        int[] arr = {3, 12, 4, 6, 5, 1, 13};
        int[] arr = {3,4,6,8};
        findTriplets(arr);
    }

    private static void findTriplets(int[] arr) {
        boolean flag = true;
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j * j, j);
        }
        List<Integer> sqList = new ArrayList<>(map.keySet());
        List<Integer> potentialSum = new ArrayList<>();
        for(int i = 0; i< sqList.size() - 1; i++){
            for(int j = i+1; j < sqList.size() - i; j++){
                potentialSum.add(sqList.get(i) + sqList.get(j));
            }
        }
        for (int i = 0; i < potentialSum.size() - 1; i++) {
            if(sqList.contains(potentialSum.get(i))){
                System.out.println("triplet present with hypotenous : "+ map.get(potentialSum.get(i)));
                flag = false;
            }
        }
        if(flag){
            System.out.println("[]");
        }
    }
}
