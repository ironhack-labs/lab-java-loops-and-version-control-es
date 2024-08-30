public class Task2 {
  //Tarea 2: Escribe un método Java que encuentra los elementos más pequeños y segundos más pequeños de un array dado y los imprime en la consola.

  public Task2() {
    foundLowerAndSecondLower();
  }

  int[] numbers = {4, 3, 5, 6, 8, 19, 2, 7};
  private int min = 0;
  private int firstIndex = numbers[0];
  private int secondMin = 0;
  private void foundLowerAndSecondLower(){
    //Getting first min
    for (int number : numbers){
      if (firstIndex > number){
        min = number;
        System.out.println("min = " + min);
      }
    }
    for (int number : numbers){
      if ( firstIndex > number && number > min ){
        secondMin = number;
        System.out.println("Second for loop: " + secondMin);
      }
    }
    System.out.println("secondMin = " + secondMin);

  }
}
