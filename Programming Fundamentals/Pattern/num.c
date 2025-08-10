#include <stdio.h>
int main()
{
	int i,j,k,g=1;   //Display the pattern like right angle triangle with number increased by 1
	
	printf("Enter the rows: ");
	scanf("%d",&k);
	
	for(i=1; i<=k;i++)
	{            
		
		
		for(j=1;j<=i;j++)
		{
			printf("%d ",g++);
		}
			
			printf("\n");
			
			
	}	
}
