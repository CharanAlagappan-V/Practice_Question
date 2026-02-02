import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniqueTriplets {
    public static void main(String[] args) {
        int[] a = {5,3,20,10,1,4,2};
        int n = 60;
        int count =0;
        Set<String> set = new HashSet<>();
        for(int i=0;i<a.length-2;i++){
            for(int j=i+1;j<a.length-1;j++){
                int product = a[i]*a[j];
                if(product!=0 && n%product ==0){
                    int req = n/product;
                    for(int k=j+1;k<a.length;k++){
                        if (a[k] == req) {
                            int[] triplets = {a[i],a[j],a[k]};
                            Arrays.sort(triplets);
                            set.add(triplets[0]+","+triplets[1]+","+triplets[2]);
                        }
                    }
                }
            }
        }
        System.out.println(set.size());

    }
}
