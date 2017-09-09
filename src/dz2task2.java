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
    //Создадим метод, которsй будет возвращать заполненный массив
    public static int [] zapolnenieMassiva(int [] a){
        //Определим случайные значения, в рамках которых будут находится значения элементов массива
        int z = (int)(Math.random()*100);
        int x = (int)(Math.random()*100);
        for(int i=0;i<a.length;i++){
            a[i]=randomTest(z, x);
        }
        return a;
    }
    //Функция выводящая на экран элементы массива в строку, после выведения последнего элемента строка переносится
    public static void printTest(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if(i==a.length-1)
                System.out.println("");
        }
    }
    //Метод, который перебирает значения элементов массива, который вводится в качестве аргумента, упорядочивает их по возрастанию и возвращает уже упорядоченный массив
    public static int [] sortMassiva(int [] a){
        //при помощи двух циклов, вложенных один в другой сравниваем значения элементов массива
        for(int i=0;i<a.length;i++){
            int temp=a[i];//Переменная в которой будет временно храниться значение минимального элемента
            for(int b=i+1;b<a.length;b++){
                //переменная, в которой временно будет храниться индекс минимального элемента
                int tempIndex=i;
                //если элемент с меньшим индексом (наша временная переменная может играть роль индикатора) больше элемента с большим индексом - меняем элементы местами
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
        //Создаем массив, заполняем и выводим на экран при помощи прописанных методов, сортируем значения элементов массива и выводим на экран еще раз
        int[] Mas1=new int[10];
        zapolnenieMassiva(Mas1);
        printTest(Mas1);
        sortMassiva(Mas1);
        printTest(Mas1);
    }
}
