package lesson5;

import java.sql.Struct;

public class lesson5 {
    public static void main(String[] arg) {

//        Personal pers1 = new Personal("Иванов Иван Иванович", "инжинер", "Ivanov@email.ru", 89998887766L, 1000000, 20); // 1 часть ДЗ

        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Иванов Иван Иванович", "инжинер", "Ivanov@email.ru", 89996677266L, 100000, 39);
        persArray[1] = new Personal("Сидоров Иван Иванович", "водитель", "Sidorov@email.ru", 89993344566L, 50000, 57);
        persArray[2] = new Personal("Петров Иван Иванович", "кассир", "Petrov@email.ru", 89995676566L, 70000, 35);
        persArray[3] = new Personal("Лавров Иван Иванович", "директор", "Lavrov@email.ru", 89998887766L, 150000, 68);
        persArray[4] = new Personal("Скворцов Иван Иванович", "инжинер", "Scvorcov@email.ru", 89994466766L, 90000, 29);

        for (int i = 0; i < persArray.length; i++) {
            if ( persArray[i].getAge() > 40) {
                persArray[i].info();
            }
            }


//        pers1.info(); // 1 часть ДЗ

        }
    }

class Personal {
    String name;
    String position;
    String email;
    long tel;
    int pay;
    int age;

    public int getAge() {
        return age;
    }

    public Personal(String name, String position, String email, long tel, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.pay = pay;
        this.age = age;
    }


    public void info() {
        System.out.println("ФИО: " + name + "; \nДолжность: " + position + "; \nEmail: " + email + "; \nТелефон: " + tel + "; \nЗарплата: " + pay + "; \nВозраст: " + age + ".");
    }
}
//





