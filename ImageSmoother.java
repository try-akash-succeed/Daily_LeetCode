public class ImageSmoother {

    public int[][] imageSmoother(int[][] img) {

        int[][] result = new int[img.length][img[0].length];

        for(int i =0; i< img.length; i++){
          
           for(int j=0; j<img[i].length; j++){
               
                result[i][j] = findAverage(img, i, j);

           }

        }

        return result;
    }

    private static int findAverage(int[][] img, int row, int col){
               int total = 0;
               int totalEle = 0;
               for(int i = row - 1; i <= row+1; i++){

                   for(int j=col-1; j <= col +1; j++){

                         if(i >=0  && i < img.length && j >=0 && j < img[i].length) {
                              total += img[i][j];
                              totalEle++;
                         }    

                   }

               }
               return (int)Math.floor(total/totalEle);
    }
    
}
