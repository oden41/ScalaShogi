package kyokumen

import koma.Koma

class Kyokumen {
  private val banpadding = new Array[Short](16)
  //16進数において，７七は0x77とする（7*16+七）
  private val ban = new Array[Short](16 * (9 + 2))
  //駒の数 hand[SFU]=1なら先手の歩が1枚
  private val hand = new Array[Short](Koma.e_hisya+1)

  //駒の効きを管理する
  private val controlS = new Array[Short](16*11)
  private val controlE = new Array[Short](16*11)

}
