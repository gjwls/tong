import java.util.ArrayList;

public class WorstFit implements Fit{
    public void Fit(ArrayList<Bin> arr, Item item){
        Bin worst = new Bin();
        int worst_index = -1;
        worst.remainCapacity = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            Bin bin = arr.get(i);
            if(worst.remainCapacity < bin.remainCapacity && bin.remainCapacity >= item.size) {
                worst = bin;
                worst_index = i;
            }
        }
        if(worst_index == -1){
            Bin new_bin = new Bin();
            if(new_bin.check(item)) new_bin.add(item);
            arr.add(new_bin);
        }
        else
        {
            Bin bin = arr.get(worst_index);
            bin.add(item);
        }
    }
}
