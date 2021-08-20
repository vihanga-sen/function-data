object Bank extends App {

    var Bank : List[Account] = List( new Account("Vihanga" , 1 , -1000) , new Account("Senarath" , 2 , 2000) )

    val find = ( n : Int , b : List[Account]) => b.filter( x => x.accountNumber.equals( n ))

    val over_draft = ( b : List[Account] ) => b.filter( x => x.balance < 0)

    val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

    val interest = ( b : List[Account] ) => b.map( x => {
        x.balance match {
            case a if a >= 0 => x deposit x.balance * 0.05
            case _ => x withdraw Math.abs(x.balance) * 0.01

        }
        x
    })


    println("bank " + bank )
    println()
    println("find " + find( 2 , bank) )
    println()
    println("overdraft " + over_draft( bank ) )
    println()
    println("balance " + balance( bank )._2 )
    println()

    bank = interest( bank )

    println("bank " + bank )
    println()
    println("balance " + balance( bank )._2 )
    println()

}
