package creatingenerics

inline fun <reified T : Any> d() = a(T::class)

val kd = d<K>()