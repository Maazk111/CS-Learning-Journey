#include<stdio.h>
int main()
{                         
	int i,j,n;
	printf("Enter the rows: ");
	scanf("%d",&n);
	char a=1;
	
	for(i=1;i<=n;i++)
	{  
	   
	   for(j=1;j<=n-i;j++)       
	{    
	   	printf(" ");
	}
	a=1;
	  for(j=1;j<=i;j++)       
	{    
	   	printf("%c",a+64);
	   	a++;
	}
     a=1;
	for(j=2;j<=i;j++)       
	{    
	   	printf("%c",i-a+64);
	   	a++;
	}
	   printf("\n");	
	}
	
}
