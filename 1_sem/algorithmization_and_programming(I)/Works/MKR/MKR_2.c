#include<stdio.h>

void plus(float a[2][2]);
float determinant(float [2][2]);
void transpose(float [2][2]);
void algebr(float c[2][2]);
void obr(float d[2][2],float det);
void info ( float a [2][2]);
void multiply(float a[2][2], float d[2][2]);
 
int main()
{
 
char array[26] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
int n[26] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
 
printf("Закодованне повідомлення\n");
char word[4] = { 'w','j','h','i'};
printf("%s\n",word);
int res[4];
 
int z = 0;
for(int i = 0 ; i < 26 ; i++){
if(word[z] == array[i]){
    res[z]=i;
    z++;
    i = -1 ;
  }
}
for(int j = 0 ; j < 4 ; j++){
printf("%d ",res[j]);
}
 
float d ;
float a[2][2]= {{2,3},
                {3,5}};
 
printf("\n\nПочаткова матриця\n");
    for(int i = 0; i < 2; i++)
    {
        for(int j = 0; j < 2; j++)
        {
            printf("%.2f ", a[i][j]); 
        }
        printf("\n"); 
    }
 
  d = determinant(a) ;
 
  if (d == 0){
    
   printf("\nОбернена матриця неможлива\n");
   printf("Детермінант = %.2f\n",d);
  }
  else{
   info(a);
  }
 
printf("\nРозшифрене повідомлення\n");
 
int ppp[4];
int k = 0 ;
int sum = 0 ;
int g = 0 ;
for(int i = 0 ; i < 2 ; i++){
for(int j = 0 ; j < 2 ; j++){
  sum+=res[k]*a[i][j];
k++;
}
ppp[g]=sum%26;
g++;
k=0;
sum=0;
}
 
k = 2 ;
g = 2 ;
for(int i = 0 ; i < 2 ; i++){
for(int j = 0 ; j < 2 ; j++){
sum+=res[k]*a[i][j];
k++;
}
ppp[g]=sum%26;
g++;
k=2;
sum=0;
}
 
for(int j = 0 ; j < 4 ; j++){
printf("%d ",ppp[j]);
}
z = 0;
for(int i = 0 ; i < 26 ; i++){
if(ppp[z] == n[i]){
   word[z]=array[i];
    z++;
    i = -1 ;
  }
}
 
printf("\n");
for(int j = 0 ; j < 4 ; j++){
printf("%c",word[j]);
  }
 
}
 
void plus(float a[2][2]){
int f = 1;
printf("\nПеретворена обернена матриця\n");
for(int i = 0 ; i < 2 ; i ++){
  for(int j = 0 ; j < 2 ; j ++){
 
if(a[i][j] != (int)(a[i][j])) { 
  for(int t = 2 ; t < 100 ; t++){
    if(a[i][j]*t ==(int)(a[i][j]*t)){
 
      f = t ;
      break;
    }
  }
}
 
   if( a[i][j] != (int)a[i][j]){
 
while(a[i][j] !=  (int)a[i][j]){
        a[i][j] +=  (26./f);
          }
 
      }else if(a[i][j] < 0){
 
        while(a[i][j]<0)
        a[i][j] += 26;
      }
      a[i][j]= ((int)a[i][j])%26;
      printf("%.2f ", a[i][j]);
      }
      printf("\n");
  }
  
}
 
void info ( float a [2][2]){
float start[2][2];
for(int i = 0 ; i < 2 ; i ++){
  for(int j = 0 ; j < 2 ; j ++){
 
    start[i][j] = a[i][j];
  }
}
 
float  d = determinant(a) ;
  printf("\nДетермінант = %.2f\n",d);
algebr(a);
transpose(a);
obr(a,d);
plus(a);
printf("\n");
multiply(start,a);
 
}
 
void multiply(float a[2][2], float d[2][2])
{
  printf("Перевірка матриці(множення початкової на перетворену обернену)\n");
  float res[2][2];
    int i, j, k;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            res[i][j] = 0;
            for (k = 0; k < 2; k++){
                res[i][j] += a[i][k] * d[k][j];
            }
             printf("%d ",((int)res[i][j])%26);
        }
        
        printf("\n");
    }
}
 
float determinant(float a[2][2])
{
  float  det = (a[0][0]*a[1][1])-(a[0][1]*a[1][0]) ;
    return (det);
}
 
void algebr(float c[2][2]){
float A00,A01,A10,A11;
A00 = c[1][1];
A01 = - 1 * c[1][0];
A10=-1 * c[0][1];
A11 = c[0][0];
 
c[0][0] = A00;
c[0][1] = A01;
c[1][0] = A10;
c[1][1] = A11;
 
}
 
void obr(float d[2][2],float det){
 
   for(int i = 0 ; i < 2 ; i++){
      for(int j = 0 ; j < 2 ; j++){
      d[i][j]=  d[i][j] / det;
 
        }
      }
      for(int i = 0 ; i < 2 ; i++){
      for(int j = 0 ; j < 2 ; j++){
 
  printf("%.2f ", d[i][j]);
}
printf("\n");
      }
}
 
void transpose(float b [2] [2])
{
float temp = b[0][1];
b[0][1] =b[1][0];
b[1][0]=temp ;
 
 
}
