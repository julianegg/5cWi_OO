
import java.util.ArrayList;
import java.util.List;

public class SdCard {

    private int capacity; 
    private ArrayList<Picture> pictures = new ArrayList<Picture>();
    private int storage;
    private int warningAmount;


    private SdCard(int capacity, int warningAmount)
    {
        this.capacity = capacity;
        this.warningAmount = warningAmount;
        storage = this.capacity;
    }


    public void saveFile(){

    }
    
    public void getAllFiles(){

    }

    
    
    
}
