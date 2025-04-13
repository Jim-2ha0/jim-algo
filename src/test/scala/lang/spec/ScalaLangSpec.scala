package lang.spec

import org.scalatest.funsuite.AnyFunSuite

class ScalaLangSpec extends AnyFunSuite {

  test("加法测试：1 + 1 应该等于 2") {
    assert(1 + 1 === 2)
    assertResult(2)(1 + 1)
  }

  test ("字符串长度测试") {
    val str = "hello"
    assert(str.length === 5)
    assertResult(5)(str.length)
  }
}