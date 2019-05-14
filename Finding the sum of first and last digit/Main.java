#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,l,f,digit,sum,count=0;
    scanf("%d",&n);
  l=n%10;
  digit=(int)log10(n);
  f=n/pow(10,digit);
  sum=l+f;
  printf("%d",sum);
	return 0;
}