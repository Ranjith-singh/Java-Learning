Thread:
    a thread is lightweight process under the main process
    the thread uses the memory and other resources of the main process
life cycle of thread:
   1. creating new Thread
   2. the .start() makes it ready for execution once the resources are allocated
   3. .run(): thread is currently under execution
   4. blocked/waiting of another thread/task to complete
   5. terminated
In java there are 2 ways if creating thread
    1. by extending the Thread class:
        override the default run() method
        create a new class obj and call the .start() which internally invokes the run method
        disadvantages:
            can't extend multiple classes in java
    2. by implementing the runnable interface
        override the default run() method
        create a new Thread obj which takes obj of class that implements the runnable
