#include<stdio.h>
int main()
{
 int i,j,a[9999],n,t;
 scanf("%d",&n);
 for(i=1;i<n;i++)
  {
   scanf("%d",&a[i]);
  }
 for(i=1;i<n;i++)
  {
   for(j=1;j<i;j++)
    {
      if(a[j]>a[j+1])
       {
         t=a[j];
         a[j]=a[j+1];
         a[j+1]=t;
        }
    }
  }
   for(i=2;i<n;i++)
    {
     if(a[i-1]!=a[i]-1)
       {
          printf("%d",a[i]-1);
          break;
       }
  }
 return 0;
}