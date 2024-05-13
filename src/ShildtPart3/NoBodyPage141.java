package ShildtPart3;

public class NoBodyPage141 {
    public static void main(String[] args) {
int i, j;
        i = 100;
        j = 200;
        while (++i < --j);
            System.out.println("Средняя точка равна " + i);

    }
}
/*
int i, j;
        i = 100;
        j = 200; // найти среднюю точку между i и j
        while (++i < --j) ; // тело в цикле отсутствует
        System.out.println("Cpeдняя точка равна " + i);
 */