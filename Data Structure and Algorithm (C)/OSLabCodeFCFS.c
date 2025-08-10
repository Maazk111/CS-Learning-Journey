#include <stdio.h>
#include <stdlib.h>

// Process structure
struct Process { 
    char name[10]; // Changed to array to hold string
    int arrival_time, burst_time, waiting_time, turnaround_time; 
} *processes; 

// FCFS function to calculate waiting time and turn around time
void FCFS(int n) { 
    // First process will always have 0 waiting time in FCFS
    processes[0].waiting_time = 0; 
    
    // Calculate waiting time for each subsequent process
    for (int i = 1; i < n; i++) { 
        processes[i].waiting_time = processes[i-1].burst_time + processes[i-1].waiting_time; 
    } 

    // Calculate turnaround time for each process
    for (int i = 0; i < n; i++) { 
        processes[i].turnaround_time = processes[i].burst_time + processes[i].waiting_time; 
    } 

    int total_waiting_time = 0, total_turnaround_time = 0; 
    // Print and calculate total waiting and turnaround times
    for (int i = 0; i < n; i++) { 
        total_waiting_time += processes[i].waiting_time; 
        total_turnaround_time += processes[i].turnaround_time; 
        printf("Process %s - Waiting Time: %d - Turnaround Time: %d\n", 
               processes[i].name, processes[i].waiting_time, processes[i].turnaround_time); 
    } 

    // Calculate and print average waiting and turnaround times
    int avg_waiting_time = total_waiting_time / n; 
    int avg_turnaround_time = total_turnaround_time / n; 
    printf("Average Waiting Time: %d\n", avg_waiting_time); 
    printf("Average Turnaround Time: %d\n", avg_turnaround_time); 
}

// Function to add a new process
void add_process(int *n) {
    (*n)++;
    processes = (struct Process*) realloc(processes, (*n) * sizeof(struct Process)); 
    if (processes == NULL) {
        perror("Error reallocating memory");
        exit(EXIT_FAILURE);
    }
    printf("Enter details for the additional process\n"); 
    printf("Enter name: "); 
    scanf("%s", processes[*n - 1].name); 
    printf("Enter arrival time: "); 
    scanf("%d", &processes[*n - 1].arrival_time); 
    printf("Enter burst time: "); 
    scanf("%d", &processes[*n - 1].burst_time); 
}

// Main function to create processes dynamically and take input
int main() { 
    int n; 
    printf("Enter number of processes: "); 
    if (scanf("%d", &n) != 1 || n <= 0) {
        printf("Invalid number of processes.\n");
        return 1;
    }

    // Dynamically allocate memory for processes
    processes = (struct Process*) malloc(n * sizeof(struct Process)); 
    if (processes == NULL) {
        perror("Error allocating memory");
        return 1;
    }

    for (int i = 0; i < n; i++) { 
        printf("Enter details for process %d\n", i + 1); 
        printf("Enter name: "); 
        scanf("%s", processes[i].name); 
        printf("Enter arrival time: "); 
        scanf("%d", &processes[i].arrival_time); 
        printf("Enter burst time: "); 
        scanf("%d", &processes[i].burst_time); 
    } 

    FCFS(n); 

    add_process(&n); 

    FCFS(n); 

    // Free allocated memory
    free(processes); 
    return 0; 
}
