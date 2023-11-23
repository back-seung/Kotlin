package creatingenerics

import kotlin.reflect.KClass // 코틀린 클래스를 표현하는 클래스

fun <T : Any> a(kClass: KClass<T>) {
    // KClass<T>를 사용한다.
}