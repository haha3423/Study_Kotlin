package Sec01

fun main() {

    /*
    1. 기본 타입
    2. 타입 캐스팅
    3. Kotlin의 3가지 특이한 타입
    4. String Interpolation, String indexing
     */

    // 기본적으로 코틀린은 선언된 기본값을 보고 타입을 추론한다.
    // 또한 Kotlin에서 타입 변환은 명시적으로 이뤄저야함 (Java에선 암시적으로 변경됨)
    // var number1 = 3     // Int로 간주
    // var number2 = 3L    // Long으로 간주
    // val number3 = 3.0f  // Float로 간주
    // val number4 = 3.0   // Double로 간주
    // number2 = number1; // Error! TypeMismatch

    // val number1 = 3
    // val number2: Long = number1.toLong()

    // val number1: Int? = 3
    // val number2: Long = number1.toLong() // Error! null이 들어올 수도 있잖
    // val number2: Long = number1?.toLong() ?: 3L // Correct

}
/*
Base Java Code
----
public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
        Person person = (Person) obj;
        System.out.println(person.getAge());
    }
}
 */

//fun printAgeIfPerson(obj: Any) {
//    if(obj is Person) {
//        val person = obj as Person
//        println(person.age)
//    }
//}

fun printAgeIfPerson(obj: Any) {
    if(obj is Person) {
        println(obj.age)
    }
}

// 부정문 (~가 아닐경우)
fun printAgeIfNotsPerson(obj: Any) {
    if(obj !is Person) {
        //println(obj.age) // Error! obj가 person이 아니기 때문에 에러가 남
    }
}

// 변수에 Null이 들어올 수 있는 경우라면?
fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

fun stringTest1 () {
    val person = Person1("조지훈", 29)
    val log = "사람의 이름은 ${person.name}이고, 나이는 ${person.age}입니다."
    println(log)
}

fun stringTest2 () {
    val name = "조지훈"
    var str = """
        ABC
        DFG
        ${name}
    """.trimIndent()
}



