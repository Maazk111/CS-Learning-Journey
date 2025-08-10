#include<stdio.h>
int main()                             // Write a C program to find the sum of first 10 natural numbers.
{
	
	int i,sum=0;
	
	printf("The first 10 natural number is :\n");
	
	for(i=1;i<11;i++)
	{
	    sum = sum + i;
        printf("%d ",i); 
	}
	
	printf("\nThe Sum is :%d ",sum);
	
	return 0;
	
}
