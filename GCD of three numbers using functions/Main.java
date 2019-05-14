#include <stdio.h>
void gcd(int n1,int n2,int n3)
{
    int i,r, gcd;
  for(i=1; i <= n1 && i <= n2; ++i)
    {
        // Checks if i is factor of both integers
        if(n1%i==0 && n2%i==0)
            gcd = i;
    }
  r=gcd;
    for(i=1; i <= r && i <= n3; ++i)
    {
        // Checks if i is factor of both integers
        if(n1%i==0 && n2%i==0)
            gcd = i;
    }

    printf("%d",gcd);
}
int main(){
    // Type your code here
  int n1,a,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  gcd(n1,n2,n3);
 // printf("%d",a);
    return 0;
}