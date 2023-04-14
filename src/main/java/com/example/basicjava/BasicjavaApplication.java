package com.example.basicjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BasicjavaApplication {

    //상수(constant) : 반드시 선언과 함께 초기화 해야 함!
    // 불변 값.
    static final int AGES = 30;
//	final int AGES2023 = 27;

    public static void main(String[] args) {
        SpringApplication.run(BasicjavaApplication.class, args);
        new HelloWorld().helloworld();

        //Literal : varLong 리터럴 값 = 123456789l 자체 값을 의미.
        long varLong = 123456789L; // 생략가능하지만 써주기
        float varFloat = 8.9F; // 리터럴 F 또는 f는 생략 불가.
        double varDouble = 1.234D; // 생략가능하지만 써주기
        System.out.println("long: " + varLong);
        System.out.println("float: " + varFloat);
        System.out.println("double: " + varDouble);

        //함수 호출
        variableExample();
        constantExample();
        overflowExample();
        doubleInfo();
        implicitConversionExample();
        explicitConversionExample();
        arithmeticOperatorExample();
        assignmentOperatorExample();
        incrementAndDecrementOperatorsExample();
        relationalOperatorExample();
        logicalOperator();
        bitwiseOperatorExample();
        ternaryOperatorExample();
        instanceofExample();
        controlFlowStatementsExample();
        arrayExample();
        multiDimensionalArrayExample();
        dynamicArrayExample();
        arrayUtilizationExample();


        Car myCar = new Car(); // 기본 생성자의 호출
//        Car myCar = new Car("아반떼", 2016, "흰색", 200); // 생성자의 호출
        System.out.println(myCar.getModel()); // 생성자에 의해 초기화 되었는지를 확인함.
        // 0년식 null null
        // 원래는 매개변수를 가지는 Car 클래스를 기본 생성자로 호출하면 자바 컴파일러는 Car 클래스에 별도의 기본 생성자를 추가하지 않으므로
        // 오류를 발생시킬 것이지만, 여기서는 직접 Car() {} 를 작성해줬기 때문에 0년식 null null 이라는 값이 출력됨.
        // 오류가 나지 않으려면 조건을 충족시키는 매개변수를 전달해야만 인스턴스가 생성됨.

        myCar.accelerate(60, 3); //메소드 호출

        CarDefaultConstructor yourCar = new CarDefaultConstructor(); // 객체 생성. 기본 생성자의 호출
        System.out.println(yourCar.getModel()); // 2015년식 파란색 소나타
        // CarDefaultConstructor 클래스의 인스턴스의 yourCar는 기본 생성자를 사용하여 생성됨.
        // 하지만 기본 생성자는 아무런 동작도 하지 않으므로, 인스턴스 변수를 클래스 필드에서 바로 초기화.

        display(10);          // 10
        display(10, 20);   // 200
        display(10, 3.14); // 13.14

        display(10, 'a');  // 970 = 10 * 97
        // 자바에서 char형 데이터는 int형 뿐만 아니라 double형으로도 타입 변환될 수 있기 때문에 오버로딩한 메소드의 모호한 호출을 허용하지 않음.
        // 위와 같은 경우에는 더 작은 표현 범위를 가지는 int형으로 자동 타입 변환하게 됨.

        MethodOverloadingTest overloadingFunc = new MethodOverloadingTest();

        overloadingFunc.display(100);           // 100
        overloadingFunc.display(100, 50);    // 5000
        overloadingFunc.display(100, 3.14);  // 103.14
        overloadingFunc.display(100, 'a');   // 9700

        System.out.println("재귀 호출을 사용하지 않고 1~n까지의 합 : " + sumTest(10));
        RecursiveCallTest call = new RecursiveCallTest();
        System.out.println("재귀 호출을 사용한 1~n 까지의 합 : " + RecursiveCallTest.recursiveSum(10));

        SamePackage sp = new SamePackage();
        System.out.println(sp.sameVar);     // 같은 패키지는 접근 허용

        SameClass sc = new SameClass();
        System.out.println(sc.protectedVar);

    }

    //	변수 예제 메서드
    public static void variableExample() {
        int num = 0;
        System.out.println(num);

        int num100 = 100;
        System.out.println(num100);

        double num1 = 3.14;
        System.out.println(num1);

        // 이미 선언된 여러 변수를 동시에 초기화할 수 없음.
//		double num2, num3;
//		num2 = 1.23, num3 = 4.56;
        double num2 = 1.23;
        double num3 = 4.56;

        System.out.println(num2 + "," + num3);
    }

    //	상수 예제 메서드
    public static void constantExample() {
        System.out.println(AGES);
//		System.out.println(AGES2023);
    }

    public static void overflowExample() {
//		int num = 2147483648;
//		System.out.println(num);
    }

    public static void doubleInfo() {
        // double형 타입은 소수점 15자리까지 오차없이 표현 가능.
        double detailNum = 1.01234567901234;
        double unknownNum = 1.01234567901234567890;

        System.out.println("소수점 15자리까지는 정확히 표현됨 : " + detailNum + "\n16자리 넘는 케이스 : " + unknownNum);
    }

    public static void implicitConversionExample() {
		/* 묵시적 형 변환(자동 형 변환)
		   byte형 → short형 → int형 → long형 → float형 → double형
		             char형 ↗ */
        int intNum = 100;
        double douNum = 1.234;
        System.out.println(intNum + douNum); // 더 큰 타입을 따라감
    }

    public static void explicitConversionExample() {
        //명시적 타입 변환 (강제 형 변환)
        int num1 = 1;
        int num2 = 4;

        System.out.println("강제형변환 미적용 : " + (num1 / num2) + " / 강제 형변환 적용 : " + ((double) num1 / num2));
    }

    /*연산자(Operator)*/
    public static void arithmeticOperatorExample() {
//		산술 연산자 : 사칙연산. + - * / %(나머지)
//		두 개의 피연산자를 가지는 이항 연산자이며, 피연산자들의 결합 방향은 왼쪽에서 오른쪽임.
        int num1 = 8;
        int num2 = 4;

        System.out.println("+ 연산자에 의한 결과 : " + (num1 + num2) + "\n- 연산자에 의한 결과 : " + (num1 - num2) + "\n* 연산자에 의한 결과 : " + (num1 * num2) + "\n/ 연산자에 의한 결과 : " + (num1 / num2) + "% 연산자에 의한 결과 : " + (num1 % num2));
    }

    public static void assignmentOperatorExample() {
//        대입 연산자 : 변수에 값을 대입할 때 사용하는 이항 연산자.
//        피연산자들의 결합 방향은 오른쪽에서 왼쪽.
        int num1 = 7;
        int num2 = 7;
        int num3 = 7;

        num1 = num1 - 3;
        num2 -= 3;
        num3 = -3; // -3을 num3에 대입하는 연산.

        System.out.println("- 연산자에 의한 결과 : " + num1 + "\n-= 연산자에 의한 결과 : " + num2 + "\n=- 연산자에 의한 결과 :" + num3);
    }

    public static void incrementAndDecrementOperatorsExample() {
//        증감 연산자 : 피연산자를 1씩 증가 혹은 감소시킬 때 사용하는 단항 연산자.
        int num1 = 5;
        int num2 = 5;
        int result1;
        int result2;

        result1 = --num1 + 3; //num1의 값을 먼저 1 감소시킨 후에 나머지 연산을 수행
        result2 = num2-- + 3; //먼저 모든 연산을 마친 후에 변수 num2의 값을 1 감소

        System.out.println("#전위 감소 연산자에 의한 결과 : " + result1 + ", 변수 num1의 값 : " + num1);
        System.out.println("#후위 감소 연산자에 의한 결과 : " + result2 + ", 변수 num2의 값 : " + num2);

        //  증감 연산자의 연산 순서
        int x = 10;
        int y = x-- + 5 + --x;
        /*
        * ① : x--는 감소 연산자가 피연산자의 뒤쪽에 위치하므로, 덧셈 연산 먼저 수행.
          ② : 덧셈 연산이 수행된 후에 감소 연산이 수행. (x의 값 : 9)
          ③ : --x는 감소 연산자가 피연산자의 앞쪽에 위치하므로, 덧셈 연산보다 먼저 수행. (x의 값 : 8)
          ④ : 감소 연산이 수행된 후에 덧셈 연산 수행.
          ⑤ : 마지막으로 변수 y에 결괏값의 대입 연산이 수행. (y의 값 : 23)
         */
        System.out.println("x : " + x + ", y : " + y);
    }

    public static void relationalOperatorExample() {
//        비교 연산자 : 왼쪽의 피연산자와 오른쪽의 피연산자를 비교하여, 어느 쪽이 더 큰지, 작은지, 또는 서로 같은지를 판단하는 이항 연산자.
//        피연산자들의 결합 방향은 왼쪽에서 오른쪽.   ==    !=   >   >=   <   <=
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("== 연산자에 의한 결과 : " + (ch1 == ch2)); // false
        System.out.println("> 연산자에 의한 결과 : " + (ch1 > ch2));   // true
        // 아스키코드(ASCII)에서 'A'는 10진수 65로 나타내며, 'a'는 10진수 97로 나타냄.
        // 따라서 두 문자를 비교하면 'a'가 더 크다는 결과가 나오게 됨.
        // *모든 영문 대문자는 아스키 코드 값은 모든 영문 소문자보다 작은 값을 가짐.
    }

    public static void logicalOperator() {
       /* 논리 연산자 : 주어진 논리식을 판단하여, true와 false를 결정하는 연산자.
        &&	논리식이 모두 참이면 참을 반환함. (논리 AND 연산)
        ||	논리식 중에서 하나라도 참이면 참을 반환함. (논리 OR 연산)
        ! 	논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환함. (논리 NOT 연산)*/
        char ch1 = 'b';
        char ch2 = 'B';
        boolean result1;
        boolean result2;

        result1 = (ch1 > 'a') && (ch1 < 'z'); // (98 > 97) && (98 < 122) == true && true == true
        result2 = (ch2 < 'A') || (ch2 < 'Z'); // (66 < 65) || (66 < 90) == false || true == true

        System.out.println("&& 연산자에 의한 결과 : " + result1 + "\n||연산자에 의한 결과 : " + result2 + "\n! 연산자에 의한 결과 : " + !result2); // !result2 == !true == false
    }

    public static void bitwiseOperatorExample() {
/*      비트 연산자 : bit 단위로 논리 연산을 할 떄 사용하는 연산자.
        bit 단위로 왼쪽이나 오른쪽으로 전체 비트를 이동하거나, 1의 보수를 만들 때도 사용됨.
        & : 비트 AND 연산자. 대응되는 비트가 모두 1일 때만 1을 반환하고, 다른 경우는 모두 0을 반환함.
        | : 비트 OR 연산자. 대응되는 비트 중 하나라도 1이면 1을 반환하고, 두 비트가 모두 0일 때만 0을 반환함.
        ^ : 비트 XOR 연산자. 대응되는 비트가 서로 다르면 1을 반환하고, 서로 같으면 0을 반환함.
        ~ : 비트 NOT 연산자. 해당 비트가 1이면 0으로, 0이면 1로 반전시킴.
        <<  : 왼쪽 시프트 연산자. 명시된 수만큼 비트들을 전부 왼쪽으로 이동시킴. 이때 비트의 이동으로 새로 생긴는 오른쪽 비트들은 언제나 0으로 채워짐.
        >>  : 오른쪽 시프트 연산자. 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴. 새로 생기는 왼쪽 비트들은 양수면 모두 0으로 음수면 모두 1로 채워짐. 부호 안변함.
        >>> : 지정한 수만큼 부호 비트까지 포함하여 전부 오른쪽으로 이동시키며, 새로운 비트는 전부 0이 됨.
              따라서 피연산자가 양수인 경우에는 부호 비트를 이동하지 않는 >> 와 같은 결과를 반환함.
*/
        int x = 8;
        int y = -8; // -8 = 11111000(2) (2의 보수)

        System.out.println("~ 연산자에 의한 결과 : " + ~x + "\n<< 2 연산자에 의한 결과 : " + (x << 2) + "\n>> 2 연산자에 의한 결과 : " + (y >> 2) + "\n>>> 2 연산자에 의한 결과 : " + (x >>> 2) + "\n>>> 2 연산자에 의한 결과 : " + (y >>> 2));
        /*
        * ~x는 x 값인 8의 1의 보수를 반환하므로, 피연산자의 부호만 반대로 변경됨.
        * x << 2는 2만큼 피연산자의 모든 비트가 왼쪽으로 이동하고 새로 생기는 오른쪽 비트들은 0으로 채워짐.
        * y >> 2는 2만큼 모든 비트가 오른쪽으로 이동하고 새로 생기는 왼쪽 비트들은 피연산자인 -8이 음수이므로 모두 1로 채워짐.
        * x >>> 2는 8=00001000(2). x값인 8이 양수이므로 2만큼 모든 비트들이 이동해서 00000010 결과값 도출됨.
        * y >>> 2는 y값(-8)이 음수이므로 부호 비트까지 전부 이동함. 00111110(2)=62라는 연산 결과를 도출함.
                    따라서 이 >>> 시프트 연산자는 10진수의 연산보다는 2진수의 연산에서만 주로 사용됨.
        * */
    }

    public static void ternaryOperatorExample() {
        /*삼항 연산자는 자바에서 유일하게 피연산자를 3개나 가지는 조건 연산자임.
         *   조건식 ? 반환값1 : 반환값2
         * 물음표(?) 앞의 조건식에 따라 결과 값이 true면 반환값1을 반환하고, 결과 값이 false면 반환값2를 반환함.
         */
        int x = 5;
        int y = 7;
        int result = 0;

        result = (x - y > 0) ? x : y;
        System.out.println("두 정수 중 더 큰 수 는 : " + result + "입니다.");
    }

    public static void instanceofExample() {
        /* instanceof 연산자 : 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환해 줌.
           즉, 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해주는 역할.
        * [인스턴스이름] instanceof [클래스 또는 인터페이스 이름]
        * 왼쪽 피연산자인 인스턴스가 오른쪽 피연산자인 클래스나 인터페이스로부터 생성되었으면 true를 반환하고, 그렇지 않으면 false를 반환함.     */

        A a = new A();
        B b = new B();

        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false
        System.out.println(b instanceof B); // true
    }

    static class A {
    }

    static class B extends A {
    }

    /*제어문 : 조건문, 반복문*/
    public static void controlFlowStatementsExample() {
//        조건문(Conditional Statements) : 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문.
        char ch = 'i';
        char m = 'A';

        // if문을 사용하여, 해당 문자가 영문 소문자인지를 확인하는 예제
        if (ch >= 'a' && ch <= 'z')
            System.out.println("해당 문자는 영문 소문자입니다."); // if문에서 실행될 명령문이 한 줄 뿐이라면 중괄호({})를 생략할 수 있음.

        // if-else문을 사용하여, 해당 문자가 영문 소문자인지 아닌지를 확인하는 예제
        if (m >= 'a' && m <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        } // if-else문에서도 실행될 명령문이 한 줄 뿐이라면 {중괄호} 생략 가능.

        // if-else if-else문
        if (m > 'a' && m <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (m >= 'A' && m <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        /* switch 문 : if-else문 보다 가독성이 더 좋으며, 컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편임.
         * switch문의 조건 값으로는 int형으로 승격할 수 있는 값(byte형, short형, char형, int형의 변수나 리터럴)만이 사용될 수 있음.
         * 또한 이러한 기본 타입에 해당하는 데이터를 객체로 포장해 주는 래퍼 클래스 중에서 위에 해당하는 Byte, Short, Character, Integer 클래스의 객체도 사용 가능.
         * enum 키워드를 사용한 열거체와 String 클래스의 객체도 사용 가능.
         * default절은 조건 값이 위에 나열된 어떠한 case절에도 해당하지 않을 때만 실행됨.
         * 각 case절 및 default절은 반드시 break 키워드를 포함하고 있어야 함.*/

        switch (ch) { // switch문을 사용하여, 해당 문자가 영문자 모음인지 확인하는 예제
            case 'a':
                System.out.println("해당 문자는 'A'입니다.");
                break;
            case 'e':
                System.out.println("해당 문자는 'E'입니다.");
                break;
            case 'i':
                System.out.println("해당 문자는 'I'입니다.");
                break;
            case 'o':
                System.out.println("해당 문자는 'O'입니다.");
                break;
            case 'u':
                System.out.println("해당 문자는 'U'입니다.");
                break;
            default:
                System.out.println("해당 문자는 모음이 아닙니다.");
                break;
        }

        switch (m) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("해당 문자는 소문자 모음입니다.");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("해당 문자는 대문자 모음입니다.");
                break;
            default:
                System.out.println("해당 문자는 모음이 아닙니다.");
                break;
        }

//         반복문(Iteration Statements) : while문, do-while문, for문, Enhanced for문
        //while문 : 우선 조건식이 참인지를 판단하여, 조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문.
        int i = 0;
        while (i < 5) {
            System.out.println("while문이 " + (i + 1) + "번째 반복 실행중입니다.");
            i++; // 이부분을 삭제하면 무한 루프에 빠지게 됨.
            // 무한 루프에 빠진 프로그램은 영원히 종료되지 않으므로 특별히 의도한 경우가 아니라면 반드시 피해야 함.
        }
        System.out.println("while문이 종료된 후 변수 i의 값은 " + i + "입니다.");

        // do-while문 : 우선 루프를 한 번 실행한 후에 조건식을 검사함. 조건식의 결과와 상관없이 무조건 한 번은 루프를 실행함.
        int x = 1;
        int y = 1;

        while (x < 1) {
            System.out.println("while문이 " + x + "번째 반복 실행중입니다."); // 조건식 먼저 판단하기 때문에 결과 값이 false라 이 문장은 출력되지 않음.
            x++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
        }
        System.out.println("while문이 종료된 후 변수 x의 값은 " + x + "입니다.");

        do {
            System.out.println("do-while문이 " + x + "번째 반복 실행중입니다.");
            y++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
        } while (y < 1);
        System.out.println("do-while 문이 종료된 후 변수 y의 값은 " + y + "입니다.");

        // for 문 : 자체적으로 초기식, 조건식, 증감식을 모두 포함하고 있는 반복문.
        for (i = 0; i < 5; i++) {
            System.out.println("for문이 " + (i + 1) + "번째 반복 실행중입니다.");
        }
        System.out.println("for문이 종료된 후 변수 i의 값은 " + i + "입니다.");

        for (int k = 0; k < 3; k++) {
            System.out.println("for문이 " + (k + 1) + "번째 반복 실행중입니다.");
        }
        for (int k = 0; k < 3; k++) {
            System.out.println("for문이 " + (k + 1) + "번째 반복 실행중입니다.");
        }
        // 위의 예제에서 반복문을 종료시키기 위한 변수로 k라는 이름의 int형 변수를 한 프로그램에서 두 번이 선언하고 있음.
        // 두 번이나 선언해도 컴파일 오류가 발생하지 않는 이유는 for문이 종료되면 for문의 초기식에서 사용된 변수는 자동으로 소멸하기 때문.

        // Enhanced for문 : 명시한 배열이나 컬렉션의 길이만큼 반복되어 실행됨.
        //                  루프마다 각 요소는 명시한 변수의 이름으로 저장되며, 명령문에서는 이 변수를 사용하여 각 요소를 참조할 수 있음.
        //                  요소를 참조할 때만 사용하는 것이 좋으며, 요소의 값을 변경하는 작업에는 적합하지 않음.
        // for (타입변수이름 : 배열(or 컬렉션이름)) { 배열의 길이만큼 반복적으로 실행하고자 하는 명령문;}
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        //다음 예제는 for문과 Enhanced for문을 이용하여 모든 배열 요소에 10을 더하는 예제
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] += 10; // 각 배열 요소에 10을 더함.
        }

        for (int e : arr2) {
            e += 10; // 각 배열 요소에 10을 더함.
        }

        for (int j = 0; j < arr1.length; j++) {
            System.out.printf(arr1[j] + " "); // 11 12 13 14 15
        } // 이렇게 for문을 사용하면, 각 배열 요소의 값을 쉽게 변경할 수 있음.
        System.out.println();

        for (int j = 0; j < arr2.length; j++) {
            System.out.printf(arr2[j] + " "); // 1 2 3 4 5
        } // Enhanced for문을 이용해 각 배열 요소에 10을 더하고 출력해보면, 원본 배열에는 아무런 변화가 없음을 알 수 있음.
        // Enhanced for문 내부에서 사용되는 배열 요소는 배열 요소 그 자체가 아닌 배열 요소의 복사본임.
        // 따라서 Enhanced for 문에서 배열 요소의 값을 변경해도 원본 배열에는 아무런 영향을 주지 못함.
        System.out.println();

//        기타 제어문
        // 루프의 제어 : 일반적으로 조건식의 검사를 통해 루프로 진입하면, 다음 조건식을 검사하기 전까지 루프 안에 있는 모든 명령문을 실행함.
        //             하지만 continue문과 break문은 이러한 일반적인 루프의 흐름을 사용자가 직접 제어할 수 있도록 도와줌.

        // continue문 : 루프 내에서 사용하여 해당 루프의 나머지 부분을 건너뛰고, 바로 다음 조건식의 판단으로 넘어가게 해줌.
        //              보통 반복문 내에서 특정 조건에 대한 예외 처리를 하고자 할 때 자주 사용.

        // 1부터 100까지의 정수 중에서 5의 배수와 7의 배수를 모두 출력하는 예제
        for (int j = 1; j <= 100; j++) {
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(j);
            } else {
                continue;
            }
        }

        // break문 : 루프 내에서 사용하여 해당 반복문을 완전히 종료시킨 뒤, 반복문 바로 다음에 위치한 명령문을 실행함.
        //           즉, 루프 내에서 조건식의 판단 결과와 상관없이 반복문을 완전히 빠져나가고 싶을 때 사용.

        // 1부터 100까지의 합을 무한 루프를 통해 구하는 예제
        int num = 1;
        int sum = 0;

        while (true) { // 무한 루프
            sum += num;
            if (num == 100) {
                break;
            }

            num++;
        }
        System.out.println("break문을 사용해서 1부터 100까지의 합을 구하는 예제 : " + sum);

       /* 이름을 가지는 반복문 (Break with Label)
       * 일반적인 break 문은 단 하나의 반복문만을 빠져나가게 해줌.
       * 여러 반복문이 중첩된 상황에서 한 번에 모든 반복문을 빠져나가거나, 특정 반복문까지만 빠져나가고 싶을 때는 다른 방법을 사용해야 함.
         이 때 사용할 수 있는 방법이 바로 반복문에 이름(label)을 설정하는 것.
       * 가장 바깥쪽 반복문이나 빠져나가고 싶은 특정 반복문에 이름을 설정한 후, break 키워드 다음에 해당 이름을 명시하면 됨.
         그러면 해당 break 키워드는 현재 반복문이 아닌 해당 이름의 반복문 바로 다음으로 프로그램의 실행을 옮겨줌.
       * 단, 이때 이름(label)은 가리키고자 하는 반복문의 키워드 바로 앞에 위치해야 함.
       * 이름과 반복문의 키워드 사이에 명령문이 존재하면, 자바 컴파일러는 오류를 발생시킴.
       * 반복문을 가리키는 이름(label)은 break 문이나 continue 문에만 사용 가능.
       * */

        System.out.println("구구단 2단부터 4단까지 출력하는 예제 : ");
        allLoop:
        for (int k = 2; k < 10; k++) {
            for (int j = 2; j < 10; j++) {
                if (k == 5) { // 변수 k의 값이 5가 되는 순간, 해당 프로그램의 제어는 2개의 for문을 모두 빠져나와 종료됨.
                    break allLoop;
                }
                System.out.println(k + " * " + j + " = " + (k * j));
            }
        }
    }

    public static void arrayExample() {
//         배열 (array) : **같은 타입**의 여러 변수를 하나의 묶음으로 다루는 것.
//        타입[] 변수명; // 배열을 선언 (배열을 다루기 위한 참조변수 선언)
//        변수명 = new 타입[길이];  // 배열을 생성 (실제 저장공간을 생성)

        int[] grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
        int[] grade2 = new int[3]; // 변수 grade2은 배열을 다루는데 필요한 참조변수일 뿐 값을 저장하기 위한 공간은 아님.

        grade1[0] = 85; // 인덱스(index, 배열에서의 위치를 가리키는 숫자)를 이용한 배열의 초기화.
        grade1[1] = 65; // 인덱스 범위 : 0부터 '배열길이-1'까지.
        grade1[2] = 90;

        grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화. 나머지 배열 요소들은 배열의 타입에 맞게 자동으로 초기화 됨.

        for (int i = 0; i < grade2.length; i++) {
            System.out.print(grade1[i] + " "); //  85 65 90     // index를 이용한 배열로의 접근
        }
        System.out.println();

        for (int i = 0; i < grade2.length; i++) {
            System.out.printf(grade2[i] + " "); // 85 0 0
        }
        System.out.println();

        /* 배열의 타입 : char     byte, short, int   long    float    double         boolean    배열, 인스턴스 등
         *  초 깃 값  : '\u0000'    0                 0L      0.0F    0.0 또는 0.0D    false      null            */
        int[] grade = new int[3];

        grade[0] = 85;
        grade[1] = 65;
        grade[2] = 90;

        // grade[4]라는 해당 배열의 길이를 초과하는 인덱스 사용하면, ArrayIndexOutOfBounds 예외가 발생함.
//        System.out.println(grade[4]);

        // 배열의 초기화 블록(initialization block) : {}를 사용하여 초깃값을 나열한 것.
        //  타입[] 배열명 = (new 타입[]){배열요소1, 배열요소2, ..., 배열요소n};
        int[] gradeInitBlock1 = {70, 90, 80}; // 배열의 선언과 동시에 초기화 방법1
        int[] gradeInitBlock2 = new int[]{70, 90, 80}; // 배열의 선언과 동시에 초기화 방법2
        int[] gradeInitBlock3;
//        gradeInitBlock3 = {70, 90,80};  // 이미 선언된 배열을 이 방법으로 초기화하면 오류 발생.
        int[] gradeInitBlock4;
        gradeInitBlock4 = new int[]{70, 90, 80}; // 이미 선언된 배열은 이 방법으로만 초기화 가능.
//        -> 초기화 블록의 타입과 배열의 타입은 반드시 일치해야 함.

        int[] score = new int[]{85, 65, 90}; // 길이가 3인 int형 배열을 선언과 동시에 초기화.
        for (int i = 0; i < score.length; i++) {
            System.out.printf(score[i] + " ");
        }
        System.out.println();

        // 배열 요소의 합과 평균을 구하는 예제
        int[] arrNum = new int[]{85, 65, 90};
        int sum = 0;

        for (int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }
        System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");
        System.out.println("이 학생의 평균은 " + (sum / arrNum.length) + "입니다.");
    }

    public static void multiDimensionalArrayExample() {
//        다차원 배열 : 2차원 이상의 배열. 배열 요소로 또 따른 배열을 가지는 배열을 의미함.
//        메모리의 용량이 허용하는 한, 차원의 제한은 없지만, 주로 1, 2차원 배열이 사용되고 3차원 이상은 잘 사용되지 않음.
//        2차원 배열 (two dimensional array) : 타입[][] 변수명;
        int[][] arr = new int[2][3];

        int k = 10;
        for (int i = 0; i < arr.length; i++) { // arr.length는 arr[][]의 배열 요소의 총 개수를 반환.
            for (int j = 0; j < arr[i].length; j++) {
                // arr[i].length는 arr의 각 배열 요소인 1차원 배열이 갖고 있는 배열 요소의 총 개수를 반환.
                arr[i][j] = k; // 인덱스를 이용한 초기화
                k += 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 2차원 배열의 초기화 형태로 초기화하는 예제
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
    }

    public static void dynamicArrayExample() {
//        가변 배열 : 행마다 다른 길이의 배열을 저장할 수 있는 배열.
//        - 2차원 이상의 다차원 배열을 생성할 때 전체 배열 차수 중 마지막 차수의 길이를 지정하지 않고,
//          추후에 각기 다른 길이의 배열을 생성함으로써 고정된 형태가 아닌 보다 유동적인 가변 배열을 구성할 수 있음.
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[1];

        // 가변 배열을 선언과 동시에 초기화 블록으로 초기화하는 예제
        int[][] arrInitBlock = {{10, 20}, {10, 20, 30, 40}, {10}};

        for (int i = 0; i < arrInitBlock.length; i++) {
            for (int j = 0; j < arrInitBlock[i].length; j++) {
                System.out.printf(arrInitBlock[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayUtilizationExample() {
        // 다양한 방법으로 배열을 복사하는 예제
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int newLen = 10;

//        1. System 클래스의 arraycopy() 메서드
        int[] arr2 = new int[newLen];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i] + " ");
        }
        System.out.println();

//        2. Arrays 클래스의 copyOf() 메서드
        int[] arr3 = Arrays.copyOf(arr1, 10);

        for (int i = 0; i < arr3.length; i++) {
            System.out.printf(arr3[i] + " ");
        }
        System.out.println();

//        3. Object 클래스의 clone() 메서드
        int[] arr4 = (int[]) arr1.clone();

        for (int i = 0; i < arr4.length; i++) {
            System.out.printf(arr4[i] + " ");
        }
        System.out.println();

//        4. for 문과 인덱스를 이용한 복사
        int[] arr5 = new int[newLen];

        for (int i = 0; i < arr1.length; i++) {
            arr5[i] = arr1[i];
        }

        for (int i = 0; i < arr5.length; i++) {
            System.out.printf(arr5[i] + " ");
        }
        System.out.println();
    }

    static class Car {
        private String modelName;
        private int modelYear;
        private String color;
        private int maxSpeed;
        private int currentSpeed;
        private int accelerationTime;

        // 객체를 초기화하는 방법이 여러 개 존재할 경우, 하나의 클래스가 여러 개의 생성자를 가징 수 있음.
//        Car() {} // 기본 생성자 : 어떠한 매개변수도 전달받지 않으며, 기본적으로 아무런 동작도 하지 않음.
        Car() { // 매개변수를 가지지 않는 이 생성자는 내부에서 this() 메소드를 이용하여 매개변수를 가지는 생성자를 호출함.
            this("소나타", 2012, "검정색", 160); // 다른 생성자를 호출함.
        }

        Car(String modelName) {
        }    // 매개변수가 없는 생성자 선언

        Car(String modelName, int modelYear) {
        }    // 매개변수가 있는 생성자 선언

        Car(String modelName, int modelYear, String color) {
        }

        Car(String modelName, int modelYear, String color, int maxSpeed) {
            // 4개의 매개변수를 갖는 생성자 정의.
            // 따라서 자바 컴파일러는 Car 클래스에 별도의 기본 생성자를 추가하지 않을 것임.

            // 생성자의 매개변수 이름과 인스턴스 변수의 이름이 같을 경우에는 인스턴스 변수 앞에 this 키워드를 붙여 구분해야 함.
            this.modelName = modelName; // 매개변수를 가지는 이 생성자는 this 참조 변수를 사용하여 인스턴스 변수에 접근하고 있음.
            this.modelYear = modelYear;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.currentSpeed = 0;
        } // 클래스의 생성자는 어떠한 반환값도 명시하지 않음!!


        public String getModel() {
            return this.modelYear + "년식 " + this.modelName + " " + this.color;
        }

        public void accelerate(int speed, int second) {
            System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
        }
    }

    static class CarDefaultConstructor {
        private String modelName = "소나타";
        private int modelYear = 2015;
        private String color = "파란색";

        public String getModel() {
            return this.modelYear + "년식 " + this.color + " " + this.modelName;
        }
    }

    static void display(int x) { // 전달받은 x를 그대로 출력함.
        System.out.println(x);
    }

    static void display(int x, int y) { // 전달받은 두 정수의 곱을 출력함.
        System.out.println(x * y);
    }

    static void display(int x, double y) { // 전달받은 정수와 실수의 합을 출력함.
        System.out.println(x + y);
    }

    static class MethodOverloadingTest {
        static void display(int x) {
            System.out.println(x);
        }

        static void display(int x, int y) {
            System.out.println(x * y);
        }

        static void display(int x, double y) {
            System.out.println(x + y);
        }
    }

    static int sumTest(int n) { // 재귀 호출을 사용하지 않고 만든 메소드.
        // 직관적으로 그 목적을 바로 알 수 없고, 코드를 해석해야 무슨 목적으로 만든 건지 알 수 있는 메소드.
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static class RecursiveCallTest { // 재귀 호출을 사용한 1~n 까지 합을 구하기.
        static int recursiveSum(int n) {
            if (n == 1) {   // n이 1이면, 1을 반환
                return 1;
            }
            return n + recursiveSum(n - 1);     // n이 1이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환
        }
        // 위의 메소드에서 if 문이 존재하지 않으면, 이 프로그램은 실행 직후 스택 오버플로우(Stack Overflow)에 의해 종료될 것임.
        // 따라서 재귀 호출을 중단하기 위한 조건문을 반드시 포함해야 함.
    }

    public static class SameClass {
        private String var = "같은 클래스만 접근 허용";   // private 필드
        String defaultVar = "다른 패키지는 접근 불가";    // default 필드
        protected String protectedVar = "다른 패키지에 속하는 자식 클래스까지 접근 허용";   // protected 필드
        private String getVar() {   // private 메서드
            return this.var;
        }
    }

    public class Everywhere {
        public String var = "누구든지 접근 허용";   // public 필드
        public String getVar() {    // public 메서드
            return this.var;
        }
    }

    public static class SamePackage {
        String sameVar = "같은 패키지는 접근 허용"; // default 필드
    }






}
