#include<stdio.h>
int main()                             // Write a program in C to display n terms of natural number and their sum
{
	
	int i,sum=0,n;
	
	printf("The first 10 natural number is :\n");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
	    sum = sum + i;
	    
        printf("%d ",i); 
	}
	
	printf("\nThe Sum is :%d ",sum);
	
	return 0;
	
}
