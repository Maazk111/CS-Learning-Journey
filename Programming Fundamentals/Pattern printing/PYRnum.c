#include <stdio.h>
int main()
{
    int i, j, rows;                                        //  Write a program in C to make such a pattern like a pyramid with an NUMBERS

    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for(i=1; i<=rows; i++)
    {
        for(j=1; j<=rows-i; j++)
        {
            printf(" ");
        }
        for(j=1; j<=i*2-1; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }

    return 0;
    

}
     
