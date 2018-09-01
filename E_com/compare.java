public class SampleBigDecimal {

  public static void main(String[] args) {

    BigDecimal obj1 = new BigDecimal("1");
    BigDecimal obj2 = new BigDecimal("3");

    //compareTo(BigDecimal val)
    //オブジェクトを引数のものと比較し、
    //大きければ「1」
    //同じならば「0」
    //小さければ「-1」
    //を返す。
    if (obj1.compareTo(obj2) > 0) {
      System.out.println("大きい");
    } else if (obj1.compareTo(obj2) < 0) {
      System.out.println("小さい");
    } else {
      System.out.println("同じ");
    }
  }
}


    
