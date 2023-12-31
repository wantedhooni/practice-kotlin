package ex_pair

// 두 수의 몫과 나머지를 반환한다.
fun divide(a: Int, b: Int): Pair<Int, Int>
{
	return Pair(a / b, a % b)
}

fun main(args: Array<String>)
{
	val (q, r) = divide(10, 3)
	println("몫: $q")
	println("나머지: $r")
}
