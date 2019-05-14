#include<stdio.h>
int main()
{
//Try out your code here
  int n,a=0;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int s=1;s<=n-r;s++)
    {
      printf(" ");
    }
    for(int c=1;c<=r;c++)
    {
      //printf(" *");
      a++;
     printf("%d ",a);
    }
   // a++;
    printf("\n");
  } 
return 0;
}
