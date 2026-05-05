object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(73, 89, 23, 17, 10)
    assert(Policy.score(signalcase_1) == 77)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(62, 82, 26, 10, 4)
    assert(Policy.score(signalcase_2) == 70)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(91, 89, 12, 16, 12)
    assert(Policy.score(signalcase_3) == 159)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
