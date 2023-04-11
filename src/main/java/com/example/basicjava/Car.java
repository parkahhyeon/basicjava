/*
package com.example.basicjava;

public class Car {      // 클래스명
    */
/* 클래스 (class) : 객체 지향 프로그래밍(OOP)의 추상화(abstracion)라는 개념을 직접 구현한 것.
    * 자바에서 클래스는 member로 속성을 표현하는 필드와 기능을 표현하는 메소드를 가짐.
    * 자바에서는 개발자의 편의를 위해 유용하게 사용할 수 있는 많은 수의 클래스를 미리 정의하여 제공함.
    * 클래스의 선언
          접근제어자 class 클래스명 {
                접근제어자 필드1의타입 필드1의이름;
                접근제어자 필드2의타입 필드2의이름;
                ...
                접근제어자 메소드1의원형
                접근제어자 메소드2의원형
                ...
           };
    * *//*


    */
/* 필드 (field) : 클래스에 포함된 변수(variable)를 의미함.
    * 클래스 내에서 필드는 선언된 위치에 따라 다음과 같이 구분됨.
        1. 클래스 변수 (static variable)
        2. 인스턴스 변수 (instance variable)
        3. 지역 변수 (local variable)
    * *//*

    private String modelName; // 필드. private 멤버는 해당 객체 내의 멤버 변수나 메소드만이 접근 가능.
    private int modelYear; // 필드
    private int currentSpeed;
    private int accelerationTime;
    boolean door; // 인스턴스 변수
    void openDoor() { //인스턴스 메소드
        door = true;
    }

    */
/* 생성자 (constructor) : 자바에서는 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 있는 생성자라는 메소드를 제공.
        * 클래스를 가지고 객체를 생성하면, 해당 객체는 메모리에 즉시 생성됨. 하지만 이렇게 생성된 객체는 모든 인스턴스 변수가 아직 초기화되지 않은 상태임.
        * 자바에서 생성자의 이름은 해당 클래스의 이름과 같아야 함.
        *//*

//    Car(String modelName, int modelYear) { // 생성자. Car 클래스의 생성자는 Car()가 됨.
//        this.modelName = modelName;
//        this.modelYear = modelYear;
//    }

    */
/* 메소드 (method) : 어떠한 특정 작업을 수행하기 위한 명령문의 집합.
        * 메소드의 사용 목적
            1. 중복되는 코드의 반복적인 프로그래밍을 피할 수 있게 됨.
            2. 모듈화로 인해 전체적인 코드의 가독성이 좋아짐.
            3. 프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수 가능.
        * 메소드를 작성할 때는 되도록 하나의 메소드가 하나의 기능만을 수행하도록 작성하는 것이 좋음.
        * 자바에서 메소드를 정의하는 방법 :
            접근제어자 반환타입 메소드명(매개변수목록) { //선언부
                //구현부
             }
             * 접근 제어자 : 해당 메소드에 접근할 수 있는 범위 명시.
             * 반환 타입(return type) : 메소드가 모든 작업을 마치고 반환하는 데이터의 타입 명시.
             * 메소드명 : 메소드를 호출하기 위한 이름 명시.
             * 매개변수목록(parameters) : 메소드 호출할 때 전달되는 인수의 값을 저장할 변수들 명시.
             * 구현부 : 메소드의 고유 기능을 수행하는 명령문의 집합.
             * 메소드 시그니처(method signature) : 메소드의 선언부에 명시되는 매개변수의 리스트.
                                만약 두 메소드가 매개변수의 개수와 타입, 그 순서까지 모두 같다면,
                                이 두 메소드의 시그니처는 같다고 할 수 있음.
        * 메소드의 구분 : 클래스 내에서 메소드는 static 키워드의 여부에 따라
            1. 클래스 메소드 (static method)
            2. 인스턴스 메소드 (instance method)
        * 메소드 호출하는 방법 :
            1. 객체참조변수이름.메소드명();  // 매개변수가 없는 메소드의 호출
            2. 객체참조변수이름.메소드명(인수1, 인수2, ..., 인수n);  // 매개변수가 있는 메소드의 호출
        * *//*

    public String getModel() { // 메소드
        return this.modelYear + "년식" + this.modelName + " ";
    }

    public void accelerate(int speed, int second) { //선언부
//         public 접근 제어자를 사용하여 선언되어 해당 객체를 사용하는 프로그램 어디에서나 직접 접근 가능.
//         void 반환 타입을 사용하여 어떠한 값도 반환하지 않는다는 의미를 명시.
//         매개변수로 int형 변수인 speed와 second를 전달받음.
//         이렇게 전달받은 매개변수를 가지고 메소드 구현부에서 고유한 작업을 수행할 수 있는 것.

        //구현부
        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!" );
    }

    static boolean toggleDoor(boolean d) { //클래스 메소드
        return !d;
    }
}
*/
