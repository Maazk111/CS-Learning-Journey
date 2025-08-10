#include<stdio.h>
int main()
{                         
	int i,j,n;
	printf("Enter the rows: ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{  
	   
	   for(j=1;j<=i;j++)       
	{    
	   	printf(" ");
	   	
	   	
	}
	  for(j=1;j<=n;j++)       
	{    
	   	printf("*");
	   	
	}
	   printf("\n");	
	}
	
	printf("\n");
	printf("\n");
	
	i=1,j=1,n=5;
	
	for(i=1;i<=n;i++)
	{  
	   
	   for(j=1;j<=n-i ;j++)       
	{    
	   	printf(" ");
	   	
	   	
	}
	  for(j=1;j<=n;j++)       
	{    
	   	printf("*");
	   	
	}
	   printf("\n");	
	}
}
