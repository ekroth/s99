/* P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
 In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities. */

object p26 {
  def combinations[A](i: Int, xs: List[A]): List[List[A]] = {
    val perms = xs.permutations

    val groups = for { x <- perms 
      y <- x grouped 3
    } yield y sortBy { _.hashCode  }

    groups.toList.distinct
  }
}
