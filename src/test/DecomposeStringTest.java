package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import random_problems.DecomposeString;

class DecomposeStringTest {
  private DecomposeString decomposeString;

  @BeforeEach
  void setUp() {
    decomposeString = new DecomposeString();
  }

  @Test
  void setDecomposeString_test1(){
    Assertions.assertTrue(decomposeString.decomposeString("11100111"));
  }

  @Test
  void setDecomposeString_test2(){
    Assertions.assertFalse(decomposeString.decomposeString("111001111"));
  }

  @Test
  void setDecomposeString_test3(){
    Assertions.assertFalse(decomposeString.decomposeString("11"));
  }

  @Test
  void setDecomposeString_test4(){
    Assertions.assertFalse(decomposeString.decomposeString("101"));
  }
}