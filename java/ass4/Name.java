class Name {
public static int func2(int n){
    int count=0;
    for(int i=1;i<n;i++){
        if(i*i<n){
            count++;
        }
    }return count;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j*j<=i;j++){
    //         if(j*j==i) count++;
    //     }
    // }return count;
}

    public static int func(int n, int m, int a, int b) {
int sum1=n*a;
int ans1=n/m;
int ans2=ans1*b;
int count=n-ans1*m;
int ans3=ans2+count*m;
return Math.min(sum1,ans3);



    }

    public static void main(String[] args) {
        // int a = func(5,2,2,3);
        int a=func2(12254);
        System.out.println(a);
    }
}
