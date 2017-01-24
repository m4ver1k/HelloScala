//simple function
def addOne(m: Int): Int = m + 1


//function with block of code
def add(m: Int,n:Int):Int = {
    m+n
}


//void function
def add(m: Int,n:Int) = {
  println( m+n)
}


//variable length args
def capiatlizeAll(args: String*)={
    args.map  {arg =>
    arg.capitalize
    } 
}


