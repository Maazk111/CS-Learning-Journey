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
		printf("%d",i);
	}
	printf("\n");
	for(i=1;i<=n;i++)
	{
		a=1;
		for(j=1;j<=nst;j++)   //NUMBERS a= 1 to 4
	{
		printf("%d",a);
	  a++;
	}
	for(k=1;k<=nsp;k++)
	{
		printf(" ");
		a++;                     // Spaces a=5
	}
		for(j=1;j<=nst;j++)
	{
		printf("%d",a);      // a =5 to s9 
		a++;
	}
	nst--;
	nsp+=2;
		printf("\n");
	}
	
	return 0;
	}
