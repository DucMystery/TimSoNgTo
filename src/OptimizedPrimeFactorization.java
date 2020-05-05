public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        try {
            for (int i =1;i<100;i++){
                if (checkSoNgTo(i))
                    System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public boolean checkSoNgTo(int n){
        int dem =0;
        if (n<1)
            return false;
        if (n==1)
            return true;
        for (int i =2;i<n/2; i++){
            if (n%i==0){
                dem++;
            }
        }
        if (dem>0)
            return false;
        return true;
    }
}
