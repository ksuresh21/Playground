#include<stdio.h>
int main()
{
  int n;
  //Type your code here
  scanf("%d",&n);
  n=n%100;
  n=n/10;
  printf("%d",n);
  return 0;
}