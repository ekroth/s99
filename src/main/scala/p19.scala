/*
 P19 (**) Rotate a list N places to the left.
 */

object p19 {
  def rotate[A](i: Int, xs: List[A]): List[A] = {
    val pos = if (i < 0) xs.length + i else i
    val (head, tail) = xs splitAt pos
    tail ++ head
  }
}
