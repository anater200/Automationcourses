public class dz2task3 {
    public static void pr(){
            System.out.println();
        }
        public static void pr(String a){
            System.out.println(a);
        }
        /*-----------Вывод массива на экран-----------*/
        public static void arr(String[] mas) {
            for(int i=0; i<mas.length; i++) {
                System.out.println(mas[i]);
            }
        }
/*--------------------------------------------*/



        /*------------------------------SORT(Сортировка)------------------------------------------*/
        public static void sort(String[] a) {
            for (int i = a.length - 1; i >= 2; i--) {
                boolean sorted = true;
                for (int j = 0; j < i; j++) {
                    if (compare(a[j], a[j+1])>0) {//Используем функцию compare для сравнения двух слов
                        String temp = a[j+1];
                        a[j+1] = a[j];
                        a[j] = temp;
                        sorted = false;
                    }
                }
                if(sorted) {
                    break;
                }
            }
        }


/*------------------------------COMPARE(Сравнение)------------------------------------------*/


        public static int compare(String word1, String word2) {
            word1 = word1.toLowerCase();//Переводим в нижний регистр
            word2 = word2.toLowerCase();//Переводим в нижний регистр
//Задаем массивы, где будут храниться буквы слов
            int[] mas1 = new int[word1.length()];
            int[] mas2 = new int[word2.length()];
//Заполняем массивы буквами (точнее порядковыми номерами этих букв)
            for(int i=0; i<mas1.length; i++) {
                char b = word1.charAt(i);//Цепляем из строки букву с порядковым номером i и сохраняем ее в переменную b
                int k = (int)b;//Берем порядковый номер этой буквы
                mas1[i] = k;//Записываем этот порядковый номер в массив
            }
//Аналогично, только для другого слова
            for(int i=0; i<mas2.length; i++) {
                char b = word2.charAt(i);
                int k = (int)b;
                mas2[i] = k;
            }
            int i = 0, bool = 0;
//Пропускаем все одинаковые буквы в слове, они нас не интересуют, пока не попадутся не равные
            while(mas1[i]==mas2[i]) {
                i++;
                if(i>=mas1.length||i>=mas2.length) {//Счетчик уже больше границ одного из массива, все остальное равно => сравниваем уже длину слова
                    if(mas1.length==mas2.length) {
                        break;//Строки равны
                    } else if(mas1.length<mas2.length) {
                        bool = -1;//Строка mas1 лежит выше по алфавиту, чем строка mas2
                        break;
                    } else {
                        bool = 1;//Строка mas1 лежит ниже по алфавиту, чем строка mas2
                        break;
                    }
                }
            }
            if(mas1.length>1&&mas2.length>1) {//Описываем, что делать программе, если строки состоят более, чем из одной буквы
//Напомню, что мы уже исключили равные буквы, поэтому нам достаточно
//сравнить только эти две неравные буквы, если буква 1-го слова больше буквы 2-го слова, то 1-е слово лежит ниже второго
                if(mas1[i]>mas2[i]) {
                    bool = 1;
//Аналогично, только тут идет проверка на то, лежит ли 1-е слово выше по алфавиту
                } else if(mas1[i]<mas2[i]) {
                    bool = -1;
                }
            } else {
//Остался вариант, когда слова представляют из себя буквы, тогда просто сравниваем нулевые элементы массивов
//оба эти массива состаят из одного элемента с индексом 0
//Ниже по алфавиту
                if(mas1[0]>mas2[0]) {
                    bool = 1;
//Выше по алфавиту
                }else if(mas1[0]<mas2[0]) {
                    bool = -1;
                }
            }
            return bool;//Возвращаем значение переменной bool. Если значение отрицательное, то первое слово
//лежит выше по алфавиту, чем второе. Если значение положительное, то ситуация обратна: первое
//слово лежит ниже по алфавиту, чем второе. Если 0, то эти слова равны
        }

/*-------------------------------------------------------------------------------*/





        public static void main(String[] args) {
//Задаем исходный массив
            String[] a = {"Pushkin", "Lermontov", "Nekrasov", "Tolstoj L. N.", "Tolstoj A. N.", "Esenin", "Paystovskij","a","Av"};
            sort(a);//Сортируем массив
            arr(a);//Выводим массив на экран
            pr();//Переводим на другую строку
        }
    }

