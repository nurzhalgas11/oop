import java.util.Arrays;

public class Example {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int size=0;
        int num=0;
        for(int i=0;i<costs.length;i++){
            while(size<coins){
                size=costs[i]+size;
                if(size<=coins){
                    num=num+1;
                }
            }
        }
        System.out.println(size);
        return num;

    }


}
