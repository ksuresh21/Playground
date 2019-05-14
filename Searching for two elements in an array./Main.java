#include<stdio.h>
int main()
{
  //Type your code here
    int n,a[20],n1,n2,f1=-1,f2=-1;
  scanf("%d\n",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d\n%d",&n1,&n2);
  for(int i=0;i<n;i++)
  {
    if(n1==a[i])
      f1=i;
    if(n2==a[i])
      f2=i;
  }
  if(f1>0)
    printf("%d\n",f1);
  else
    printf("-1");
  if(f2>0)
    printf("%d\n",f2);
   else
     printf("-1");
  return 0;
}