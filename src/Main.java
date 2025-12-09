//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("멍멍이", "말티즈");
        Dog dog2 = new Dog("초코", "진돗개");
        Dog dog3 = new Dog("뭉치", "푸들");

        System.out.println("이름은 " + dog1.name + " 종은 " + dog1.breed);
        System.out.println("이름은 " + dog2.name + " 종은 " + dog2.breed);
        System.out.println("이름은 " + dog3.name + " 종은 " + dog3.breed);



    }
}