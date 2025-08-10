#include<stdio.h>
int main()
{
	int i,j,n;
	printf("Enter the Lines: ");
	scanf("%d",&n);
	
	
	for(i=1;i<=n;i++)
	{  
	   int a=1;
	   
	   for(j=1;j<=i;j++)
	{
		
	   printf("%d ",a);	
	   
	   a=a+2;
	}
	
	   printf("\n");	
	}
	
	
}
