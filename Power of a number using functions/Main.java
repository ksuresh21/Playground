#include<stdio.h>
void power(int b,int e)
{
  int i,b1;
  b1=b;
  for(i=e-1;i>0;i--)
    b1=b1*b;
  printf("%d",b1);
}
int main(){
    // Type your code here
  int a,b;
  scanf("%d %d",&a,&b);
  power(a,b);
  	return 0;
}