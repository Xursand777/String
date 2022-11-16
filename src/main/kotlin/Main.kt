fun main() {
    var name="O'ktamov | Xursand | Uzbekistan | Urgench"
    var str="She said \"This is \"to me"
    val a="42"
    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    println(name.lowercase())                                  //xamma xarf kichik
    println(name.uppercase())                                  //xamma xarf katta
    println(name.replaceFirstChar { it.uppercase() })          //o'zgarishsiz chiqarish
    println(a.toInt())                                         //Stringni Int qilib chiqarish
    println(a.toIntOrNull())                                   // agar so'z bolsa null
    println(name.replace("u","o'"))            //u ning orniga o' qoyish uchun
    println(str)
    println(name.get(3))
    println(name[4])
    println(name.substring(4,7))                                //4 dan 6 gacha chiqaradi  7 chi kirmaydi
    println(name.substring(4..7))                   // 4 dan 7 gacha shu oraliqdagi so'z
    println(name.drop(2))                                    // 1 gacha ochiradi 2 dan davom etadi
    println(name.dropLast(2))                                // oxirdan 1 gacha ochirib 2 dan davom etadi
    println(name.removeRange(4,7))                              // 4 dan 6 gacha o'chirib qolganlarini chiqaradi
    println(name.removePrefix("O'ktam"))
    println(name.subSequence(4,7))
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())
    println(name.split("|"))                           //String to array words
    println(a.repeat(3))                                      //3 marta takrorlab chiqarish
    println(array1.joinToString (";"))
    println(name.indexOf("X"))                              //nechnch indexda ekanini ko'rsatadi
    println(name.contains("X"))

    stringtoprint(a)
    println(reverseword("Xursand"))
}

fun reverseword(word:String):String{
    val count=word.length
    var result=""
    for (i in count-1 downTo 0){
        result=result+word[i]
    }
    return result
}

fun stringtoprint(name:String){
    for (i in name){
        println(i)
    }
    for ((i,j) in name.withIndex()){
        println("$i -> $j")
    }
}