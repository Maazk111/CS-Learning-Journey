#include<stdio.h>
int main()
{                              
//                        1
//						A B
//						1 2 3
//						A B C D
//						1 2 3 4 5
	int i,j,n;
	printf("Enter the Lines: ");
	scanf("%d",&n);
	
	
	for(i=1;i<=n;i++)
	{  
	   char a=1;
	   
	   for(j=1;j<=i;j++)          //for tri use j<=i
	{
		if(i%2==1)
       {
       	printf("%d ",j);
	   }
	   else
	   {
	   	
	   	printf("%c ",a+64);	
	    a++;
	   }
	   
	}
	
	   printf("\n");	
	}
	
	
}
