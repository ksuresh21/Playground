#include <stdio.h>
int main() {
	//Type your code
  int  n,sum=0,temp,d;
    scanf("%d",&n);
  temp=n;
  while(n>0)
  {
      d=n%10;
    sum+=d;
    n=n/10;
  }
  printf("%d",sum);
  return 0;
}