/* rand example: guess the number */
#include <stdio.h>      /* printf, scanf, puts, NULL */
#include <stdlib.h>     /* srand, rand */
#include <time.h>       /* time */
#include<math.h>
int main ()
{
  int iSecret, iGuess,x=1;

  /* initialize random seed: */
  srand (time(NULL));

  /* generate secret number between 1 and 10: */
 
  

  do {
  	x=1.23;
    printf("%d",fabs(x));
   // iSecret = rand() % 3 - 1; x++;
   // printf ("\t %d",iSecret);
  } while (x<2);

  puts ("Congratulations!");
  return 0;
}
