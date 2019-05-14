#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int s,n,d;
    scanf("%d",&n);
  d= (int)log10(n);
  while(d!=1)
  {
    n=n/10;
    d--;
  }
 s=n%10;
  printf("%d",s);
	return 0;
}