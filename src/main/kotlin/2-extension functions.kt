fun String.countAmountOfX(): Int =
        this.length - replace("x", "").length

val count = "xFunxWithxKotlinx".countAmountOfX()