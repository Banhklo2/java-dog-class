package com;

public class Dog {

    // 1. 속성 (캡슐화)
    private String name;
    private String breed;
    private String color;

    // 2. 생성자
    public Dog(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    // 자유 메서드 작성 (getter/setter 제외)
    public void color () {
        System.out.println("색깔은 " + color + "입니다.");
    }

    // getter (setter 없음)
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
}
