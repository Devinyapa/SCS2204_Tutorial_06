object main extends App{

  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encrypt=(letter:Char,key:Int,alp:String)=> alp((alp.indexOf(letter.toUpper)+key)%alp.size)

  val Decrypt=(letter:Char,key:Int,alp:String)=> alp((alp.indexOf(letter.toUpper)-key)%alp.size)


  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))

  val enc=cipher(Encrypt,"Devin",3,alphabet)

  val dec=cipher(Decrypt,enc,3,alphabet)

  println(enc)
  println(dec)

}
