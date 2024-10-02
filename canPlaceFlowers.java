public class canPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = { 0 };
        int n = 1;
        canPlaceFlowers cn = new canPlaceFlowers();
        System.out.println(cn.canplaceFlowers(flowerbed, n));

    }

    public boolean canplaceFlowers(int[] flowerbed, int n) {
        int n1 = flowerbed.length;
        int count = 0;
        if(n1==1){
            if(flowerbed[0]==0){
                return true;
            }else{
                return false;
            }
        }

        for (int i = 0; i < n1; i++) {

            try {
                if (flowerbed[i] != 1 && (flowerbed[i - 1] == 0 || i == 0) && (flowerbed[i + 1] == 0 || i == n1 - 1)) {
                    flowerbed[i] = 1;
                    
                    count++;
                    // System.out.print(count);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (i == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                    continue;

                }
                if (i == n1 - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                   
                    count++;
                }
            }

        }
        return count >= n;
    }
}
