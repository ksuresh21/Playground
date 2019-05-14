#include<stdio.h>
int main()
{
	int n,a=0;
    scanf("%d",&n);
	int num = 0;
	for(int cur_row =1; cur_row <= n; cur_row++) 
       {
		 for(int cur_col=1; cur_col <= cur_row ; cur_col++)
             {
             a++;
               if(a%2==1)
             printf("*");
           else
             printf("#");
			 }
    	  printf("\n");
	   }
	return 0;
}