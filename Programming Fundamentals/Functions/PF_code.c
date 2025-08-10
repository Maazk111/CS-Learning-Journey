#include <stdio.h>
int main()
{	
	int principle, years;
	float annualInterestPercentage;                   // paper question solved 15 marks
	
	printf("Enter Principle:");
	scanf("%d",&principle);
	
	if(principle >= 10000 && principle <= 1000000)
	{
		printf("Enter Annual Interest %:");
		scanf("%f",&annualInterestPercentage);
		if(annualInterestPercentage >= 2.45 && annualInterestPercentage <= 15.83)
		{
			printf("Enter Duration in years:");
			scanf("%d",&years);
			if(annualInterestPercentage >= 1 && annualInterestPercentage <= 20)
			{
			
				// All Values Set now just need to calculate
				int n = years * 12;
				int P = principle;
				float annualInterestRate = annualInterestPercentage/100;
				float r = annualInterestRate/12;
				
				float M = P * (r*pow(1+r,n)) / (pow(1+r,n)-1);
				
				printf("Your fixed monthly payment is: %.01f",M);
				
			}
			else
			{
			printf("invalid value please run again");	
			}
		}
		else
		{
		printf("invalid value please run again");
		}
	}
	else
	{
	printf("invalid value please run again");
	}
	
}
