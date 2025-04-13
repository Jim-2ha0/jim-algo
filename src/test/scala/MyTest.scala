import org.scalatest.funsuite.AnyFunSuite

class MyTest extends AnyFunSuite {
  test("加法测试：1 + 1 应该等于 2") {
    assert(1 + 1 === 2)
  }

  test("字符串长度测试") {
    val str = "hello"
    assert(str.length === 5)
  }
}