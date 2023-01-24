import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание №1");
        System.out.println("Введите имя сотрудника");
        Scanner name = new Scanner(System.in);
        String firstName = name.nextLine();
        System.out.println("Введите отчество сотрудника");
        Scanner patronName = new Scanner(System.in);
        String middleName = patronName.nextLine();
        System.out.println("Введите фамилию сотрудника");
        Scanner secondName = new Scanner(System.in);
        String lastName = secondName.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задание №2");
        System.out.println("Задание №1");
        System.out.println("Введите имя сотрудника");
        Scanner name = new Scanner(System.in);
        String firstName = name.nextLine();
        System.out.println("Введите отчество сотрудника");
        Scanner patronName = new Scanner(System.in);
        String middleName = patronName.nextLine();
        System.out.println("Введите фамилию сотрудника");
        Scanner secondName = new Scanner(System.in);
        String lastName = secondName.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание №3");
        String fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}