package te

class Te(f: Short, t: Short, k: Short, cap: Short, pro: Short = 0, _kind: Short = 0, v: Short = 0) {
  private val from = f
  private val to = t
  private val koma = k
  private val capture = cap
  private val promoted = pro
  private val kind = _kind
  private val value = v

  def this() {
    this(0, 0, 0, 0)
  }

  def printTe() = {
    println(s"from:${from}, to:${to}, koma:${koma}, capture:${capture}")
  }

  def canEquals(a: Any) = a.isInstanceOf[Te]

  override def equals(obj: scala.Any): Boolean =
    obj match {
      case obj: Te => canEquals(obj) && from == obj.from && to == obj.to && koma == obj.koma && promoted == obj.promoted
      case _ => false
    }

  override def hashCode(): Int = {
    val prime = 31
    var result = 1
    result = prime * result + from
    result = prime * result + to
    result = prime * result + koma
    result = prime * result + capture
    result = prime * result + promoted
    result = prime * result + kind
    result = prime * result + value
    result
  }
}
