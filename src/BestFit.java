import java.util.ArrayList;

public class BestFit implements Fit{
    public void Fit(ArrayList<Bin> arr, Item item){
        Bin best = new Bin();
        int best_index = -1;
        best.remainCapacity = 10;
        for(int i = 0; i < arr.size(); i++)
        {
            Bin bin = arr.get(i);
            if(best.remainCapacity > bin.remainCapacity && bin.remainCapacity >= item.size) {
                best = bin;
                best_index = i;
            }
        }
        if(best_index == -1){
            Bin new_bin = new Bin();
            if(new_bin.check(item)) new_bin.add(item);
            arr.add(new_bin);
        }
        else
        {
            Bin bin = arr.get(best_index);
            bin.add(item);
        }

    }
}
