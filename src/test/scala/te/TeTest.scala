package te

import org.scalatest.FunSuite

class TeTest extends FunSuite {

  test("testEquals") {
    val te1 = new Te(1, 2, 3, 4)
    val te2 = new Te(1, 2, 3, 4)
    val te3 = new Te(1, 2, 4, 4)

    assert(te1 == te2)
    assert(te1 != te3)
  }

}
