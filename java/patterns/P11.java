public class P11 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i || j+i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
