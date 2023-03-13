package test;

public class Person {
    private String name;   // 멤버 변수는 거의 무조건 private 로 숨겨놓자!
    private int myAge;

    public String getName(){
        return name;       // private 멤버 변수는 public 메소드로 접근할 수 있도록 해주자
    }

    public int getAge(){
        return myAge;
    }

    public void setAge(int argAge){
        if(argAge >= 0 && argAge <= 150)
          this.myAge = argAge;
        System.out.println("나이의 범위는 0부터 150까지 입니다.");
    }

    private void test(){
        System.out.println(name);
    }
}
