package com.qbrainx

import org.scalatest.funspec.AnyFunSpec


class Calc extends AnyFunSpec {



  val calc = new Calculator()

  describe("mul") {
    it("It should be give by Zero ") {
      assert(calc.mul(22, 0) == 0)
    }
  }
  describe("div") {
    it("It should not be divide by Zero") {
      assert(calc.div(12, 2) == 6)
    }
  }
  describe("add") {
    it("It should be ") {
      assert(calc.add(2, 3) == 5)
    }
  }
  describe("sub") {
    it("It should be ") {
      assert(calc.sub(2, 3) == -1)
    }
  }

}