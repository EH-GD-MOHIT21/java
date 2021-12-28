public class rainbowpermute {
    public static void main(String[] args) {
        // colors in rainbow -> 7
        Permutation p = new Permutation();
        int number_of_ways = p.ways(7);
        System.out.println(number_of_ways);
    }
}

class Permutation{
    public int ways(int colors){
        int temp = 1;
        for(int i=1;i<=colors;i++){
            temp *= i;
        }
        return temp;
    }
}