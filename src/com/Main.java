package com;

public class Main {

    public static void main(String[] args) {
        // 강아지 객체 만들기
        Dog dog1 = new Dog("멍멍이", "말티즈", "하얀색");
        Dog dog2 = new Dog("초코", "진돗개", "검정색");
        Dog dog3 = new Dog("뭉치", "푸들", "갈색");

        // getter 사용
        System.out.println("이름은 " + dog1.getName() + " 종은 " + dog1.getBreed());
        System.out.println("이름은 " + dog2.getName() + " 종은 " + dog2.getBreed());
        System.out.println("이름은 " + dog3.getName() + " 종은 " + dog3.getBreed());

        System.out.println();

        // 자유 메서드 사용
        dog1.color();
        dog2.color();
        dog3.color();
    }
}
