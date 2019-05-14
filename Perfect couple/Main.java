#include<stdio.h>
int main()
{
  //Type your code here
     int a[20],n,i,j=0,k,p,b[20],c[20],flag=0;
  scanf("%d",&n);
    for(i=0;i<n;i++)
     scanf("%d\n",&a[i]);
  scanf("%d\n",&p);
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
    {
      k=a[i]+a[j];
      if(p==k){
        printf("Perfect couple: %d %d",a[i],a[j]);
        flag=1;
       return 0;
      }
      else
        continue;
    }
  if(flag==0)
    printf("No perfect couple found!");

  return 0;
}