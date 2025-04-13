class Test(iname: String ) {
  val name: String = iname
  val sayHello: String = {
    s"Hello, ${name}"
  }
}
object Test {
  def main(args: Array[String]): Unit = {
    println("hello")

    val set1 = scala.collection.mutable.Set[String]("A","B","C","D")
    val set2 = scala.collection.mutable.Set[String]("A","B","E","F")
    ( set1 &~ set2 ) .foreach(println) //differ, C D

    val map1 = scala.collection.mutable.Map[Int,String]((1,"a1"),(2,"b1"),(3,"c1"));
    val map2 = scala.collection.mutable.Map[Int,String]((2,"b2"),(3,"c2"),(4,"d2"));
    // map2 merge to map1
    map1.++(map2).values.foreach(println)
    // class
    val test = new Test("Jim");
    println(test.sayHello)
  }
}
