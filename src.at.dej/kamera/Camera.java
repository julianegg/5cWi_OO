

public class Camera {
    
    private int pixel; 
    private int weight; 
    private int pictureSize;
    private SdCard SdCard;
    private Random random = new Random();


    public Camera(int pixels, int weight, int pictureSize, SdCard SdCard)
    {
        this.pixels = pixels;
        this.weight = weight;
        this.pictureSize = pictureSize;
        this.SdCard = SdCard;
    }
    public void takePicture()
    {
        Picture newPicture = new Picture(pictureSize, "" + random.nextInt() + ".jpg");
        System.out.println("Picture taken: " + newPicture.getName());
        sd.SavePicture(newPicture);
    }


    public void printAllImages()
    {
        for (Picture picture : SdCard.GetAllFiles()) {
            System.out.println(picture.getName());
        }
    }
}



