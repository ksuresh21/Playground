#include<stdio.h>
int main()
{
//Try out your code here
  int n;
  scanf("%d",&n);
 int num=n;
  for(int r=1;r<=n;r++)
  {
    for(int c=num;c>0;c--)
    {
      printf("%d",c);
    }
    num--;
    printf("\n");
  } 
return 0;
}
