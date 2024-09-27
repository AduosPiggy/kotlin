
fun main(args: Array<String>){
    var son = BigHeadSon
    var father = SmallHeadFather()//接口
    var father2 = SmallHeadFather2By()//代理 by

    son.washing()
    father.washing()
    father2.washing()
}

