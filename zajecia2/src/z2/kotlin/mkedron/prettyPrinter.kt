package z2.kotlin.mkedron

fun <T>joinToString ( collection: Collection<T>,
                      separator: String = " | ",
                      prefix: String = "[",
                      postfix: String = "]"): String {
    val result = StringBuilder(prefix)
    for (item in collection) {
        result.append(item)
        if(collection.indexOf(item) == collection.size-1)
            continue
        result.append(separator)
    }
    result.append(postfix)
    return result.toString()
}