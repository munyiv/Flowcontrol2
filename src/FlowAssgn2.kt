fun main(){
   println( isEven(2))
    println(isEven(13))
    category("hygiene")
    category("other")
  var Fruit=Fruit("banana")
    print(Fruit[0])
    print(Fruit[2])
    print(Fruit[4])

}

fun isEven(num:Int):Boolean{
    if (num%2==0){
        return true
    } else if (num%3==0){
        return false
    }else
        return false
    }

fun Fruit(fruitName:String):String{
    var Fruit=fruitName
    return  fruitName

}

data class Product(var name:String,var weight:Float, var price:Int, var category:String)

fun category(category:String){
    when (category){
        "groceries"-> println("Buy me fruits from the market")
        "hygiene"-> println("Wash your fruits before eating")
        "other"-> println("i have bought a lot of items")

    }


    }



