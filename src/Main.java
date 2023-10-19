import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String user ;
        for (int i = 0; i < 5; i++) {

            user = scanner.nextLine();
            listA.add(user);
        }

        for (int i = 0; i < 5; i++) {

            user = scanner.nextLine();
            listB.add(user);
        }

        Collections.reverse(listB);
        System.out.println(listB);

        int user2 =1;
        for (int i = 0; i < listA.size(); i++) {
            listC.addAll(i,Collections.singleton(listA.get(i)));
        }

        for (int j = 0; j < listB.size(); j++) {
            listC.addAll(user2,Collections.singleton(listB.get(j)));
            user2+=2;

        }
        System.out.println("A: " + listA);
        System.out.println("B: " + listB);
        System.out.println("C: " + listC);
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);














    }
}