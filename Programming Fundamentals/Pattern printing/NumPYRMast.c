#include<stdio.h>
int main()
{                         
	int i,j,n;
	printf("Enter the rows: ");
	scanf("%d",&n);
	 int a=1;
	
	for(i=1;i<=n;i++)
	{  
	   
	   for(j=1;j<=n-i;j++)       
	{    
	   	printf(" ");
	}
	  for(j=1;j<=i;j++)       
	{    
	   	printf("%d",j);
	}
     a = i-1;
	for(j=2;j<=i;j++)       
	{    
	     
	   	printf("%d",a);
	   	a--;
	}
	   printf("\n");	
	}
	
}
