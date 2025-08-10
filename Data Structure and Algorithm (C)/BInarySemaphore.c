DownB(Semaphore S)
{

    if (S.value == 1)
    {
        S.value = 0;
    }
    else
    {
        Block this Process
        and Place in Suspended
        list,Sleep();
    }
}

UpB(Semaphore S)
{
    if (Suspended List is Empty)
    {
        S.value = 1;
    }
    else
    {
        Select a Process From
        Suspended list and WakeUp();
    }
}



structure semaphore {
    int count
    queueType queue
}

structure binary_semaphore {
    enum {zero, one} value
    queueType queue
}

procedure semWaitB(binary_semaphore s) {
    if s.value == one {
        s.value = zero
    } else {
        // Place this process in s.queue
        add this process to s.queue
        // Block this process
        block this process
    }
}

procedure semSignalB(binary_semaphore s) {
    if s.queue is empty {
        s.value = one
    } else {
        // Remove a process P from s.queue
        remove process P from s.queue
        // Place process P on ready list
        place process P on ready list
    }
}

