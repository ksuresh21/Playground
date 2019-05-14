#include <stdio.h>
int main() {
	//Type your code
  int n,f=1,i;
  scanf("%d",&n);
  for(i=n;i>0;i--)
  { 
    f=i*f;
  }
  printf("%d",f);
  
	return 0;
}