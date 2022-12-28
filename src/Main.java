public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сорудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сорудника - " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача3");
        String firstName = "Иванов ";
        String middleName = "Семён ";
        String lastName = "Семёнович";
        String fullName = firstName + middleName + lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сорудника - " + fullName);
    }
}