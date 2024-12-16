public class DataGenerator {

    public class DataGenerator{
        public static int[] generateDataArray(int size){
            Random random = new Random();
            int[] data = new int[size];
            
            for (int i = 0; i < data.length; i++) {
                data[i] = random.nextInt(); 
            }
            return data; 
            
        }

    }
    public static int[] generateDataArray(int size, int min, int max){
        Random random = new Random();
        int[] data = new int[size];
        
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(min, max); 
        }
        return data; 
        
    }
}
