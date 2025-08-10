#include <stdio.h>
int main()
{                              						   
    int i, j, rows,g=1;
     
    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for(i=1; i<=rows; i++)
    {
        for(j=1; j<=rows-i; j++)
        {
            printf("*");
        }
        for(j=1; j<=i*2-1; j++)
        {
        	if(i==4 && j==1  )
			{
        	   	  printf("+");
			}
			else{
				  printf("0");
			}
          
        
		}
		for(j=1;j<=rows-i;j++)
		{
			printf("*");
		}
        printf("\n");
    }

    return 0;
    

}
