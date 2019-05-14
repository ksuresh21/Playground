#include<stdio.h>
int square(int n)
{
  return n*n;
}
int main() {
   // Type your code here
  int n,s;
  scanf("%d",&n);
  s=square(n);
  printf("%d",s);
   return 0;
}