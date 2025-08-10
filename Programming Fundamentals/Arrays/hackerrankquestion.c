#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() 
{
  int a, b;  
   scanf("%d\n%d", &a, &b);
   
  	// Complete the code.
    
	int i; 
	char* alp[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	
	if(a >= 10)
	{
		a=9; 
	}
	
	if(b >= 10)
	{
		b=9; 
	}
	
	printf("%s\n",alp[a]);
	
	printf("%s\n",alp[b]);
		
	
	if(a%2==0)
	{
		printf("even\n");
	}
	else
	{
		printf("odd\n");
	}
	if(b%2==0)
	{
		printf("even\n");
	}
	else
	{
		printf("odd");
	} 

    return 0;
	
	
}


