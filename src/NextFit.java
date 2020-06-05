import java.util.ArrayList;

public class NextFit implements Fit {
    public void Fit(ArrayList<Bin> arr, Item item){
        if(arr.size() == 0){
            Bin new_bin = new Bin();
            if(new_bin.check(item)) new_bin.add(item);
            arr.add(new_bin);
            return;
        }
        Bin bin = arr.get(arr.size()-1);
        if(bin.check(item))
            bin.add(item);
        else{
            Bin new_bin = new Bin();
            if(new_bin.check(item)) new_bin.add(item);
            arr.add(new_bin);
        }
    }
}
