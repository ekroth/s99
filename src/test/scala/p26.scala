import org.scalatest._

class t26 extends FlatSpec with Matchers {
  import p26._
  it should "work" in {
    val xs = combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    xs.length shouldEqual 20
    List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e)) forall {
      xs contains _
    } shouldEqual true
  }
}
