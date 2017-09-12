class dz2task1{
    public static int randomTest(int a,int b){
        if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }
    public static int [] zapolnenieMassiva(int [] a){
        int z = (int)(Math.random()*100);
        int x = (int)(Math.random()*100);
        for(int i=0;i<a.length;i++){
            a[i]=randomTest(z, x);
        }
        return a;
    }
    public static void printTest(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if(i==a.length-1)
                System.out.println("");
        }
    }
    public static void main(String[] args){
        int[] Mas1=new int[10];
        zapolnenieMassiva(Mas1);
        printTest(Mas1);

        int[] Mas2=new int[10];
        zapolnenieMassiva(Mas2);
        printTest(Mas2);

        int[] Mas3=new int[10];
        zapolnenieMassiva(Mas3);
        printTest(Mas3);

        int[] Mas4=new int[10];
        zapolnenieMassiva(Mas4);
        printTest(Mas4);

        int[] Mas5=new int[10];
        zapolnenieMassiva(Mas5);
        printTest(Mas5);

    }
}
