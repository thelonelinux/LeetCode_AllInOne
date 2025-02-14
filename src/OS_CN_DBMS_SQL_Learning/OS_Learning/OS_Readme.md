# OPERATING SYSTEM (OS)
* Includes learning related to OS
* NOTE - OS Notes, after long time will not be useful. For quick revision you can check interview pdf. but understanding properly YT is required.
* After a long period of learning to understand you must first watch YT, and then Topics notes added here.
* For revision only, you can peek into interview and here fast topic notes added below.

## ABOUT NOTES ADDED IN THIS REPO FOR OS
* 1. Booting_MyNotes_OS.pdf
  * Learn this for understanding booting process in OS. You can entirely follow this. Good notes
  * This note is self prepared by me.
* 2. MemoryMgmt_MyNotes_OS.pdf
  * Self made notes. 
  * You can although check it once. But more about memory management topic is already present in this readme file in below lines. That is good already.
* 3. OS_InterviewBit_Questions.pdf
  * Scaler/Interviewbit interview related pdf.
  * Once you able to give all the questions answers then you are prepared completely for OS interview. 
  * Must complete this pdf all the questions to check if any concept you don't know or missed.
* 4. YutubeNote_OS_Functions_Methodologies_Intro.pdf
  * Can be ignored, but read once.
* 5. YutubeNote_OS_Process_ProcessManagement_Part2.pdf
  * Can be ignored, but read once.

## WAY TO LEARN
* If revision then interviewbit pdf is fine and some notes below is fine. 
* If you learn after a long time, to re-install the concepts you have to do Youtube learning for main concepts.
* during interview better learn important chapters. Very high level side questions you might be not able to answer then no worries.

## OS LEARNING
### PHYSICAL NOTES COPY
* For beginner notes see your physical saved notes.
* But need to make a full fledged topic wise notes
* .
### INTERVIEW QUESTIONS
* Later we also need OS whole interview questions from Interviewbit to learn.
* But you first understand and learn proper notes then only go throught the learning of interviewbit questions for practise.
* https://www.interviewbit.com/operating-system-interview-questions/
* .
### YOUTUBE TO LEARN IF ANY
* .

## SCALER OPERATING SYSTEM LEARNING - FOLLOWING SCALER WAY
* https://www.scaler.com/topics/operating-system/
* Here you can find better way of learning for semaphore and check topicwise learning here as well.

## TOPICS WISE LEARNING AND ARRANGEMENTS (INDEX OF OS - LEARNING TOPIC WISE) - FOLLOWING GFG TOPICWISE
* Precise idea of topicwise learning you can check here - https://www.geeksforgeeks.org/operating-systems/
* We are following heading topics of this geeksforgeeks sequence wise only
### EXTRAS TOPICS- 
#### Boot Process, Booting, BIOS, Bootstrap Loader (BootLoader)
    * This topic is added in your notes in old notebook only
* . 

### 1. OPERATING SYSTEM TUTORIAL
* .

### 2. OS BASICS
#### What is Operating System?
#### Functions of Operating Systems
#### Types of Operating Systems
#### Need and Functions of Operating Systems
#### Commonly Used Operating System
* .

### 3. STRUCTURE OF OPERATING SYSTEM
#### Operating System Services
#### Introduction of System Call
#### System Programs in Operating System
#### Operating Systems Structures
#### History of Operating System
#### Booting and Dual Booting of Operating System
* .

### 4. TYPES OF OS
#### Batch Processing Operating System
#### Multiprogramming in Operating System
#### Time Sharing Operating System
#### What is Network Operating System
#### Real Time Operating System (RTOS)
* .

### 5. PROCESS MANAGEMENT
#### Introduction to Process Management
#### Process Table and Process Control Block (PCB)
#### Operations on Processs
#### Process Schedulers in Operation System
#### Inter Process Communication (IPC)
#### Context Switching in Operating System
#### Preemptive and Non-Preemptive Scheduling
* .----
#### MY COMPLETE TOPIC WISE LEARNING ABOUT PROCESS MANAGEMENT (WITH TOPIC WISE DEEP LOW LEVEL LEARNING)
* Youtube Found - Can refer this to understand in video :
  * https://www.youtube.com/watch?v=OrM7nZcxXZU&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&ab_channel=NesoAcademy
* Re-arranged according to actual learning techniques and flow (Bit mixed in GFG but topics are well explained)
#####  Flow of Learning is Like this (For Deep Learning in YT follow - mentioned above) (Follow less of my notes added in OS repo)
* 1. PROCESS MANAGEMENT INTRO
  * Motive - To provide CPU/Process to our programs/process to get maximum throughput.
  * PROCESS AND THREADS
    * PROCESS
      * A process can be thought of as a program in execution
    * THREAD
      * A thread is the unit of execution within a process. A process can have anywhere from just one thread to many threads.
    * Using process explorer tool u can see all the process and it's thread running. see YT.
  * PROCESS STATE
    * Process in execution will go through below states
    * NEW STATE - The process is being created
    * RUNNING STATE - The process is being executed
    * WAITING STATE - The process is waiting for some event to occur (Such as an I/O completion or recption of a signal).
    * READY STATE - The process is waiting to be assigned to a processor.
    * TERMINATED STATE - The process has finished execution.
    * Diagram you can see in YT. Well explained.
    * https://www.youtube.com/watch?v=jZ_6PXoaoxo&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=2&ab_channel=NesoAcademy
    * IMPORTANT - See youtube to understand process state transition better.
  * PROCESS CONTROL BLOCK
    * Each process is represented in the operating system by a Process Control Block (PCB) - also called as task control block
    * Some of the items that PCB stores are 
      * Process State - It says in which state the process is in at that particular moment.
      * Process Number - Process ID, It shows the unique number to identify the process.
      * Program Counter - It indicates the address of the next instruction of that paritcualr process that has to be executed for that particular process.
      * CPU Registers - It tells about the  registers used by that process. Registers like index registers, stack registers.
      * memory limits
      * List of open files
      * CPU Scheduling Information - It stores the priority of the processes. Stores the pointer to the scheduling queue and other scheduling parameter.
      * Memory management information - It tells the memory that is being used by the process.
      * Accounting information - It keeps account of all the resources which is being used by the particular process. Resources can be CPU, Time, or Memory. 
      * Input/Output Status Information - It stores what all I/O devices are assigned to this process.
  * PROCESS SCHEDULING
    * The objective of multiprogramming is to have some process running at all times, to maximize CPU utilization
    * The objective of time-sharing is to switch the CPU among processes so frequently that users can interact with each program while it is running.
      * Example, type a doc. listen music, and download file. We are doing three task at same time in system. But actually what is happening is CPU is switching to each process so frequently and quickly we don't realise.
    * How to accomplish the objectives of MULTIPROGRAMMING AND TIME SHARING
      * To meet these objectives, the process scheduler selects an available process(possibly from a set of several available processes) for program execution on the CPU.
        * For a single-processor system, there will never be more than one running process.
        * If there are more processes, the rest will have to wait until the CPU is free and can be rescheduled.
        * The process scheduler takes care of this.
    * SCHEDULING QUEUES
      * JOB QUEUE - As processes enter the system, they are put int oa job queue. which consists of all processes in the system.
      * READY QUEUE - The processes that are residing in main memory and are ready and waiting to execute are kept on a list called the ready queue.
      * SEE THE DIAGRAM IN YT WORKING - https://www.youtube.com/watch?v=2h3eWaPx8SA&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=5
  * CONTEXT SWITCH
    * Interrupts cause the operating system to change a CPU from its current task and to run a kernel routine (When higher priority task comes up).
    * Such operations happen frequently an general-purpose systems.
    * When an interrupt occurs, the system needs to save the current context of the process currently running on the CPU so that it can restore
      * that context when its processing is done, essentially suspending the process and then resuming it.
    * The context is represented in the PCB of the process.
    * Switching the CPU to another process requires performing a state save of the current process and a state restore of a different process. This task is known as a context switch.
    * Some Imp Points about Context Switching
      * Context-switch time is pure overhead (Waste of time and resource), but the system does no useful work while switching.
      * Its speed varies from machine to machine, depending on the memory speed, the number of resigters that must be copies, and the existence of special instructions (such as a single instruction to load or store all registers).
      * Typical speeds are few milliseconds.
  * OPERATIONS ON PROCESSES
    * PROCESS CREATION
      * A process may create serveral new processs, via a create-process system call, during the course of execution
      * The creating process is called a parent process, and the new processes are called the children of that process.
      * Each of these new processs mah in turn create other processes, forming a tree of processes.
      * Tree diagram of process creation check in YT. (Not so imp) - https://www.youtube.com/watch?v=pSW9d3Oaie8&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=6&ab_channel=NesoAcademy
      * Possibilities (In terms of memory)
        * The parent continues to execute concurrently with its children
        * The parent waits until some or all of tis children have terminated.
      * Possibilities (In terms of address space)
        * Child process is a duplicate of the parent process (Same code and date)
        * The child process has a new program loaded into it.
    * PROCESS TERMINATION
      * A process terminates when it finishes executing its final statement and ask the os to delete it by using the exit() system call.
      * At that point, the process may return a statu value (typically a integer) o its parent process (via the wait() system call).
      * All the resources of the process- including physical and virtual memory, open fies, and I/O buffers- are deallocated by the os.
      * Other circumstances to cause termination of process
        * A process can cause the termination of another process via an appropriate system call. Such system call can only be invoked only by the parent of the process that is to be terminated.
        * Reasons for parent process to kill child process
          * If child has exceed the resources allocated. Parent will have mechanism to find how.
          * If child is no longer required
          * If parent terminates, child should also terminate.
  * INTERPROCESS COMMUNICATION
    * Processes executing concurrently i the operating system may bne either independent processes or cooperating processes.
    * INDEPENDENT PROCESSES
      * They cannot affect or be affected by the other processes executing in the system.
    * COOPERATING PROCESS
      * They can affect or be affected by the other process executing in the system.
      * Any process that shares data with other processes in a cooperating process.
      * In cooperating process we need interprocess communication.
    * THERE ARE SEVERAL REASONS FOR PROVIDING AN ENVIRONMENT THAT ALLOWS PROCESS COOPERATOION
      * Information Sharing
      * Computation speedup
      * Modularity
      * Convenience
    * Cooperating processes require an interprocess communication (IPC) mechanism that will allow them to exchange data and information
    * THERE ARE TWO FUNDAMENTAL MODELS OF INTERPROCESS COMMUNICATION
      * 1. SHARED MEMORY
        * In the shared-memory model, a region of memory that is shared by cooperating process is established. 
        * Processes can then exchange information by reading and writing data to the shared region
      * 2. MESSAGE PASSING
        * In the message passing model, communication takes place by means of message exchange between the cooperating processes.
      * You can see the diagram in YT. - https://www.youtube.com/watch?v=dJuYKfR8vec&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=8&ab_channel=NesoAcademy
    * SHARED MEMORY SYSTEMS (Deep dive)
      * Diagram see in yt - https://www.youtube.com/watch?v=dJuYKfR8vec&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=8&ab_channel=NesoAcademy
      * Typically, a shared-memory region resides in the address space of the process creating the shared-memory segment.
      * Other processes that wish to communicate using this shared-memory segment must attach it to their adress space.
      * Process must remove restrictions to access other process memory access else OS won't allow to access.
      * PRODUCER CONSUMER PROBLEM
        * 

### 6. CPU SCHEDULING IN OS
#### CPU Scheduling in Operating Systems
#### CPU Scheduling Criteria
#### Multiple-Processor Scheduling in Operating System
#### Thread Scheduling
* .

### 7. THREADS IN OS
#### Thread in Operating System
#### Threads and its types in Operating System
#### Multithreading in Operating System
* .

### 8. PROCESS SYNCHRONIZATION
#### Introduction of Process Synchronization
#### Race Condition Vulnerability
#### Critical Section in Synchronization
#### Mutual Exclusion in Synchronization
* .

### 9. CRITICAL SECTION PROBLEM SOLUTION
#### Person's Algorithm in Process Synchronization
#### Semaphores in Process Synchronization
#### Semaphores and its types
#### Producer Consumer Problem using Semaprhores | Set 1
#### Readers-Writers Problem | Set 1 (Introduction and Readers Preference Solution)
#### Dining Philosophers Problem Using Semaphores
#### Hardware Synchronization Algorithsm : Unlock and Lock, test and Set, Swap
* .

### 10. DEADLOCKS AND DEADLOCK HANDLING METHODS
#### Intorduction of Deadlock in Operatings System
#### Conditions for Deadlock in Operating System
#### Banker's Algorithm in Operating System
#### Wait for Graph Deadlock Detection in Distributed System
#### Handling Deadlocks
#### Deadlock Prevention and Avoidance
#### Deadlock Detection and Recovery
#### Deadock Ignorance in Operating System
#### Recovery from Deadlock in Operating System
* .


### 11. MEMORY MANAGEMENT (DONE LEARNING WITH PROPER TOPICS AND YT VIDEOS - KEEP ON REVISING IF NOT WANT TO GO THROUGH VIDEOS AGAIN)
#### Memory Management in OS (HIGH LEVEL TOPIC DISTRIBUTION - GFG but enhanced by my own learning and re-ordered topics)
* 1. Implementation of Contiguous Memory Management Techniques
  * A. Fixed (or static) Partitioning
  * B. Variable (or Dynamic) Partitioning (Below are dynamic allocation technique for contiguous memory allocation)
    * Best-Fit Allocation
    * Worst-Fit Allocation
    * First-Fit Allocation
    * Next-Fit Allocation
  * Fragmentation (Internal and External)
  * Compaction (Solution to External Fragmentation)
* 2. Non-Contiguous Allocation (Also a solution to External Fragmentation)
  * A. Paging
    * Page Table, MMU
  * B. Segmentation
* 3. Virtual Memory
  * Page Replacement Algorithms
   * FIFO Page Replacement Algorithm - Belady's Anomaly in Page Replacement Algorithms
   * Optimal Page Replacement Algorithm
   * Program for Least Recently Used (LRU) Page Replacement algorithm
  * Techniques to handle Thrashing
    * Learn from this link - https://www.scaler.com/topics/thrashing-in-os/
    * Thrashing is when huge page replacement is taking place such that the system hangs out. Swapping is part of page replacement algorithm, but thrashing is like worst.
* --
#### MY COMPLETE TOPIC WISE LEARNING ABOUT MEMORY MANAGEMENT (WITH TOPIC WISE DEEP LOW LEVEL LEARNING)
* Youtube Found - Can refer this to understand in video : 
  * https://www.youtube.com/watch?v=RhNWpUrO5MQ&list=PL8tc66sMn9Kjt2Wf5H9O-TMqZFQukoCQ1&ab_channel=AnjaliSharma
* Re-arranged according to actual learning techniques and flow (Bit mixed in GFG but topics are well explained)
#####  Flow of Learning is Like this (For Deep Learning in YT follow - mentioned above) (Follow less of my notes added in OS repo)
* 1. MEMORY MANAGEMENT INTRO (Why we need) 
  * Moving of program/process from Physical address (Hard Drive) to Logical Address(RAM) which is then CPU does executing of that process
  * So we need some Management stuffs to manage this flow. Usually MMU (Memory Management Unit does this task)
  * Functions of Memory Management - Allocate Memory to Programs/Process (Determine allocation policy), Check status of Memory, Swap inactive process with active process etc.
* 2. ADDRESS BINDING, LINKING AND LOADING CONCEPTS
  * ADDRESS BINDING - The program we write is in Secondary Memory. We want it to get executed and bring it in Primary Memory. More check in YT only.
    * MMU (Memory Management Unit) - It is a hardware component whose main purpose is to convert virtual addressed created by the CPU (Logical address) into physical adressed in the computer's memory.
  * LINKING - Linking of our compiled program code (main function in C) viz intermediate code which is machine readable (known as object code) with Header files (function library) like std header file in C into an executable file.
    * Two types of linking : Static (directly use header library) and Dynamic Linking (Use pointer address to get header library rather than complete header library)
  * LOADING - It is process of loading a program from the secondary memory to main memory
    * Two types of loading - Static loading (All at a time) and Dynamic loading (when needed)
* 3. SWAPPING AND OVERLAYS
   * SWAPPING - Changing of memory location of a process from secondary to main memory and vice versa.
   * OVERLAYS - When the size of process is greater than Memory allocated to it, then overlays are used to execute such programs. In overlays we keep only those instructions
     * and data in memory which are needed at any given time. When new instructions are needed they will be loaded in previous used up instructions which is no longer required.
     * Advantage of Overlay - Using less memory efficiently
     * Disadvantage - Extensive Programming Requirements (We have to make extra programs to handle such scenarios).
* 4. MEMORY ALLOCATION TECHNIQUES
   * Two Types
     * 1. CONTIGUOUS MEMORY ALLOCATION (like arrays) - This has become obsolete. Not more used in real life systems
       * A. FIXED OR STATIC ALLOCATION 
         * All sectors of Memory will be of fixed size. Each partition is called frame. 
         * The degree of multiprogramming will depend on the number of partitions of this main memory
       * B. VARIABLE OR DYNAMIC ALLOCATION
         * All sectors of memory are of different size like 1kb, 2kb, 10kb etc, they are called Hole
         * Process comes to search the appropriate Hole and get settled, search in sequential only. This searching and allocating memory process is called DYNAMIC STORAGE ALLOCATION PROBLEM
         * DYNAMIC STORAGE ALLOCATION PROBLEM
           * 4 ways to resolve this problem (DYNAMIC ALLOCATION)
             * 1. FIRST FIT - When process comes it settles down when it finds the first memory space hole suitable for it.
             * 2. BEST FIT - When process comes and find most suitable hole according to there size and settle down. Allocate the smallest hole that is big enough. 
               * We must search the entire list, unless the hole list is ordered by size. This strategy produces the smallest hole
             * 3. WORST FIT - When process comes and find out large enough hole for it and settle down. It checks from first to last and then select the largest hole.
             * 4. NEXT FIT - When process continues to search from where the previous process has find out its position. This allocates like first fit only, just searching starts from last left allocation. 
               * This is done because it will make use of whole list rather than beginning list of holes.
       * FRAGMENTATION (PARTITION AND MEMORY MANAGEMENT ISSUE) - (Note - this is possible in contiguous memory allocation only)
         * PARTITION OF MEMORY - Partition of Memory in Sectors. Goal is to reduce memory wastage (fragmentation) and use of large process to run easily in smaller memory areas (Overlay)
         * FRAGMENTATION - Inability to use the memory even if it is free is called fragmentation.
           * Memory fragmentation is when most of your memory is allocated in a large number of non-contiguous blocks, or chunks - leaving a good percentage of your total memory unallocated, but unusable.
           * 3 forms of Fragmentation (But in sylabus only 2)
             * INTERNAL FRAGMENTATION
               * Illustration - lets say we have partitioned our main memory in block size of 10k. We have now process of size 8k. So when we put this process in 10k block, 2k waste we get, this is called internal fragmentation.
               * CPU will allocate next process in next free block. let say 5k process, so wasted 5k. so it will be allocate in next. now we have 5+2k waste total. so now process of 7k comes then we can't accomodate it even though we have space. because the space is not contgiguous.
             * EXTERNAL FRAGMENTATION
               * Illustration - block size 10k taken again. let say we have 10k of 5 partition. so we have 50k total in memory. let say we have occupied block 1, 3, and 5. so we have 2 and 4 block left of each 10k size and total 20k.
               * Now if we have some process of 20k. then we can't allocate it as 2 and 4 are not contiguous memory block. so this results in external fragmentation
       * SOLUTIONS OF EXTERNAL FRAGMENTATION
         * 1. COMPACTION
           * It is process of combining free memory block group together and used memory block together. This can be useful to remove external fragmentation.
           * Compaction refers to combine all the empty spaces together.
           * Processes are on one side and free spaces is on the other side in the memory. During memory compaction we have to first block process for compaction, move them towards lower address space
           * allocate memory for pending request, resume blocked processes w.r.t compaction, It consumes CPU time (Overhead). Program needs to support the dynamic allocation.
           * So due to this above disadvantage in compaction we have other way to remove external fragmentation called NON-CONTIGUOUS MEMORY ALLOCATION
         * 2. NON-CONTIGUOUS MEMORY ALLOCATION
     * 2. NON-CONTIGUOUS MEMORY ALLOCATION (like linkedlist)
       * Two Types
         * 1. PAGING
           * Paging is a memory management scheme that eliminates the need for a contiguous allocation of physical memory. 
           * The process of retrieving processes in the form of pages from the secondary storage into the main memory is known as paging. 
           * The basic purpose of paging is to separate each procedure into pages.
           * Memory management technique that permits the physical address space of a process/program to be non-contiguous.
           * The mapping between logical pages and physical page frames is maintained by the page table, which is used by the memory management unit (MMU) to translate logical addresses into physical addresses. The page table maps each logical page number to a physical page frame number. By using a Page Table, the operating system keeps track of the mapping between logical addresses (used by programs) and physical addresses (actual locations in memory).
           * Physical memory is divided into fixed size-bock called FRAMES (Main Memory is divided into fixed size block called frames)
           * Logical memory is divided into fixed size block called PAGES (Process before bringing it to memory can be divided into fixed size block called page)
           * A frame has the same size as a page, It is place where a logical page can be physically placed
           * So since the size of page and frame is same then it will remove internal fragmentation. Paging however will not completely irradicate internal fragmentation, as last block of a process page size can be smaller so.
           * PAGE TABLE 
             * This is table whose main task is to map the page with frame and store the table list in the table. 
             * Table contains page column and frame column and which page map to which frame is present there. It has other task also like memory protection etc.
             * Each process has its own page table stored in memory. Page table is organized as series of entries.
             * Number of entries in the page table = Number of pages in logical address space of that process/program
             * Page table contains frame numbers. Page table is kept in the main memory. 
             * Page table implementation maintains a four bit per page table entry. 
               * Use bit, Modified bit, valid bit, Read only. (Apart from page number and corresponding frame number. it also does protection task etc.)
           * PAGE NUMBER AND OFFSET - See in video better explained there. 
             * Let say a process have 0-15 instructions. so total 16 instructions, Divided into 4 page. so each page has 4 instructions of code. 
             * So this instructions within the page is called offsets. CPU creates this Logical Address of this page and offset.
             * Physical address is frame and its offset created for Main Memory RAM.
           * Advantages - No External Fragmentation, Simple Memory Management Algorithm, Swapping is easy.
           * Disadvantages - Internal fragmentation (It reduces not totally irradicate), Page table may consume more memory, Multi level paging leads to memory reference overhead.
           * Disadvantages of Paging - I/O Overhead During Page Faults: When a required page is not in physical memory (page fault), it needs to be fetched from secondary storage, causing delays and increased I/O operations.
           * See this page for more about paging Disadvantages and advantages (important) - https://www.geeksforgeeks.org/paging-in-operating-system/?ref=lbp
           * Numerical problems related to paging. Page table formulas. Address translation
           * WHAT IS MEMORY MANAGEMENT UNIT(MMU)?
             * A memory management unit (MMU) is a technique used to convert logical address to physical address. Logical address is the address generated by CPU for each page and physical address is the real address of the frame where page is going to be stored.
             * Whenever a page has to be accessed by CPU using the logical address, it requires physical address for accessing the page. Logical address comprises of two parts: Page Number and Offset.
           * TLB (TRANSLATION LOOK aside BUFFER) - you may ignore this topic from video as out of syllabus. But just check as knowledge.
             * TLB = Cache (Fast lookup hardware)(Cache Memory) (But used for pages to reduce the effectvie access time for the frame number) - It acts as cache in paging.
           * SHARED PAGING, TWO LEVEL PAGING AND MISCELLANEOUS TOPICS
             * PROTECTION - 
               * So attributes like Page, corresponding frame, read bit, invalid bit etc. these columns can be also added in page table.
               * To protect page table. If page table we want for read only then set bit to 1. If modifiable set bit to 0. Other additional bit with page table is valid-invalid bit.
               * So this way memory protection is done.
             * SHARED PAGES - 
               * Some programs like Compilers, run time libraries, the code in them is never changed, but might be used again and again by multiple process
               * So such programs present in Page table is called shared pages. So they are shared in page table
             * STRUCTURE OF THE PAGE TABLE
               * Why we need to do this - As process becomes larger, the page table also grows larger, so we need efficient way to store this page table in memory.
               * Large page table is not desired as they take lot of memory. So to reduce this issue we have below way of structuring the page table to resolve this issue.
               * 3 TYPES
               * 1. HIERARCHICAL PAGING
                 * MULTI-LEVEL PAGING
                   * Larger page table is not desired because they take lot of memory.
                   * So how to reduce page table size.
                     * Solution 1 - Increase the page size. (1 page of size 20k takes more lines then of size 40k of that same process to store each page in page table.). But in this case if code is small for some instructions then internal fragmentation will occur. So we came with multilevel paging.
                     * Solution 2 - Multilevel Paging in Hierarchical memory. Outer page table will have entry/index of inner page table. Inner page table will contains the page table. See in YT 10/17.
               * 2. HASHED PAGE TABLE
                * Here we make use of Hash function to store our page in page table, 
                * Internally linkedlist is used to point to the frame. This hash table is like array of linkedList to understand in coding way. Where linkedlist points to frames.
                * So whenever that page is required again, we make use of hash function to get that from hash table and put in main memory. Here instead of page table we can say it's hash table.
               * 3. INVERTED PAGE TABLE
                 * Very Imp - 
                   * Inverted Page Table is the global page table which is maintained by the OS for all the processes. In inverted page table, the number of entries is equal to the number of frames in the main memory.
                   * It can be used to overcome the drawbacks of page table
                   * There is always a space reserved for the page regardless of the fact that whether it is present in the man memory or not, However, this is simply the wastage of the memory if the page is not present.
                   * We can save this wastage by just inverting the page table. We can save the details only for the pages which are present in the main memory. 
                   * Frames are the indices and the information saved inside the block will be Process ID and page number.
                   * Like in frame1(P1 page5) in frame2(P2 page3), in frame3(P1 page2). etc.
                 * This says that we want only one page table to maintain for all processes. We don't want 100 page tables created for 100 processes as they will use lot of memory.
                 * So this time when CPU will generate Logical Address for a Process, this time it will generate ProcessID along with Page Number in the Logical address.
                 * So previously CPU generates Logical address  for a process having Page Number of a process
                 * But now CPU generated Logical address for a process having page number and ProcessID (This extra bit/header we added now)
                 * So this time in Page table, we would have Process ID (this extra column added in page table) along with page number, Process ID will identify to which process it belongs to. So that memory can get that page of certain process when required without making use of multiple page tables.
               * -
         * 2. SEGMENTATION
           * In Layman words Understanding
             * Lets say we developers have different code chunk in our program having of different size. 
             * Lets say main program of 5kb, SharedLibrary of 6kb and Stack of 4kb.
             * In paging we didn't care of this sizes. We would just divide the program in fixed page of let's say 10k, And we will put these programs accordingly in page of 10k by mixing two types of code chunk in one to become in 10k page.
             * So here developers perspection is not taken care of in paging.
             * So we came with new technique of Segmentation to overcome the paging issue where developers perspection is taken care.
             * So now we won't divide our process in pages of fixed size. 
             * But now we will divide our process in the form of different code chunk. Like Main Program, Shared Libraries, Function, Stack. Irrespective of there size. 
             * These code chunks are called as Segment.
             * Also we won't divide our main memory in frames of fixed size. But now we will try and find required space needed by our code chunk and put it there.
             * These mapping of process segments with main memory address is stored in Segment Table.
             * Segment Table has column like s.no (which says segment number of the program), Base Address (first bit of memory address where the segment is allocated in memory) and Length (Size of segment or say offset) .
             * Here logical address is the combination of Segment number and offset.
             * See in YT, You understand more. YT - Segmentation
           * Address translation in Segmentation and Numericals (SEE YT only)
           * SEGMENTATION FAULT - When searching for offset greater than that chunk of code actually has then it will give segmentation error. 
             * Example I have segment of size 6. ( instruction are 0,1,2,3,4,5). 
             * Base address is 0 and offset (last address is 5). So when we search for segment 0 with offset 9, then there is no 9th instruction in my segment. so Segmentation fault occurs.
           * PAGING VS SEGMENTATION
             * Paging has some internal fragmentation, whereas segmentation has no internal fragmentation
             * Paging does not care user view whereas segmentation does.
             * Paging has not external fragmentation, whereas in segmentation there is external fragmentation.
             * So advantages are exact opposite in this two memory allocation technique.
             * So we can combine this two to develop a new methodologies.
             * The combined methodologies is called Paged Segmentation
         * PAGED SEGMENTATION (COMBINED EFFECT OF PAGING AND SEGMENTATION)
           * LayMan Understand
             * The program is divided into Segments.
             * It preserves the user view of the Program
             * The segments are further divided in to pages
             * So that the non-contiguous memory allocation can be implemented effectively.
             * Page size = Frame size (Physical memory)
             * SO here each segment is internally divided into pages.
           * IMPORTANT POINTS
             * Pages are smaller than segments.
             * Each segments has a page table which means evenly program has multiple page tables. One for each segment of program
             * Suppose we have 5 segments in a program, so there will be 5 Page table. and one Segment table to store the segments. 
             * Here two tables are used segment table and page table.
             * Segment table contains the information about every segment. Each segment table entry points to a page table entry.
             * Logical address comprises <segment no, offset>
             * Segment number is used to index the segment table.
             * Each segment table entry consists of <segment length, page table base>
             * The logical address is valid if the offset is less than the segment legnth.
             * The segment offset is divided into 2 parts <page no, page offset>
             * Here page no is used to index the page table of the segment
             * Logical Address generates <Segment No, Page No. Offset>
               * Segment Number => which code chunk (In segment table find that segment number)
               * Page Number => Which page of that code chunk (Segment table s.no contains the address of that page table. So we go to that address and find the page table and get the page number)
               * Frame Number => Using page number find the frame number mapped to it in page table
               * Offset => Which instruction of that page to be executed in main memory (Go to that page table and find the offset)
             * So this is basic hardware working of Paged Segmentation
           * ADVANTAGES
             * Reduces memory usages.
             * No external fragmentation
           * DISADVANTAGES
             * Some internal fragmentation still there.
* 5. VIRTUAL MEMORY
  * WHY VIRTUAL MEMORY AS WE ALREADY HAVE MEMORY MANAGEMENT TECHNIQUES
    * Consider a situation - Lets say we have large programs in our system. 
    * Where even overlay concept fails.
    * So in that case memory will run out and a trap will get generate and system crashes.
    * So to check this situation we have Virtual Memory to resolve this issue.
  * HOW VIRTUAL MEMORY WORKS (MORE BETTER EXPLAINED IN YT CHECK)
    * If we want to bring some page in main memory, but the main memory is full then
      * If we have no virtual memory concepts => Then trap is generated and system crashes.
      * If we have virtual memory concepts
        * The memory map (same as page table) will find that there is no free frames available in main memory
        * So it will store the page in the secondary memory called backing store. You know secondary memory has huge space.
        * So when any frame is free, then swapping takes place between Backing store and Main memory for that page and it gets the frame.
        * So here we get the illusion of as if we have large memory space. 
        * But this is done to remove the trap and system crashes.
        * Here page table is called Memory map.
        * Backing store is Secondary storage. Where page will get stored in case Main Memory is full.
    * So technically here we are calling Disk Storage or secondary memory as our virtual memory.
  * ADVANTAGES 
    * System libraries can be shared.
  * IMPLEMENTATION OF VIRTUAL MEMORY
    * 1. DEMAND PAGING
      * Only those pages are put in Main Memory which has high demand. Other less required pages are put in Secondary Storage (Backing store).
      * Bring a page into memory only when it is needed
      * We will remove oldest page from ram and put the latest page in ram from backing store. 
      * So removing page from ram is called page out, and adding from backing store to ram is called page in.
      * TYPES OF DEMAND PAGING
        * PURE DEMAND PAGING
          * Add pages only when it is required.
        * PRE-FETCHED
          * Add some pages before execution started
      * LAZY SWAPPER 
        * Swap from and back to RAM to Backing Store and vice versa.
        * Demand paging make use of this swapping software patch.
      * VALID/INVALID BIT : 
        * v => In memory, I => not in memory. this is extra bit in map table.
      * PAGE FAULT 
        * When we access a page marked invalid (Means not present in memory ram), it causes page fault.
        * OS performs a series of steps to handle page fault. to bring that page from backing store to main memory.
        * More page fault, the throughput of system declines.
        * WHAT HAPPENS IF THERE IS NO FREE FRAME IN RAM? (THERE COMES THE PAGE REPLACEMENT TECHNIQUES)
          * Page replacement - find some page in memory, but not really in use, swap it out
            * algorithm
            * performance - want an algorithm which will result in minimum number of page faults.
          * Same page may be brought into memory several times.
      * BASIC PAGE REPLACEMENT STEP
        * Find the location of the desired page on disk (Backing store)
        * Find a free frame: If there is a free frame use it. else use a page replacement algo to select a victim frame.
        * Bring the desired page into the (newly) free frame; update the pate and frame tables
        * Restart the process.
      * PAGE REPLACEMENT ALGORITHM
        * To reduce page fault we need this page replacement algorithms
        * FIFO PAGE REPLACEMENT ALGORITHM (CONSEQUENCE - BELADY'S ANOMALY)
          * https://www.youtube.com/watch?v=Q3Dkjq0xU0M&list=PL8tc66sMn9Kjt2Wf5H9O-TMqZFQukoCQ1&index=15&ab_channel=AnjaliSharma
          * See YT only to understand working using Reference String, Number of frames, Number of page faults, page frames.
          * Here we will replace that page which came first.
          * After complete algorithm, at end we will get how many page faults occurred.
          * This  you can learn better only by looking the YT video only.
          * Page hit = when the page required is already present in memory frame.
          * Reference string of page - example (7,0,1,2,0,3,0,4,2,3). These are pages of a process required in the sequence to be added in our memory
          * Frame size - Total number of frames in main memory
          * Page fault - Unable to find that page in memory when required.
          * BELADY'S ANOMALY
            * The advantage of FIFO page replacement algorithm is easy to implement and disadvantage is that it suffers from Belady's Anomaly
            * It is an unexpected result in FIFO algorithm. 
            * In some of the reference strings, increasing the size of the memory (number of frames - frame size) increases the page fault rate.
            * So this above statement is what belady's anomaly. Remember it is for some reference string of pages only. ie in some  cases.
        * OPTIMAL PAGE REPLACEMENT ALGORITHM
          * Here in reference string of pages, we will look forward for the upcoming required pages in reference string.
          * So looking forward whichever page has demand very later stage in the reference string. we will replace that only.
          * So this is called optimal page replacement algorithm approach
          * Rest check in YT to understand with example
        * LEAST RECENTLY USED (LRU) PAGE REPLACEMENT ALGORITHM
          * Unlike Optimal where we look forward here we will look at backward.
          * And whichever page was used least recently, we will replace that page.
          * Remember least recently used is not like First used for first come. It can be possible that same page was required again. so that becomes now recent one.
          * For more you can check in YT only. Well explained with example.
          * Least recently used can be fifo only when there is  distinct pages in reference string of pages.
      * TYPES OF PAGE REPLACEMENT ALGORITHMS
        * GLOBAL REPLACEMENT
          * Global Replacement allows a process  to select a replacement frame from the set of all frames even that frame is currently allocated to some other process. 
        * LOCAL REPLACEMENT
          * Local Replacement requires that each process select from only its own set of allocated frames.
      * THRASHING
        * Techniques to handle Thrashing
        * Learn from this link - https://www.scaler.com/topics/thrashing-in-os/
        * Thrashing is when huge page replacement is taking place such that the system hangs out. Swapping is part of page replacement algorithm, but thrashing is like worst.
      * -end of lecture
    * 2. DEMAND SEGMENTATION
      * Nothing about this. not so important
* --<END>--


### 12. STORAGE MANAGEMENT
#### Storage Management
#### File Systems in Operating System
#### File Allocation Methods
#### Free Space Management
#### Disk Scheduling Algorithms
* Learning from this video for disk management and scheduling algorithm is enough to understand. (GFG is compulsory to check and learn)
* https://www.youtube.com/watch?v=bqQprtp3byE&list=PL8tc66sMn9Kiy8Xtp5-_lLP8D9gR8gobp&ab_channel=AnjaliSharma
#### RAID (Redundant Arrays of Independent Disks)
* Learning from this vide for RAID is enough to understand RAID, and also check in interviewbit question there only is enough.(GFG is compulsory to check and learn)
* https://www.youtube.com/watch?v=bqQprtp3byE&list=PL8tc66sMn9Kiy8Xtp5-_lLP8D9gR8gobp&ab_channel=AnjaliSharma
* .
#### Storage Management Topic wise learning (as per above YT link)
##### DISK MANAGEMENT IN OS
* 1. DISK STRUCTURE 
  * Topics like Seek Time, Partition
* 2. FCFS DISK SCHEDULING
* 3. SSTF DISK SCHEDULING
* 4. SCAN DISK SCHEDULING
* 5. C-SCAN DISK SCHEDULING
* 6. LOOK DISK SCHEDULING
* 7. C-LOOK DISK SCHEDULING
* 8. DISK SCHEDULING PRACTISE QUESTIONS
* 9. RAID (REDUNDANT ARRAY OF INDEPENDENT DISKS)
  * Motive - If in case disk is corrupt, so for backup we need RAID technique for fault tolerance of our  program code. so that our code we can get back
  * LEVEL 0 to 6
  * LEVEL 0 - Only Stripping (dividing our program to separate disks plate)
  * LEVEL 1 - Stripping and Mirroring (diving our program to separate disks and also creating separate duplicate disk to store our  programs)
  * LEVEL 2 - Use of hamming code instead of mirroring. We store our duplicate program code in hamming code error correction program and store in new disk
  * LEVEL 3 - Use of Parity code. this uses less bits as compared to hamming code. Here we create parity code for each programs each partitions and store in new disk.
  * LEVEL 4 - Here we make Parity code of whole program rather than program crunch and then store it is separate disks.
  * LEVEL 5 - We won't have a separate disk as whole disk corrupt then whole backup goes  away. so we add each parity program code to separate disk which is being used by programs only. no separate disk for parity.
  * LEVEL 6 - Here we add parity code of each program in two separate disks which is used by programs only (and not alone) rather than in one.
  * More you can understand by watching the videos by watching.
* 10. I/O Management




### 13. OS INTERVIEW QUESTIONS / OS QUIZ AND GATE PYQ'S
* .







