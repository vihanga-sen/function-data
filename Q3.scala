class Account ( x:String , y: Int , z : Double){

    val ID : String = x
    val ACNO : Int = y
    var balance : Double = z

    def with_draw( total : Double ) = this.balance -= total

    def deposit ( total : Double ) = this.balance += total

    def transfer( total : Double , that : Account ): Unit = {
        this.balance =  this.balance - total
        that.balance = that.balance + total
    }


    @Override
    override def toString() : String = "NIC : " + this.ID + "\n Account Number : " + this.ACNO + "\n Balance : " + this.balance

}
