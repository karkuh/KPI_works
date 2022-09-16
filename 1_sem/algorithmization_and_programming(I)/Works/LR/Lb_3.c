#include <stdio.h>
#include <math.h>
#define PI_4     0.785398163397448309616

float dfactorial(float danswer);
int zavd1();
int zavd2();

int main(void) {

printf("\t\t\tЗавдання 1\n");
printf("%d", zavd1());
printf("\n\t\t\tЗавдання 2\n");
printf("%d", zavd2());

   }


int zavd1(){

  float a,b,x,krok  ; 
  float y ;
  printf("Введіть значення для обрахунку функції\n");
  printf("a = ");
  scanf("%f", &a);
    printf("b = ");
  scanf("%f", &b);
  printf("Введіть початкову границю інтервала\n");
    printf("x = ");
  scanf("%f", &x);
  printf("Введіть крок\n");
  printf("krok = ");

  scanf("%f", &krok);

  float n ;

 printf("Введіть кількість значень на інтервалі \nn = ");
  scanf("%f", &n);
  float k = x + n * krok;

  printf("Крок : %.4f, початкова границя інтервала : %.4f, кінцева границя інтервала: %.4f\n",krok , x, k);
  while(x <  k ){
    
    y=2. / 7 * b * powf( x, 1. / 3) + exp(fabs(x)) + log(a * b  * x );
    x += krok;
    printf("f(x) = %.4f \n", y);
  }
  printf("Кінець обрахунків\n");
return (0);
}
int zavd2(){
  double eps , s = 0 , x  , y;
   int n = 1;
   printf("\n Введіть значення eps: ");  
  scanf("%lf", &eps);
  printf("\n Введіть значення x :");  
  scanf("%lf", &x);
  printf("\n");
 

y =  pow(-1 , n + 1) * pow( PI_4  , (2 * n)  - 2 ) * pow(x , 2 * n - 1 ) / (dfactorial((3*n)-2)) ;

  for( int n =1;y > eps ;n++){
   y =  pow(-1 , n + 1) * pow( PI_4  , (2 * n)  - 2 ) * pow(x , 2 * n - 1 ) / (dfactorial((3*n)-2)) ;
    s+= y ;
    printf("y = %lf\n", y );
     printf("Сума  при n = %d : %lf\n\n",n,s);
  }
printf("Кінець обрахунків\n");
return 0;
}

float dfactorial(float danswer)
{
if(danswer <= 1.0)
return(1.0);
else
return(danswer * dfactorial(danswer - 1.0));

}
