#include <stdio.h>

int main(void) {

  char myString[100]; 
 
    printf( "Введіть рядок: " );
 
    fgets( myString, 100, stdin ); 
    

    printf( "\nВи ввели рядок : %s", myString );

int size = 0 ;
for (int i = 0; myString [i] != '\0'; i++){
  size=i;
}
if(size%2==0){
int k= size ;
      char temp ;

    for(int i = 0 ; i < size/2 ; i++ ){

       temp = myString[i];
      myString[i] = myString[k];
      myString[k] = temp;
      k--;
    }
}else{
  int z= size-1 ;
      char temp ;

    for(int i = 0 ; i < (size-1)/2 ; i++ ){

       temp = myString[i];
      myString[i] = myString[z];
      myString[z] = temp;
      z--;
    }
}
printf( "\nВідсортований рядок за умовою : %s", myString );
  return 0;
}
