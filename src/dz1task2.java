public class dz1task2{
    public static void main(String[] args){
        int m=7;
        int n=4;
        int a=10;
        int b=Math.abs(a-m);
        int c=Math.abs(a-n);
        if (b==c){
            System.out.println(m +" и "+n + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println(n+" ближе к "+a);
        }
        if (b<c) {
            System.out.println(m+" ближе к "+a);
        }
    }

}