public class DataGenerator {

    public class DataGenerator{
        public static int[] generateDataArray(){
            Random random = new Random();
            int[] data = new int[5];
            
            for (int i = 0; i < data.length; i++) {
                data[i] = random.nextInt(5); 
            }
            return data; 
            
        }
    }
}
