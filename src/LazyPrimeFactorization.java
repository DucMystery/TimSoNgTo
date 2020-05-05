public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {

        try {
           for (int i =1;i<100;i++){
               if (checkSoNgTo(i))
                   System.out.println(i);
           }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean checkSoNgTo(int n){
        int dem =0;
        for (int i =1;i<n; i++){
            if (n%i==0){
                dem++;
            }
        }
        if (dem>2)
            return false;
        return true;
    }
}
