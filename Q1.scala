class Rational( a:Int , b:Int ) {
    require(b>0 , "denominator should always be positive")
    private def gcd( m:Int , n:Int ):Int = {
        if ( n == 0 ) m
        else if ( n > m ) gcd( n , m )
        else gcd( n, m%n )
    }


    val g = gcd( Math.abs(a) , b )
    private val k = gcd( Math.abs(a) , b )

    val numer = a/k

    val deno = b/k
    def this( x : Int ) = this( x , 1 )
    def +( that : Rational ) :Rational = new Rational( this.numer * that.deno + that.numer * this.deno  , this.deno * that.deno )
    def neg : Rational = new Rational( -this.numer , this.deno )
    def -( that : Rational ) : Rational = this + that.neg
    def *( that : Rational ) : Rational = new Rational( this.numer * that.numer , this.deno * that.deno )
    def /( that : Rational ) : Rational = new Rational( this.numer * that.deno , this.deno * that.numer )
    @Override
    override def toString() : String = {
        deno match {
            case p if p==1 => numer.toString
            case _ => numer + "/" + deno
        }
    }
}
