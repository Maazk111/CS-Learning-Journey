#include<stdio.h>
int main()
{                               //A B C D E
								//A B C D E
								//A B C D E
								//A B C D E
								//A B C D E
	int i,j,n;
	printf("Enter the Lines: ");
	scanf("%d",&n);
	
	
	for(i=1;i<=n;i++)
	{  
	   char a=1;
	   
	   for(j=1;j<=n;j++)          //for tri use j<=i
	{
		
	   printf("%c ",a+64);	
	   
	   a++;
	}
	
	   printf("\n");	
	}
	
	
}
