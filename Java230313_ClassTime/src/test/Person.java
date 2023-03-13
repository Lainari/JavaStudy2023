package test;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >= 0 && age <= 150)
          this.age = age;
        System.out.println("나이의 범위는 0부터 150까지 입니다.");
    }

    private void test(){
        System.out.println(name);
    }
}
