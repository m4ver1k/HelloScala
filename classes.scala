class Calc(brand:String ){

//type inference

val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }


def add(a:Int,b:Int):Int=a+b

}

val c=new Calc("Hi")

println(c.color)
println (c.add(1,2))