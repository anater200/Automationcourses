class dz2task2 {
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
    public static int [] sortMassiva(int [] a){
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            for(int b=i+1;b<a.length;b++){
                int tempIndex=i;
                if(a[b]<temp){
                    temp=a[b];
                    tempIndex=b;
                }
                if(tempIndex!=i){
                    a[tempIndex]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] Mas1=new int[10];
        zapolnenieMassiva(Mas1);
        printTest(Mas1);
        sortMassiva(Mas1);
        printTest(Mas1);
    }
}
