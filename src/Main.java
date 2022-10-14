import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        tablemultiplication();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }

        if (delta == 0) {
            System.out.println(-b / (2 * a));
        }
        if (delta > 0) {
            System.out.println((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println((-b - Math.sqrt(delta)) / 2 * a);

        }
    }


    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de l'entier ?");

        int entier = scanner.nextInt();
        if (entier % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }


    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur du premier entier ?");
        int nombre1 = scanner.nextInt();
        System.out.println("Quelle est la valeur du deuxieme entier ?");
        int nombre2 = scanner.nextInt();
        if (nombre1 > nombre2)
            System.out.println("Le plus grand est" + nombre1);
        else
            System.out.println("Le plus grand est" + nombre2);
    }


    public static void factorielle() {
        int factorielle = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            factorielle *= i;
            System.out.println(n + "! = " + factorielle);
        }
    }

    public static void countdown() {

        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("BOOOM");
    }


    public static void carre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un entier positif ou nul : ");
        int n = scanner.nextInt();
        int result = n * n;
        System.out.println("Le carré de  " + n + " est  " + result);

    }

    public static void tablemultiplication()
        {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i * j + " ");
                }
                System.out.print("\n");
            }
        }

    public static void division() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Saisir un entier positif ou nul : ");
            int b, a = scanner.nextInt();
            {
                System.out.print("Veuillez saisir un deuxieme entier positif : ");
                b = scanner.nextInt();
            }

            System.out.println("Le resulat de la division est " + a / b);
        }
    }








