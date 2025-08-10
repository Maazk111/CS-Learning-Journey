Down(Semaphore S)
{
    S.value = S.value - 1; // Decrement the semaphore value by 1
    if (S.value < 0)
    {
        Put Process(PCB) in Suspended list; // If the semaphore value is negative, add the process to the suspended list
        Sleep();                            // Put the process to sleep
    }
    else
    {
        return; // If the semaphore value is non-negative, the process continues
    }
}

Up(Semaphore S)
{
    S.value = S.value + 1; // Increment the semaphore value by 1
    if (S.value <= 0)
    {
        Select a Process From Suspended list; // If the semaphore value is non-positive, select a process from the suspended list
        WakeUp();                             // Wake up the selected process
    }
}
