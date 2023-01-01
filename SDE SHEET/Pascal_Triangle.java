import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static void main(String[] args) {
        System.out.println(generate(7));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++) {
            List<Integer> innerList = new ArrayList<>(i);
            for(int j=0;j<i;j++){
                innerList.add(1);
            }
            list.add(innerList);
        }
        for(List<Integer> innerList :list){
            for(int i = 1; i< innerList.size()-1; i++){
                int val1=list.get(innerList.size()-2).get(i);
                int val2=list.get(innerList.size()-2).get(i-1);
                innerList.set(i,val1+val2);
            }
        }
        return list;
    }
}
