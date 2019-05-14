#include<stdio.h>
int main()
{
  //Type your code here
   int a[20],n,i,j=0,k=0,b[20],c[20];
  scanf("%d",&n);
    for(i=0;i<n;i++)
     scanf("%d\n",&a[i]);
    for(i=0;i<n;i++)
    {
  if(a[i]!=0)
    b[j++]=a[i];
  else
    c[k++]=a[i];
    }
for(i=0;i<j;i++)
  {
    printf("%d ",b[i]);
  }
  for(i=0;i<k;i++)
  {
    printf("%d ",c[i]);
  }
  return 0;
}