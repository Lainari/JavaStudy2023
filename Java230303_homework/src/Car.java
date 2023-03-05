// 자동차를 나타내는 클래스 정의
// 속성 : 색상, 현재 속도, 현재 기어 등
// 동작 : 기아 변속, 가속, 감속 등

public class Car {
    String color; // 색상
    int speed;    // 현재 속도
    int gear;     // 현재 기어

    @Override
    public String toString(){
        return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
    }

    void changeGear(int argGear){
        gear = argGear;
    }

    void speedUp(){
        speed = speed + 10;
    }

    void speedDown(){
        speed = speed - 10;
    }
}
