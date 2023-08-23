public class enhanceforloop{
    public static void main(String[] args) {
        int num [][] = {
                     {5,6,3},
                     {6,8,2},
                     {6,6,9}
        };

        for(int a[] : num ){
            for(int b : a){
            System.out.print(b +" ");
        }
        System.out.println();
    }
    }
}