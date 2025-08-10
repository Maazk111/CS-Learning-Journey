#include<stdio.h>
int main()
{                         
	int i,j,n,a=1,k;
	printf("Enter the rows: ");
	scanf("%d",&n);
	
	int nst=n;
	int nsp=1;
	for(i=1;i<=2*n+1;i++)\
	{
		printf("*");
	}
	printf("\n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=nst;j++) //STARS
	{
		printf("*");
	}
	for(k=1;k<=nsp;k++)    //Spaces
	{
		printf(" ");
	}
		for(j=1;j<=nst;j++)
	{
		printf("*");
	}
	nst--;
	nsp+=2;
	
	
		printf("\n");
	}
	
	return 0;
	}
