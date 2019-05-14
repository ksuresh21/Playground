#include<stdio.h>
int main()
{
  //fill the code
  int n,a[20],largest;
  scanf("%d\n",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  largest=a[0];
    for(int i=0;i<n;i++)
    {
      if( largest < a[i] )
        largest = a[i];
    }
  printf("%d",largest);
  return 0;
}