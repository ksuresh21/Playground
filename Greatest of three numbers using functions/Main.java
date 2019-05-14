#include <stdio.h>
int gt(int n1,int n2,int n3)
{
  int big;
  if(n1>n2)
    big=n1;
  else 
    big=n2;
  if(big<n3)
    big=n3;
  else
    return big;
}
    
int main(){
    // Type your code here
  int n1,a,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  a=gt(n1,n2,n3);
  printf("%d",a);
    return 0;
}