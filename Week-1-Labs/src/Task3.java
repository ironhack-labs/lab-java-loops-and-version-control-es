public class Task3 {
  private int x = 2;
  private int y = 5;

  private float result;

  public Task3() {
    doingMath();
  }

  private float getSquare(float number) {
    return number * number;
  }

  private void doingMath() {
    result = getSquare(x) + getSquare(((4F*y)/5F-x));
    System.out.println("result = " + result);
  }

}
