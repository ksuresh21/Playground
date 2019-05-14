#include<stdio.h>
void prime(int n)
{
  int fact,i,j;
  for(i=1; i<=n; i++)
    {
        fact=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
            printf("%d\n" ,i);
    }
}

int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  prime(n);
    return 0;
}