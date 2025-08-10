#include<stdio.h>
int main()
{                         
	int i,j,n,m;
	printf("Enter the rows: ");
	scanf("%d",&n);
	
	printf("Enter the Cols: ");
	scanf("%d",&m);
	
	for(i=1;i<=n;i++)
	{  
	   
	   
	   for(j=1;j<=m;j++)       
	{
		
	   if(i==1||j==1||j==m || i==m|| j==m||i==n)   //LOGIC     
	   {
	   	printf("0");
	   }
	   else
	   {
	   	printf(" ");
	   }
	   
	}
	
	   printf("\n");	
	}
	
	
}
