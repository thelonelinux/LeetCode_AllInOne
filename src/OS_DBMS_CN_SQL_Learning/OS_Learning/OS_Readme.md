# OPERATING SYSTEM (OS)
* Includes learning related to OS
* NOTE - OS Notes, after long time will not be useful. For quick revision you can check interview pdf. but understanding properly YT is required.
* After a long period of learning to understand you must first watch YT, and then Topics notes added here.
* For revision only, you can peek into interview and here fast topic notes added below.

## OS
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
* .

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

### 11. MEMORY MANAGEMENT
* Youtube Found - Can refer this to understand in video : https://www.youtube.com/watch?v=RhNWpUrO5MQ&list=PL8tc66sMn9Kjt2Wf5H9O-TMqZFQukoCQ1&ab_channel=AnjaliSharma
#### Memory Management in OS
#### Implementation of Contiguous Memory Management Techniques
#### Non-Contiguous Allocation
#### Compaction 
#### Best-Fit Allocation 
#### Worst-Fit Allocation
#### First-Fit Allocation 
#### Fixed (or static) Partitioning
#### Variable (or Dynamic) Partitioning
#### Paging
#### Segmentation
#### Virtual Memory
* --
#####  Flow of Learning is Like this (For Deep Learning in YT follow - mentioned above)
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
       * FRAGMENTATION (PARTITION AND MEMORY MANAGEMENT ISSUE)
         * ..
     * 2. NON-CONTIGUOUS MEMORY ALLOCATION (like linkedlist)
* .
 

### 12. PAGE REPLACEMENT ALGORITHMS
#### Page Replacement Algorithms
#### Program for page Replacement Algorithms | Set 2 (FIFO)
#### Belady's Anomaly in Page Replacement Algorithms
#### Optimal Page Replacement Algorithm
#### Program for Least Recently Used (LRU) Page Replacement algorithm
#### Techniques to handle Thrashing
* .

### 13. STORAGE MANAGEMENT
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




### 14. OS INTERVIEW QUESTIONS / OS QUIZ AND GATE PYQ'S
* .







