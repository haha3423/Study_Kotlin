package Sec01

/**
 * Section 01. 1강_코틀린에서 변수를 다루는 방법
 */
fun main() {

    var number1 = 10L; // (1) 가변
    val number2 = 10L; // (2) 불변 (read-only)
    // var와 val의 차이는 final!
    // 기본적으로 모든 변수는 불변(val)으로 만들고, 필요한 경우에만 가변(var)으로 사용

    // Java 또는 TypeScript마냥 변수형을 선언하려면?
    // var number1: Long = 10L

    // 값을 할당하지 않은 상태(초기화X)로 변수를 선언하려면?
    // var number1 // Error!
    // var number1: Long // (Correct)!
    // 다만 위처럼 초기화 없이 변수를 사용할 땐 컴파일 에러 발생

    //----
    val number3 = 1_000L
    /*
        Java에서는 long과 Long은 같은 타입이지만
        long은 primitive type, Long은 Reference type으로 구분된다.
        보통 계산 등 작업에선 prim type을 사용하고, ref type은 사용하지 않는데,
        이는 불필요한 Boxing/Unboxing을 방지하기 위함
        Kotlin에서는 ': Long'을 선언해도 컴파일 과정에서 자동으로 연산에선 prim과 ref타입을 알아서 구분하여 사용함
        추가로 ref type에선 null이 초기화 될 수 있는데
        kotlin에선 Null이 기본적으로 사용되지 않음
        만약 null이 들어갈 수 있음을 표기하고 싶다면
     */
    var number4: Long? = 1_000L
    number4 = null
    // 처럼 표기한다. 이 때에 아예 다른 타입으로 간주된다.

    var person = Person("조지훈")
    // Kotlin에서는 객체를 인스턴스화 할 때 'new'를 붙이지 않는다.
}

class Person(s: String): Any() {
    var name: String = s
    var age: Int? = 0
}

class Person1(name: String?, age:Int): Any() {
    var name: String? = name
    var age: Int? = age
}
