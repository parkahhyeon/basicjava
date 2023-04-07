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

		//함수 호출
		variableExample();
		constantEx();

		//Literal : varLong 리터럴 값 = 123456789l 자체 값을 의미. 
		long varLong = 123456789L; // 생략가능하지만 써주기
		float varFloat = 8.9F; // 리터럴 F 또는 f는 생략 불가.
		double varDouble = 1.234D; // 생략가능하지만 써주기
		System.out.println("long: "+varLong);
		System.out.println("float: "+varFloat);
		System.out.println("double: "+varDouble);

		overflowExample();
		doubleInfo();
		implicitConversionExample();
		explicitConversionExample();
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

		System.out.println(num2+","+num3);
	}

//	상수 예제 메서드
	public static void constantEx() {
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
}
