#include<stdio.h>
int main()
{                         
											//  *
											//  *
											//*****
											//  *
											//  *
	int i,j,n;
	printf("Enter the Lines: ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{  
	   
	   
	   for(j=1;j<=n;j++)       
	{
		
	   if(i==n/2+1||j==n/2+1)     //LOGIC
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
