public class problem2 {
    public static void main(String args[]){
        for (int i = 1; i < 200; i++){ 
            for (int j = 1; j < i; j++){ 
                for (int k = 1; k < j; k++){ 
                    for (int l = 1; l < k; l++){
                        if ( good(i,j) && good(j,k) && good(i,k) && good(i,l) && good(j, l) && good(k, l)){
                            IBIO.output( i + " " + j + " " + k + " " + l);
                        }    
                    }   
                }
            }
        }
    }   

    static boolean good(int a, int b){ 
        int x = a * b + 1;
        int y = (int) (Math.sqrt(x)+.5);
        return ( y * y == x );
    }
}