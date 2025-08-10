#include<stdio.h>
int main()
{                         
	int i,j,n,m;
	printf("Enter the rows: ");
	scanf("%d",&n);
	
//	printf("Enter the Cols: ");
//	scanf("%d",&m);
	
	for(i=1;i<=n;i++)
	{  
	   
	   
	   for(j=1;j<=n;j++)       
	{
		
	   if(i==j||i+j==n+1)   //LOGIC     
	   {
	   	printf("*");
	   }
	   else
	   {
	   	printf(" ");
	   }
	   
	}
	
	   printf("\n");	
	}
	
	
}
