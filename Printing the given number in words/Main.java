#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  if(n>=1 && n<=5)
  {
    if(n==1)
      printf("one");
    if(n==2)
      printf("Two");
    if(n==3)
      printf("Three");
    if(n==4)
      printf("Four");
    if(n==5)
      printf("Five");
  }
  else
    printf("Invalid");
  return 0;
}