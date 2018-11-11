package koma

object Koma {
  val empty = 0
  val emp = 0
  val nari = 1 << 3
  val self = 1 << 4
  val enemy = 1 << 5
  val wall = self + enemy
  //コマを表す
  val fu = 1
  val kyo = 2
  val kei = 3
  val gin = 4
  val kin = 5
  val kaku = 6
  val hisya = 7
  val ou = 8
  val to = fu + nari
  val n_kyo = kyo + nari
  val n_kei = kei + nari
  val n_gin = gin + nari
  val uma = kaku + nari
  val ryu = hisya + nari
  //味方の駒
  val s_fu = self + fu
  val s_to = self + to
  val s_kyo = self + kyo
  val sn_kyo = self + n_kyo
  val s_kei = self + kei
  val sn_kei = self + n_kei
  val s_gin = self + gin
  val sn_gin = self + n_gin
  val s_kin = self + kin
  val s_kaku = self + kaku
  val s_uma = self + uma
  val s_hisya = self + hisya
  val s_ryu = self + ryu
  val s_ou = self + ou
  //敵の駒
  val e_fu = enemy + fu
  val e_to = enemy + to
  val e_kyo = enemy + kyo
  val en_kyo = enemy + n_kyo
  val e_kei = enemy + kei
  val en_kei = enemy + n_kei
  val e_gin = enemy + gin
  val en_gin = enemy + n_gin
  val e_kin = enemy + kin
  val e_kaku = enemy + kaku
  val e_uma = enemy + uma
  val e_hisya = enemy + hisya
  val e_ryu = enemy + ryu
  val e_ou = enemy + ou
}
