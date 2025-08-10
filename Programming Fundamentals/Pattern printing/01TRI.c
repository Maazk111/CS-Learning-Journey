#include<stdio.h>
int main()
{                         
	int i,j,n,a=1;
	printf("Enter the rows: ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{  
	   if(i%2!=0)              //Change if i == odd num assign a = 1 else a = 0
	   {
	   	a=1;
	   }
	   else
	   {
	   	a=0;
	   }
	   for(j=1;j<=i;j++)       
	{    
	   	printf("%d ",a);
	   	
	   	if(a==0)
	   	{                              // Swap 
	   		a=1;
		}
		else
		{
			a=0;
		}
	   	
	}
	
	   printf("\n");	
	}
	
	
}
