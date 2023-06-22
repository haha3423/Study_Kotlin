package Sec01

import java.lang.IllegalArgumentException

/**
 * Section 01. 2강_코틀린에서 Null을 다루는 방법
 *
 */

fun startsWithA1(str: String?): Boolean {
    // String? == null이 들어올 수 있음을 명시
    // 없으면 null이 못들어옴
    if (str == null) {
        throw IllegalArgumentException("null이 들어감");
    }
    return str.startsWith("A")
}

// 좀더 코틀린스럽게 바꾼 fun01
fun startsWithA1_kt(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어감")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

// 좀더 코틀린스럽게 바꾼 fun02
fun startsWithA2_kt(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    // return str.startsWith("A") >> Error
    if (str == null) {
        return false
    }
    return str.startsWith("A")
    // >> 여기선 Error가 안나는 이유는 위의 if문에서 null처리를 했다고 컴파일러가 간주하였기 때문
}

// 좀더 코틀린스럽게 바꾼 fun03
fun startsWithA3_kt(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// null 아님 단언!!
// nullable type이지만, 아무리 생각해도 null이 될 수 없는 경우
// 컴파일러에게 null이 아님을 단언하는 !! 용법이 있음
fun startWith4(str: String?): Boolean {
    // str!! (느낌표 2개)
    // 변수가 String?이기 때문에 null이 들어올 수 있기는 함
    // 이 때는 컴파일 에러는 안나지만, 런타임 에러(NPE)가 발생함
    return str!!.startsWith("A")
}


// Kotlin에서는 Null이 가능한 타입을 완전히 다르게 취급한다!
fun main() {
    val str: String? = null
    // println(str.length)
    // Error >> Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // 즉, null이 들어갈 수 있는 변수에는 .을 바로 사용할 수 없다

    // println(str?.length)
    // Success >> Safe Call이라고 함
    // null이 아니면 실행하고, null이면 실행하지 않는다 (그대로 null)

    println(str?.length ?: 0)
    // Success >> Elvis 연산자
    // 앞의 결과가 null이면 ?: 뒤의 값이 사용됨

    val person = Person("조지훈")
    startWith5(person.name)
}

fun startWith5(str: String): Boolean {
    return str.startsWith("A")
}

