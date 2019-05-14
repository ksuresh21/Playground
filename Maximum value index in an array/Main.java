// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int a[20],n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d\n",&a[i]);
  int max=a[0];
   for(i=0;i<n;i++)
   {
     if(a[i]>max)
       max=a[i];
   }
   for(i=0;i<n;i++)
     if(a[i]==max)
       printf("%d",i);
  
  
   return 0;
}