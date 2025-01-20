# DSA 101 learning




## Topics Included
* Search (Binary and Linear)
* Sorting
* Collections (Map, Set, List Learning)
* Stack and Queues
* Recursion : Just follow this for more learning : https://developer.ibm.com/articles/l-recurs/
  * Deep dive in recursion understanding see below (While vs Recursion) (Changing recursion approach to while loop appraoch and vice versa) : advantage and disadvantage
* Time and Space Complexity : Just follow this link : https://www.coursehero.com/file/159965365/algorithmspdf/
* Some Easy Basic Algorithms
* For some basic interview questions, you can check below link
* link (Interviewbit) : https://www.interviewbit.com/algorithm-interview-questions/#swap-two-numbers-without-using-temporary-variable-in-java





### Some Basic Algorithms
* 1. Swap two given numbers without using a temporary variable
   * Let us take a look at two approaches to solve this problem:
     * Using Addition and subtraction:

       *  a = a + b;
       *  b = a - b; // this will act like (a+b) - b, and now b equals a.
       * a = a - b; // this will act like (a+b) - a, and now an equals b.
       *  It is a clever trick. However, if the addition exceeds the maximum value of the int primitive type as defined by Integer.MAX_VALUE in Java, 
       * or if the subtraction is less than the minimum value of the int primitive type as defined by Integer.MIN_VALUE in Java, there will be an integer overflow.

         * Using the XOR method:
         * Another way to swap two integers without needing a third variable (temporary variable) is using the XOR method.
         * This is often regarded as the best approach because it works in languages that do not handle integer overflows, such as Java, C, and C++. 
         * Java has a number of bitwise operators. XOR (denoted by ^) is one of them.
         * x = x ^ y;
         *  y = x ^ y;
         *  x = x ^ y;





#### Recursion (Deep dive Learning and Understanding) : Most important topic for Competitive Programming and DSA like linkedList, trees and graphs
* This is part of above link given in recursion topic only, this topic is very important to understand recursion more deeply
* What about loop variables
 *  Now, the question is how to do loops without assignment? The answer lies in recursive functions. Take a look at the properties of loops and see how they compare with those of recursive functions in Table 1.

 * Table 1. Comparing loops with recursive functions
 * Properties	Loops	Recursive functions
 * Repetition	Execute the same block of code repeatedly to obtain the result; signal their intent to repeat by either finishing the block of code or issuing a continue command.	Execute the same block of code repeatedly to obtain the result; signal their intent to repeat by calling themselves.
 * Terminating conditions	In order to guarantee that it will terminate, a loop must have one or more conditions that cause it to terminate and it must be guaranteed at some point to hit one of these conditions.	In order to guarantee that it will terminate, a recursive function requires a base case that causes the function to stop recursing.
 * State	Current state is updated as the loop progresses.	Current state is passed as parameters.
As you can see, recursive functions and loops have quite a bit in common. In fact, loops and recursive functions can be considered interchangeable. The difference is that with recursive functions, you rarely have to modify any variable -- you just pass the new values as parameters to the next function call. This allows you to keep all of the benefits of not having an updateable variable while still having repetitive, stateful behavior.

 * Converting a common loop to a recursive function
 * Let's take a look at a common loop for printing reports and see how it can convert into a recursive function.

 * This loop will print out the page number and page headers at each page break.
 * We will assume that the report lines are grouped by some numeric criteria and we will pretend there is some total we are keeping track of for these groups.
 * At the end of each grouping, we will print out the totals for that group.  
 * For demonstration purposes, we've left out all of the subordinate functions, assuming that they exist and that they perform as expected. Here is the code for our report printer:

    * Listing 10. Report-printing program using a normal loop
    * void print_report(struct report_line report_lines, int num_lines)
    * {
    * int num_lines_this_page = 0;
    * int page_number = 1;
    * int current_line; / iterates through the lines /
    * int current_group = 0; / tells which grouping we are in /
    * int previous_group = 0; / tells which grouping was here on the last loop /
    * int group_total = 0; / saves totals for printout at the end of the grouping */
    * print_headings(page_number);
    * for(current_line = 0; current_line < num_lines; current_line++)
    * 
    * num_lines_this_page++;
    * if(num_lines_this_page == LINES_PER_PAGE)
     *  {
     *     page_number++;
      *    page_break();
      *    print_headings(page_number);
      * }

      * current_group = get_group(report_lines[current_line]);
      * if(current_group != previous_group)
       * {
       *  print_totals_for_group(group_total);
        *  group_total = 0;
      * }

        * print_line(report_lines[current_line]);

      * group_total += get_line_amount(report_lines[current_line]);
   * }
* }

* Show more
* Several bugs have been intentionally left in the program. See if you can spot them.

* Because we are continually modifying state variables, it is difficult to see whether or not at any given moment they are correct. Here is the same program done recursively:

* Listing 11. Report-printing program using recursion
* void print_report(struct report_line report_lines, int num_lines)
* {
* int num_lines_this_page = 0;
* int page_number = 1;
* int current_line; / iterates through the lines /
* int current_group = 0; / tells which grouping we are in /
* int previous_group = 0; / tells which grouping was here on the last loop /
* int group_total = 0; / saves totals for printout at the end of the grouping /
* / initialize /
* print_headings(page_number);
* / Seed the values /
* print_report_i(report_lines, 0, 1, 1, 0, 0, num_lines);
* }

* void print_report_i(struct report_line report_lines, / our structure /
* int current_line, / current index into structure /
* int num_lines_this_page, / number of lines we've filled this page /
int page_number,
* int previous_group, / used to know when to print totals /
* int group_total, / current aggregated total /
* int num_lines) / the total number of lines in the structure /
* {
* if(current_line == num_lines)
* {
* return;
* }
* else
* {
* if(num_lines_this_page == LINES_PER_PAGE)
* {
* page_break();
* print_headings(page_number + 1);
* print_report_i(
* report_lines,
* current_line,
* 1,
* page_number + 1,
* previous_group,
* group_total,
* num_lines);
* }
* else
* {
* int current_group = get_group(report_lines[current_line]);
* if(current_group != previous_group && previous_group != 0)
* {
* print_totals_for_group(group_total);
* print_report_i(
* report_lines,
* current_line,
* num_lines_this_page + 1,
* page_number,
* current_group,
* 0,
* num_lines);
* }
* else
* {
* print_line(report_lines[current_line]);
* print_report_i(
* report_lines,
* current_line + 1,
* num_lines_this_page + 1,
* page_number,
* current_group,
* group_total + get_line_amount(report_lines[current_line]),
* num_lines);
* }
* }
* }
* }

* Show more
* Notice that there is never a time when the numbers we are using are not self-consistent. Almost anytime you have multiple states changing, you will have several lines during the state change at which the program will not have self-consistent numbers. If you then add a line to your program in the middle of such state changes you'll get major difficulties if your conception of the states of the variables do not match what is really happening. After several such modifications, it is likely that subtle bugs will be introduced because of sequencing and state issues. In this program, all state changes are brought about by re-running the recursive function with completely self-consistent data.