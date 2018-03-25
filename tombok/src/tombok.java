public class tombok {
    public static void main(String[] args){
        //int [][] tomb = new int [3][3];
        int [][] tomb = { { 1, 2, 3}, { 1, 2, 3} };

        for (int i=0; i < tomb.length; i++){
            for (int j = 0; j < tomb[i].length; j++) {
                //tomb[i][j] = (i+1)*(j+1)*9;
                System.out.println(tomb[i][j]);
            }
        }
    }

}
