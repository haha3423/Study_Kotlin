package Sec01


class JavaMoney(private val amount: Long) : Comparable<JavaMoney?> {
    override fun compareTo(other: JavaMoney?): Long? {
        return other?.let { java.lang.Long.compare(amount, it.amount) }
    }
}

fun main() {
    val m1 = JavaMoney(2_000L)
    val m2 = JavaMoney(1_000L)

    if (m1 > m2) {
        println("M1가 M2보다 큽니다.")
    }
}

fun lazy () {
    if (fun1() || fun2()) {
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}

