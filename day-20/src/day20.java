import com.bcind.day20.Engine;

public class day20 {
    public static void main(String[] args){
        Engine _eng = new Engine("combustion", "hz",
                "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(
                "Engine Type (Engine cls): "+_eng.get_eng_type());
        System.out.println("Description (Part cls): "+_eng.get_desc());
        System.out.println("MFG (Part cls): "+_eng.get_mfg());
    }
}
