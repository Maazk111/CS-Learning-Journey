#include<stdio.h>
int main()                             //Write a program in C to read 10 numbers from keyboard and find their sum and average.
{
	
	int i,sum=0,n;
	float average=0;
	
	printf("The first 10 natural number is :\n");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
	    sum = sum + i;
	    average = (float)sum/n;
        printf("%d ",i); 
	}
	
	printf("\nThe Sum is :%d ",sum);
	printf("\nThe average is :%f ",average);
	
	return 0;
	
}
