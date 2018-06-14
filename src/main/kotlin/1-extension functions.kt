fun String.countAmountOfX(): Int {
    return length - replace("x", "").length
}

val count = "xFunxWithxKotlinx".countAmountOfX()