import com.bcind.day20.Engine;

public class day20 {
    public static void main(String[] args){
        Engine _eng = new Engine("combustion", "hz",
                "volkswagen", "VW GOLF 1L 86-91");
        System.out.println("Engine Type: "+_eng.get_eng_type());
        System.out.println("Description: "+_eng.get_desc());
        System.out.println("MFG: "+_eng.get_mfg());
    }
}
