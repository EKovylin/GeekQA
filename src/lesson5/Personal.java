package lesson5;

public class Personal {
    private String name;
    private String position;
    private String email;
    private String tel;
    private int pay;
    private int age;

    public Personal(String name, String position, String email, String tel, int pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.pay = pay;
        this.age = age;
    }
    public void info() {
        System.out.println("фио:" + name + "; Имя пользователя: " + name + "; Должность");
    }
}
