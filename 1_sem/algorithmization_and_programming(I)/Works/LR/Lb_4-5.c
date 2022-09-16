#include <stdio.h>
#include <stdlib.h>

float zavd1();
int  zavd2();

int main(void) {

printf("\t\t1 завдання \n\n");
zavd1();
printf("\n\t\t2 завдання \n\n");
zavd2();

}

float  zavd1(){//створимо метод для обчислення 1 завдання
int n = 10 ; 
float x [n] ;
//За допомогою сканера вводимо елементи масива
printf("Введіть значення масива \n");

for(int i = 0 ; i < n ; i++){
printf("%d елемент масива : ", i+1);
scanf("%f", &x[i]);
}

int size = 0 ;
float max = x [0];
for(int j = 0  ; j < n ; j++)
if(x[j]> max){
  max = x[j];
  size = j ;
//Знайдемо найбільший елемент масиву
}
printf("\nНайбільший елемент масиву  %.1f \n", max);

//Відсортуємо елементи за зростанням до найбільшого елементу
for ( int i = 0; i < size ; i++){
    for (int j = 0; j < size ; j++)
      if (x[j] > x[j + 1])
      {
        float temp = x[j];
         x[j] = x[j+1];
         x[j+1] = temp;
       }
 }
//Виведемо відсортовану матрицю
printf("\nВідсортований масив за умовою\n\n");
printf("[");
 for(int h = 0 ; h < n ; h ++){
   printf("%.1f  ",x[h]);
 }
printf("]\n");

return 0 ;
}

int  zavd2(){//створимо метод для обчислення 2 завдання

//Створимо матрицю 9х9
int  matrix[9][9] ;

//Заповнимо числами в діапазоні дів 0 до 99
printf("Початкова матриця :\n\n");
for(int i = 0 ; i < 9 ; i++){
  for(int j = 0 ; j < 9 ; j++){
    matrix[i][j] = rand()%99 ;
    printf("%.2d  ", matrix [i][j]);
  }
  printf("\n");
}


//Відобразимо матрицю відносно побічної діагоналі
printf("\n\nВідсортована матриця за варіантом :\n\n");
int AdditionalDiagonal[9][9];
int   N = 9 ;
for(int i = 0 ; i < 9 ; i++){
  for(int j = 0 ; j < 9 ; j++){
    AdditionalDiagonal[i][j] = matrix[N - 1 - j][N - 1 - i];
    printf("%.2d  ",AdditionalDiagonal [i][j]);
  }
    printf("\n");
}

return 0 ;
}
