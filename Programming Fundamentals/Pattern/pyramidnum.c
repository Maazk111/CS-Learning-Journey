#include <stdio.h>
int main()
{
               
	/* Write a program in C to display the such a pattern for n 
	number of rows using a number which will start with the number 1 and the first 
	and a last number of each row will be 1.*/
                                						   
    int i, j, rows,g=1;
     
    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for(i=1; i<=rows; i++)
    {
        for(j=1; j<=rows-i; j++)
        {
            printf(" ");
        }
        for(j=1; j<=i; j++)
        {
            printf("%d",j);
        
		}
		for(j=i-1;j>=1;j--)
		{
			printf("%d",j);
		}
        printf("\n");
    }

    return 0;
    

}
