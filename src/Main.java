import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] item = new int[] {7,5,6,4,2,3,7,5};
        ArrayList<Bin> farr = new ArrayList<>();
        ArrayList<Bin> narr = new ArrayList<>();
        ArrayList<Bin> barr = new ArrayList<>();
        ArrayList<Bin> warr = new ArrayList<>();

        Fit ff = new FirstFit();
        for(int i = 0; i < item.length; i++){
            ff.Fit(farr, new Item(item[i]));
        }
        System.out.println("FirstFit");
        for (int i = 0; i < farr.size(); i++) {
            System.out.println(farr.get(i));
        }
        Fit nf = new NextFit();
        for(int i = 0; i < item.length; i++){
            nf.Fit(narr, new Item(item[i]));
        }
        System.out.println("NextFit");
        for (int i = 0; i < narr.size(); i++) {
            System.out.println(narr.get(i));
        }
        Fit bf = new BestFit();
        for(int i = 0; i < item.length; i++){
            bf.Fit(barr, new Item(item[i]));
        }
        System.out.println("BestFit");
        for (int i = 0; i < barr.size(); i++) {
            System.out.println(barr.get(i));
        }
        Fit wf = new WorstFit();
        for(int i = 0; i < item.length; i++){
            wf.Fit(warr, new Item(item[i]));
        }
        System.out.println("WorstFit");
        for (int i = 0; i < warr.size(); i++) {
            System.out.println(warr.get(i));
        }
    }
}
