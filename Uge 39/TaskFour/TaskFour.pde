//import java.util.Random;
//Task 4.B
int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

void setup(){
  taskA(6);
  randomElement();
}


//Task 4.A
void taskA(int isDivisible){
  for(int i=0; i<100 + 1; i++){
    if(i % isDivisible == 0){
    println(i);
    }
}
}
//Task 4.c
void randomElement(){
  int rand = (int)random(arr.length);
  println("random element " + arr[rand]);
}
