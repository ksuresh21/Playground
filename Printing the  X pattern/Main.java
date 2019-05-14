#include <stdio.h>

int main()
{
    int i, j, N;
    scanf("%d", &N);
  int size=N;
    for(i=0; i<N; i++)
    {
       for(j=0; j<N; j++)
        {
            if(i==j || j==(size-i-1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
       }
     printf("\n");
    }

    return 0;
}