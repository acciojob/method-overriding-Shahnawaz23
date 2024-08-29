package com.driver;

public class Main {

    public  static  class A {
        public String meth() {
            return "Invoking Method from class A";
        }
    }

    public static class B extends A {

        @Override
        public String meth() {
            return "Method is overridden in extended class B";
        }
    }
  public static void main(String[] args) {

        B obj1 = new B();
        obj1.meth();

        B obj2 = new B();
        obj2.meth();

  }
}

