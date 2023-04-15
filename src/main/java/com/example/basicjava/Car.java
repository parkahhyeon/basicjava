//package com.example.basicjava;
///* 패키지 (package) : 클래스와 인터페이스의 집합.
//     * 서로 관련이 있는 클래스나 인터페이스를 함께 묶음으로써 파일을 효율적으로 관리할 수 있게 됨.
//     * 협업 시 서로 작업한 클래스 사이에서 발생할 수 있는 이름 충돌 문제까지도 패키지를 이용하면 피할 수 있음.
//     * 자바에서 패키지는 물리적으로 하나의 디렉터리를 의미함.
//     * 하나의 패키지에 속한 클래스나 인터페이스 파일은 모두 해당 패키지명의 디렉터리에 포함 되어 있음.
//     * 이러한 패키지는 다른 패키지를 포함할 수 있으며, 이때 디렉터리의 계층 구조는 점(.)으로 구분됨.
//       ex) java.lang.String     // java.lang 패키지명에 속한 String 클래스.
//     * <패키지의 선언>
//        package 패키지명;
//     * 위와 같은 명령문을 클래스나 인터페이스의 소스 파일에 추가하기만 하면 됨.
//     * 이때 패키지명에는 패키지의 경로까지 포함한 풀네임을 명시해야 함.
//
// * 이름 없는 패키지 (Unnamed package)
//     * 자바의 모든 클래스는 반드시 하나 이상의 패키지에 포함되어야 함.
//     * 하지만 자바 컴파일러는 소스 파일에 어떠한 패키지의 선언도 포함되지 않으면, 기본적으로 이름 없는 패키지에 포함해 컴파일함.
//     * 따라서 패키지를 명시하지 않은 모든 클래스와 인터페이스는 모두 같은 패키지에 포함되게 됨.
//
// * import 문 : 자바 컴파일러에 코드에서 사용할 클래스의 패키지에 대한 정보를 미리 제공하는 역할을 함.
//    * 클래스를 사용할 때마다 매번 긴 이름을 사용하는 것은 비효율적이므로, 자바에선 import 키워드를 별도로 제공하고 있음.
//    * import 문을 사용하면 다른 패키지에 속한 클래스를 패키지 이름을 제외한 클래스 이름만으로 사용할 수 있게 됨.
//    * <import 문의 선언>
//        1. import 패키지명.클래스명;    // 해당 패키지의 특정 클래스만을 사용하고자 할 때 사용.
//        2. import 패키지명.*;          // 해당 패키지의 모든 클래스를 클래스 이름만으로 사용하고 싶을 때 사용.
//            * 패키지명에는 패키지의 경로까지 포함한 풀 네임을 명시해야 함.
//    * <import 문의 특징>
//        import 문을 선언할 떄 별표(*)를 사용하는 것이 해당 패키지에 포함된 다른 모든 하위 패키지의 클래스까지 포함해 주는 것은 아님.
//        import java.awt.*;
//        import java.util.*;
//        * 위와 같은 두 개의 import 문을 'import java.*;'로 표현할 수 없음.
//        * 또한, 자바에서는 가장 많이 사용하는 java.lang 패키지에 대해서는 import 문을 사용하지 않아도 클래스명만으로 사용할 수 있도록 해주고 있음.
// * */
//
//public class Car {      // 클래스명
///* 클래스 (class) : 객체 지향 프로그래밍(OOP)의 추상화(abstracion)라는 개념을 직접 구현한 것.
//    * 자바에서 클래스는 member로 속성을 표현하는 필드와 기능을 표현하는 메소드를 가짐.
//    * 자바에서는 개발자의 편의를 위해 유용하게 사용할 수 있는 많은 수의 클래스를 미리 정의하여 제공함.
//    * 클래스의 선언
//          접근제어자 class 클래스명 {
//                접근제어자 필드1의타입 필드1의이름;
//                접근제어자 필드2의타입 필드2의이름;
//                ...
//                접근제어자 메소드1의원형
//                접근제어자 메소드2의원형
//                ...
//           };
//
// * 제어자 (modifier) : 클래스와 클래스 멤버의 선언 시 사용하여 부가적인 의미를 부여하는 키워드를 의미함.
//    * 자바에서 제어자는 접근 제어자와 기타 제어자로 구분.
//    * 접근 제어자는 2개 이상 같이 사용할 수 없음. 기타 제어자는 경우에 따라 여러 개를 함께 사용 가능.
//    * 이러한 접근 제어자와 기타 제어자는 조합에 따라 함께 사용 가능.
//
// * 접근 제어자 (Access Modifier) : 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역할.
//    * 정보 은닉(Data hiding) : 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다는 객체 지향개념의 캡슐화(Encapsulation).
//        그렇게 함으로써 사용자는 언제나 최소한의 정보만으로 프로그램을 손쉽게 사용.
//    * 자바에서는 이러한 정보 은닉을 위해 접근 제어자라는 기능을 제공.
//    * 접근 제어자를 사용하면 클래스 외부에서의 직접적인 접근을 허용하지 않는 멤버를 설정하여 정보 은닉을 구체화.
//    * 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서 접근 제어자 사용.
//    * 접근 제어자를 적절히 선택해서 접근 범위를 최소화 할수록 오류가 없는지 테스트해야 할 때 필요한 부분만 확인 가능.
//    * <자바에서 제공하는 접근 제어자 4가지>
//        1. private : 같은 클래스 내에서만 접근 가능.
//        2. (default) : 같은 패키지 내에서만 접근 가능. 아무런 접근 제어자도 붙이지 않는 것을 의미.
//        3. protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근 가능.
//        4. public  : 접근 제한 없음.
//        * 접근 범위가 넓은 쪽에서 좁은 쪽 순 :  public > protected > (default) > private
//    * 접근 제어자가 사용될 수 있는 곳 - Class, 멤버변수, 메서드, 생성자
//         |대상|                |사용가능한 접근 제어자|
//         클래스               public, (default)
//         메서드, 멤버변수      public, protected, (default), private
//         지역변수              없음
//    * 자바 클래스는 private 멤버로 정보를 은닉하고, public 멤버로 사용자나 프로그램과의 인터페이스를 구축함.
//    * 접근 제어자가 default 임을 알리기 위해 실제로 default 를 붙이지는 않음.
//    * 접근 제어자가 지정되어 있지 않다면, 접근 제어자가 default 임을 뜻함.
//    * protected 멤버는 부모 클래스에 대해서는 public 멤버처럼 취급되며, 외부에서는 private 멤버처럼 취급됨.
//    * <클래스의 protected 멤버에 접근할 수 있는 영역>
//        1. 이 멤버를 선언한 클래스의 멤버
//        2. 이 멤버를 선언한 클래스가 속한 패키지의 멤버
//        3. 이 멤버를 선언한 클래스를 상속받은 자손 클래스(child class)의 멤버
//
// * 기타 제어자
//    * final 제어자 : '변경될 수 없는'의 의미를 가지며 거의 모든 대상에 사용 가능.
//        * 필드나 지녁 변수에 사용되면 값을 변경할 수 없는 상수(Constant)가 됨.
//        * 메서드에 사용되면 오버라이딩(Overriding)을 통한 재정의 불가.
//        * 클래스에 사용되면 자신을 확장하는 자손클래스를 정의하지 못함.
//        * <final 이 사용될 수 있는 곳> - 클래스, 메서드, 멤버변수, 지역변수
//          |제어자|    |대상|     |의미|
//          final       클래스    변경/확장 될 수 없는 클래스가 됨. 그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없음.
//                      메서드    변경될 수 없는 메서드, final 로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없음.
//            멤버변수, 지역변수    변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 됨.
//
//    * static 제어자 : '클래스의' 또는 '공통적인'의미로 사용됨.
//        * 변수에 사용하면 해당 변수를 클래스 변수로 만들어 줌.
//        * 메서드에 사용하면 해당 메서드를 클래스 메서드로 만들어 줌.
//        * 초기화 블록에도 사용 가능.
//        * <static 제어자를 가지는 멤버의 특징>
//            1. 프로그램 시작 시 최소에 단 한 번만 생성되고 초기화 됨.
//            2. 인스턴스를 생성하지 않고도 바로 사용 가능.
//            3. 해당 클래스의 모든 인스턴스가 공유함.
//        * <static 이 사용될 수 있는 곳> - 메서드, 필드, 초기화 블록
//
//    * abstract 제어자 : '추상적인'이라는 의미로 사용됨.
//        * 선언부만 있고 구현부가 없는 메서드를 추상 메서드라 하며, 반드시 abstract 제어자를 붙여야 함.
//        * 하나 이상의 추상 메서드가 포함하고 있는 추상 클래스도 반드시 abstract 제어자를 붙여야 함.
//        * < abstract 가 사용될 수 있는 곳> - 클래스, 메서드
//
//    * 제어자의 조합 : 자바에서는 접근 제어자와 기타 제어자를 한 대상에 함께 사용 가능.
//                    하지만 모든 경우가 가능한 것은 아님.
//        * <대상에 따라 사용할 수 있는 제어자>
//          |대상|      |함께 사용할 수 있는 제어자|
//          클래스       public, (default), final, abstract
//          메서드       모든 접근 제어자, final, static, abstract
//          필드         모든 접근 제어자, final, static
//          지역변수      final
//          초기화블록    static
//        * 자바에서는 제어자의 특성상 몇몇 제어자는 함께 사용 불가!
//            1. 클래스에 final과 abstract는 함께 사용 불가!
//               : 클래스에 사용되는 final은 클래스를 확장할 수 없고, abstract는 상속을 통해서 완성되어야 하므로 서로 모순됨.
//            2. 메서드에 static과 abstract를 함께 사용 불가!
//               : static 메서드는 몸통이 있는 메서드에만 사용 가능한데 abstract는 선언부만 있음.
//            3. 메서드에 private과 abstract는 함께 사용 불가!
//               : abstract 메서드는 자손클래스에서 구현해주어야 하는데 접근 제어자가 private이면, 자손클래스에서 접근할 수 없음.
//            4. 메서드에 private과 final은 함께 사용할 필요 없음
//               : final과 private은 모두 해당 메서드가 오버라이딩 될 수 없다는 의미를 가지므로, 둘 중 하나만 사용해도 의미가 충분함.
// * */
//
///* 필드 (field) : 클래스에 포함된 변수(variable)를 의미함.
//    * 클래스 내에서 필드는 선언된 위치에 따라 다음과 같이 구분됨.
//        1. 클래스 변수 (static variable)
//        2. 인스턴스 변수 (instance variable)
//        3. 지역 변수 (local variable)
//    * */
//
//    private String modelName; // 필드. private 멤버는 해당 객체 내의 멤버 변수나 메소드만이 접근 가능.
//    private int modelYear; // 필드
//    private String color;
//    private int maxSpeed;
//    private int currentSpeed;
//    private int accelerationTime;
//    boolean door; // 인스턴스 변수
//
//    void openDoor() { //인스턴스 메소드
//        door = true;
//    }
//
///* 생성자 (constructor) : 자바에서는 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 있는 생성자라는 메소드를 제공.
//        * 클래스를 가지고 객체를 생성하면, 해당 객체는 메모리에 즉시 생성됨. 하지만 이렇게 생성된 객체는 모든 인스턴스 변수가 아직 초기화되지 않은 상태임.
//        * 자바에서 생성자의 이름은 해당 클래스의 이름과 같아야 함.
//        * <생성자 특징>
//            1. 생성자는 반환값이 없지만, 반환 타입을 void형으로 선언하지 않음. ***어떠한 반환값도 명시하지 않음에 주의!!
//            2. 생성자는 초기화를 위한 데이터를 인수로 전달 받을 수 있음.
//            3. 객체를 초기화하는 방법이 여러 개 존재할 경우에는 하나의 클래스가 여러 개의 생성자를 가질 수 있음.
//                * 즉, 생성자도 하나의 메소드이므로, 메소드 오버로딩이 가능함!
//        * <생성자의 선언>
//            1. 클래스명() { ... } // 매개변수가 없는 생성자 선언
//            2. 클래스명(인수1, 인수2, ..., 인수n) { ... } // 매개변수가 있는 생성자 선언
//        *  <생성자의 호출>
//            * 자바에서는 new 키워드를 사용하여 객체를 생성할 때 자동으로 생성자가 호출됨.
//    * 기본 생성자 (default constructor)
//        * 자바의 모든 클래스에는 하나 이상의 생성자가 정의도어 있어야 함.
//        * 하지만 특별히 생성자를 정의하지 않고도 인스턴스를 생성할 수 있음.
//           -> 자바 컴파일러가 기본 생성자라는 것을 기본적으로 제공해 주기 때문.
//        * 기본 생성자는 매개변수를 하나도 가지지 않으며, 아무런 명령어도 포함하고 있지 않음.
//        * 자바 컴파일러는 컴파일 시 클래스에 생성자가 하나도 정의되어 있지 않으면, 자동으로 다음과 같은 기본 생성자를 추가함.
//            클래스명() {}
//        * 인스턴스 변수의 초기화는 생성자를 사용하여 수행할 수도 있지만, 클래스 필드에서 바로 수행할 수도 있음.
//            하지만 만약 매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 자동으로 추가되지 않음.
//        * 따라서 매개변수를 가지는 생성자를 하나 이상 저으이한 후 기본 생성자를 호출하면, 오류가 발생함!!
//        * */
//
//    /* this와 this()
//     * this 참조 변수 : 인스턴스가 바로 자기 자신을 참조하는 데 사용하는 변수.
//         * this 참조 변수는 해당 인스턴스의 주소를 가리키고 있음.
//         * 생성자의 매개변수 이름과 인스턴스 변수의 이름이 같을 경우에는 인스턴스 변수 앞에 this 키워드를 붗여 구분해야 함.
//         * 자바에서는 this 참조 변수를 사용하여 인스턴스 변수에 접근할 수 있음.
//         * this 참조 변수를 사용할 수 있는 영역은 인스턴스 메소드 뿐이며, 클래스 메소드에서는 사용할 수 없음.
//         * 모든 인스턴스 메소드에는 this 참조 변수가 숨겨진 지역 변수로 존재하고 있음.
//
//     * this() 메소드 : 생성자 내부에서만 사용할 수 있으며, 같은 클래스의 다른 생성자를 호출할 때 사용함.
//         * this() 메소드에 인수를 전달하면, 생성자 중에서 메소드 시그니처가 일치하는 다른 생성자를 찾아 호출해 줌.
//         * Method Signature : 메소드명과 메소드의 원형에 명시되는 매개변수 리스트를 가리킴.
//         * 내부적으로 다른 생성자를 호출하여 인스턴스 변수를 초기화할 수 있음.
//         * 단, 한 생성자에서 다른 생성자를 호출할 때에는 반드시 해당 생성자의 첫 줄에서만 호출할 수 있음.
//     * */
//    Car(String modelName, int modelYear) { // 생성자. Car 클래스의 생성자는 Car()가 됨.
//        this.modelName = modelName;
//        this.modelYear = modelYear;
//    }
//
//    Car(String modelName, int modelYear, String color, int maxSpeed) {
//        this.modelName = modelName;
//        this.modelYear = modelYear;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//        this.currentSpeed = 0;
//    }
//
///* 메소드 (method) : 어떠한 특정 작업을 수행하기 위한 명령문의 집합.
//        * 메소드의 사용 목적
//            1. 중복되는 코드의 반복적인 프로그래밍을 피할 수 있게 됨.
//            2. 모듈화로 인해 전체적인 코드의 가독성이 좋아짐.
//            3. 프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수 가능.
//        * 메소드를 작성할 때는 되도록 하나의 메소드가 하나의 기능만을 수행하도록 작성하는 것이 좋음.
//        * 자바에서 메소드를 정의하는 방법 :
//            접근제어자 반환타입 메소드명(매개변수목록) { //선언부
//                //구현부
//             }
//             * 접근 제어자 : 해당 메소드에 접근할 수 있는 범위 명시.
//             * 반환 타입(return type) : 메소드가 모든 작업을 마치고 반환하는 데이터의 타입 명시.
//             * 메소드명 : 메소드를 호출하기 위한 이름 명시.
//             * 매개변수목록(parameters) : 메소드 호출할 때 전달되는 인수의 값을 저장할 변수들 명시.
//             * 구현부 : 메소드의 고유 기능을 수행하는 명령문의 집합.
//             * 메소드 시그니처(method signature) : 메소드의 선언부에 명시되는 매개변수의 리스트.
//                                                만약 두 메소드가 매개변수의 개수와 타입, 그 순서까지 모두 같다면,
//                                                이 두 메소드의 시그니처는 같다고 할 수 있음.
//        * 메소드의 구분 : 클래스 내에서 메소드는 static 키워드의 여부에 따라
//            1. 클래스 메소드 (static method)
//            2. 인스턴스 메소드 (instance method)
//        * 메소드 호출하는 방법 :
//            1. 객체참조변수이름.메소드명();  // 매개변수가 없는 메소드의 호출
//            2. 객체참조변수이름.메소드명(인수1, 인수2, ..., 인수n);  // 매개변수가 있는 메소드의 호출
//    *
//    * 메소드 오버로딩 (Method Overloading) : 같은 이름의 메소드를 중보하여 정의하는 것을 의미함.
//        * 메소드 오버로딩의 핵심은 메소드 시그니처에 있음.
//        * 자바에서는 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없음.
//        * 하지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성할 수 있음.
//        * 즉, 메소드 오버로딩은 서로 다른 시그니처를 갖는 여러 메소드를 같은 이름으로 정의하는 것이라고 할 수 있음.
//        * 메소드 오버로딩을 사용함으로써 메소드에 사용되는 이름을 절약할 수 있음.
//        * 메소드를 호출할 때 전달해야 할 매개변수의 타입이나 개수에 대해 크게 신경을 쓰지 않고 호출할 수 있게 됨.
//        * 메소드 오버로딩은 객체지향 프로그래밍의 특징 중 하나인 다형성(POLYMORPHISM)을 구현하는 방법 중 하나임.
//        * <메소드 오버로딩의 조건>
//            1. 메소드명이 같아야 함.
//            2. 메소드의 시그니처, 즉 매개변수의 개수나 타입이 달라야 함.
//            * 반환 타입과는 관계 없음.
//              만약 메소드의 시그니처는 같은데 반환 타입만이 다른 경우에는 오버로딩이 성립하지 않음.
//        * 자바 컴파일러는 사용자가 오버로딩된 함수를 호출하면, 전달된 매개변수의 개수와 타입과 같은 시그니처를 갖는 메소드를 찾아 호출함.
//        * */
//
//    public String getModel() { // 메소드
//        return this.modelYear + "년식 " + this.modelName + " " + this.color;
//    }
//
//    public void accelerate(int speed, int second) { //선언부
////         public 접근 제어자를 사용하여 선언되어 해당 객체를 사용하는 프로그램 어디에서나 직접 접근 가능.
////         void 반환 타입을 사용하여 어떠한 값도 반환하지 않는다는 의미를 명시.
////         매개변수로 int형 변수인 speed와 second를 전달받음.
////         이렇게 전달받은 매개변수를 가지고 메소드 구현부에서 고유한 작업을 수행할 수 있는 것.
//
//        //구현부
//        System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
//    }
//
//    static boolean toggleDoor(boolean d) { //클래스 메소드
//        return !d;
//    }
//}
