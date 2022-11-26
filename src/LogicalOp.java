public class LogicalOp {
    /*1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul
    primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.  Apelati metoda in clasa Main,
    metoda main() pentru a verifica daca functioneaza. */

    public void counting(int number) {
        int i = number;
        do {
            System.out.print(i + ", ");
            i++;
        }
        while (i <= 100);
    }

    /*2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit
    si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la
    crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.*/
    public void negativeCounting(int number) {
        int i = number;
        do {
            System.out.println(i);
            i--;
        } while (i >= -100);

    }

    /*3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o
     numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
     (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.Atentie
      la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
      Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */
    public void countingInBetween(int first, int second) {
        while (first <= second) {
            System.out.println(first);
            first++;
        }
    }

    /* 4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice
     care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai
      mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y, atunci
      numaratoarea sa fie de la y la x).Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
      Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.*/
    public void countingMinToMax(int first, int second) {
        while (first < second) {
            System.out.println(first);
            first++;
        }
        while (second <= first) {
            System.out.println(second);
            second++;
        }
    }

    // 5.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void increasingEvens() {
        int i = 2;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

    // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void increasingOdds() {
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i = i + 1;
        }
    }
    /* 7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa
    aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda,
     pentru a numara toate numerele din interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca
      functioneaza. */

    public float addAndAverage(int first, int second) {
        float sum = 0;
        int count = 0;
        while (first <= second) {
            sum = sum + first;
            count++;
            first++;
        }
        return sum / count;
    }

        /*8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile
         cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */

    public float boltz(int first, int second) {
        float sum = 0;
        int count = 0;
        while (first <= second) {
            if (first % 7 == 0) {
                sum += first;
                count++;
            }
            first++;
        }
        return sum / count;
    }


    // 9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void fibonacci() {
        int i = 1, n = 20, first = 0, second = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(first + ", ");

            int next = first + second;
            first = second;
            second = next;
            i++;
        }
    }

    public void printCozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza, ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza, ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza, ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza, ");
            } else if (i % 3 == 0) {
                System.out.print("Coza, ");
            } else if (i % 5 == 0) {
                System.out.print("Loza, ");
            } else if (i % 7 == 0) {
                System.out.print("Woza, ");
            } else {
                System.out.print(i + ", ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;

        }
    }

}











