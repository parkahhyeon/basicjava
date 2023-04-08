package com.example.basicjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        System.out.println("+ 연산자에 의한 결과 : " + (num1 + num2)
                        + "\n- 연산자에 의한 결과 : " + (num1 - num2)
                        + "\n* 연산자에 의한 결과 : " + (num1 * num2)
                        + "\n/ 연산자에 의한 결과 : " + (num1 / num2)
                        + "% 연산자에 의한 결과 : " + (num1 % num2));
    }

    public static void assignmentOperatorExample() {
//        대입 연산자 : 변수에 값을 대입할 때 사용하는 이항 연산자.
//        피연산자들의 결합 방향은 오른쪽에서 왼쪽.
        int num1 = 7;
        int num2 = 7;
        int num3 = 7;

        num1 = num1 -3;
        num2 -= 3;
        num3 =- 3; // -3을 num3에 대입하는 연산.

        System.out.println("- 연산자에 의한 결과 : "+ num1
                    + "\n-= 연산자에 의한 결과 : " + num2
                    + "\n=- 연산자에 의한 결과 :" + num3);
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
        System.out.println("x : "+ x + ", y : " + y);
    }

    public static void relationalOperatorExample() {
//        비교 연산자 : 왼쪽의 피연산자와 오른쪽의 피연산자를 비교하여, 어느 쪽이 더 큰지, 작은지, 또는 서로 같은지를 판단하는 이항 연산자.
//        피연산자들의 결합 방향은 왼쪽에서 오른쪽.   ==    !=   >   >=   <   <=
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("== 연산자에 의한 결과 : " + (ch1 == ch2) ); // false
        System.out.println("> 연산자에 의한 결과 : " + (ch1 > ch2) );   // true
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

        System.out.println("&& 연산자에 의한 결과 : " + result1
                        + "\n||연산자에 의한 결과 : " + result2
                       + "\n! 연산자에 의한 결과 : " + !result2); // !result2 == !true == false
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

        System.out.println("~ 연산자에 의한 결과 : " + ~x
                         + "\n<< 2 연산자에 의한 결과 : " + (x << 2)
                         + "\n>> 2 연산자에 의한 결과 : " + (y >> 2)
                         + "\n>>> 2 연산자에 의한 결과 : " + (x >>> 2)
                         + "\n>>> 2 연산자에 의한 결과 : " + (y >>> 2));
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
    static class A {}
    static class B extends A {}
}
