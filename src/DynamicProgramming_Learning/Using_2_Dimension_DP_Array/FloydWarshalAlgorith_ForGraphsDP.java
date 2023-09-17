package DynamicProgramming_Learning.Using_2_Dimension_DP_Array;

public class FloydWarshalAlgorith_ForGraphsDP {

    final static int INF = 9999; //Let's take this value to be infinite for now, infinite means we can't reach to that node from source node
    final static int nV = 4 ; //Taken from the input graph only, as it has 4 nodes/vertex. it represents number of vertices

    //Implementing floyd-Warshal algorithm to find min distance between each vertex to all other vertex
    public  static void floydWarshal(int graph[][]){

        int DP[][] = new int[nV][nV];  //this is our 2D DP array which will store our answers for smaller sub-problem, here smaller bu-problem is first using
        // k=1 as intermediate point from source and destination, and then moving to other point and keep on updating min distance possible from source to destination

        int i,j,k;

        //Base Case :
        //First lets assign our DP array with value which it already has got for each vertex distance, initially provided to us from questions
        //later only we can find for minimum distance
        for( i=0; i<nV; i++){
            for( j=0; j<nV; j++){
                DP[i][j]=graph[i][j];
            }
        }

        //Adding vertices individually
        for(k = 0; k<nV; k++){  //Taking kth vertex as intermediate vertex to reach from source i to destination j, let's check if this intermediate
            //vertex can give us min distance and update in DP array, and do this for all other kth vertex and keep on updating DP array, at last we
            //will get final smallest possible distance from source to destination
            for( i=0; i<nV ;i++){  //this is source vertex i
                for( j=0; j<nV; j++){//this is destination vertex j
                    if(DP[i][k] + DP[k][j] < DP[i][j]){
                        //If we got min distance via kth vertex to go from i to j, then update this value in our DP[i][j]
                        DP[i][j] = DP[i][k] + DP[k][j];
                    }
                }

            }

        }

        //So now we got our DP array populated
        //let's print the output
        for( int m = 0; m<nV ; ++m){
            for( int n=0; n<nV ;++n){
                if(DP[m][n] == INF){
                    System.out.print("INF ");
                }else{
                    System.out.print(DP[m][n] + " ");
                }
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        //first let's represent our graph in 2D matrix

        int graph[][] = {{0, 3, INF, 5},  //here this is 0th vertex, it's value is showing its edge distance with other vertex,
                // example with itself it is 0, with 1 it is 3, with 2 there is no connection hence INF(infinity) and with 4 it is 3 distance
                        {2, 0, INF, 4},
                        {INF, 1, 0, INF},
                        {INF, INF, 2, 0}
        }; //here 0 means going from same source to same destination, which is of course 0 only
        //INF means infinity, mean there is no path/edge from source to destination, whether directly or indirectly from some intermediate vertex


        floydWarshal(graph);

        /**
         * Output is
         * 0 3 7 5
         * 2 0 6 4
         * 3 1 0 5
         * 5 3 2 0
         */


    }
}
