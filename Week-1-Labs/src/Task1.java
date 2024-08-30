public class Task1 {
  //Tarea 1: Escribe un método Java que devuelva la diferencia entre los valores más grande y más pequeño en un array de enteros. La longitud del array debe ser al menos 1.

  public Task1() {
    System.out.println("Task 1:");
    getDifferenceBtwMaxMin();
  }

  private int[] numbers = {4, 3, 5, 6, 8, 19, 2, 7};

  private void getDifferenceBtwMaxMin() {
    int max = 0;
    int min = 0;
    for (int number : numbers) {
      if (number > max) {
        max = number;
      }
      if (number < min) {
        min = number;
      }
    }
    System.out.println("Difference between max and min value is: " + (max - min));
  }
}
