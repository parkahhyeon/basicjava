# basicjava
Java 기초 공부

*************
## Intelli J 단축키
### 리팩토링 단축키
* ```Ctrl + Alt + L``` 
### 쿼리를 위한 단축키
* ```Ctrl + Shift + J``` : 하단에 있는 문자열을 합치는 단축키. 쿼리문 같은 문자열을 한줄로 합칠때 사용


### 되돌리기 단축키로 undo가 안 될 때
 Vim과 다르게 많은 IDE들은 history를 무한하게 저장하지 않기 때문에 저장 개수를 설정하여, history 메모리 공간을 늘려주어야 한다.
<방법 1> - IntelliJ에서 실행취소 기록 history 크기 늘리기
1. [Shift] [Shift] (연속 두 번 클릭) 해서 [Action] 탭에서 'registry' 검색하여 레지스트리 편집 창 들어가기.
   
   또는 
   IntelliJ 상단에서 [Help] > [Find Action...] 클릭해서 'registroy' 검색하여 레지스트리 편집 창 들어가기.
   
2. Key에서 '''undo.documentUndoLimit'''과 '''undo.globalUndiLimit''' 을 찾아 Value 수정하기.
   history를 늘리기 위해 더 큰 값을 입력해준 후 창을 닫는다.
   ```
   undo.documentUndoLimit   |   1000{100]
   undo.globalUndoLimit     |   100[10]
   ```
   * undo.documentUndoLimit : 문서 내에서 지우기, 변수 변경 등의 일반적인 문서 되돌리기. (default value : 100)
   * undo.globalUndoLimit : 전체 시스템에서 파일 삭제, 마이그레이션 취소, 파일 추가, 실행 취소 등의 되돌리는 history limit 개수. (default value : 10)
3. IntelliJ를 껐다 키기.

<방법 2> - Local History 보기
1. IntelliJ 상단 탭 라인에서 [File] > [Local History] > [Show History] 클릭하기.
2. 과기 기록과 변경 목록을 확인하여 되돌리기.
*****************************************************
### 2진수의 수 표현법 
참조) [2진수의 수와 음수 표현법 <1의 보수와 2의 보수>](https://st-lab.tistory.com/189)

 예를 들어 4bit에서 수를 표현한다면 다음과 같이 할 수 있다.

```
0000(2) = 0
0001(2) = 1
0010(2) = 2
0011(2) = 3
0100(2) = 4
.
.
.
1110(2) = 14
1111(2) = 15
```
0과 양수는 표현이 되었는데 음수는 어떻게 표현할까?


* 부호 절대값 (Sign-Magnitude)

가장 쉽게 생각할 수 있는 방법은 최상위 비트(가장 왼쪽의 비트)를 이용하는 방법이다.
자주 쓰는 int(32bit) 자료형으로 예를 들어서 5를 이진수로 표현하면 다음과 같다.

```5(10) = 0000 0000 0000 0000 0000 0000 0000 0101(2)```

음수 표현법 [1의 보수와 2의 보수]
최상위 비트 (MSB, Most Significant Bit) : 가장 왼쪽의 비트.
(만약 비트가 아닌 바이트 즉, Most Significant Byte와 혼용할 경우에 보통은 MSBit, MSByte 로 구분지어서 표기함)
