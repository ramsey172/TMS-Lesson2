import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;
        int n;
        Scanner input = new Scanner(System.in);
        for(n=1;n<11;n++){
            System.out.println("Введите имя:");
            name1 = input.nextLine();
            System.out.println("Hello "+name1);
        }

    }
}