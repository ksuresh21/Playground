#include<stdio.h>
int sum_of_n(int n)
{
  return (n*(n+1))/2;
}
int main() {
    // Type your code here
  int n,s;
   scanf("%d",&n);
 s = sum_of_n(n);
  printf("%d",s);
  	return 0;
}