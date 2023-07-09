# 자바튜토리얼

https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/package-summary.html

## Object class Method
업캐스팅 된경우 자식 클래스의 메소드를 사용할수 없다.<br>
따라서 자식 클래스의 메소드를 사용하려면 Object class 의 method를 @override 하거나<br>
추상클래스를 따로 만들어 상속한뒤 @override 하여 사용이 가능하다.<br>

![Object class](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/9cda50ac-7f1f-4bab-8d3f-a89a3ee7606b)



## Collection

![1](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/728cfa22-9f15-4be7-bd89-73a2a33a6da9)
<br><br>
![2](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/a3bbaf0d-6202-4c1b-be66-5980833b2206)

<br><br>
## List Method

![List](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/af8f1a5c-ddb0-482f-a927-1281990a978b)

<br><br>

## Set Method
![Set](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/5309eeb2-d96f-44f5-8c22-06d1be0dc798)

<br><br>

## Map Method

![Map](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/f27820ea-bea2-4c45-9054-d842c5621216)
<br><br>
## 함수형 인터페이스
![함수형 인터페이스](https://github.com/jeongwwon/JAVA-tutorial/assets/104192273/caf36008-3daa-495c-b432-bec375732e82)

<br><br>

## Stream API
데이터를 처리하는 api로 자바 입출력의 스트림과 다르다.<br>
스트림 생성(Create) -> 중간 연산(Intermediate operating) -> 최종 연산(Final operation)의 형태이며 . 를 통한 메서드 체이닝이다.<br>
### 중간연산 메서드
<ul>
<li>스트림 필터링 : filter(), distinct()</li>
<li>스트림 변환 : map(), flatMap()</li>
<li>스트림 제한 : limit(), skip()</li>
<li>스트림 정렬 : sorted()</li>
<li>스트림 연산 결과 확인 : peek()</li>
<li>타입변환: asDoubleStream(), asLongStream(), boxed()</li>
  </ul>
<br>

### 최종연산 메서드
<ul>
  <li>요소의 출력 : forEach()</li>
<li>요소의 소모 : reduce()</li>
<li>요소의 검색 : findFirst(), findAny()</li>
<li>요소의 검사 : anyMatch(), allMatch(), noneMatch()</li>
<li>요소의 통계 : count(), min(), max()</li>
<li>요소의 연산 : sum(), average()</li>
<li>요소의 수집 : collect()</li>
</ul>

#### collect 함수
<ul>
<li>스트림을 배열이나 컬렉션으로 변환 : toArray(), toCollection(), toList(), toSet(), toMap()</li>
<li>요소의 통계와 연산 메소드와 같은 동작을 수행 : counting(), maxBy(), minBy(), summingInt(), averagingInt() 등</li>
<li>요소의 소모와 같은 동작을 수행 : reducing(), joining()</li>
<li>요소의 그룹화와 분할 : groupingBy(), partitioningBy()</li>
</ul>
