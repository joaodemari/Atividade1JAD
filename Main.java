import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    // método a.
    public int nOcorrencias(ArrayList l, Integer el) {
        int conta = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == el) {
                conta++;
            }
        }
        return conta;
    }
    
    // método c.
    public int nroRepeat(ArrayList l) {
    int conta = 0;
    for (int i = 0; i < l.size() - 1; i++) {
    if (l.get(i) == l.get(i + 1)) {
    conta++;
    }
    }
    return conta;
    }    
    // método d.
    public ArrayList listRepeat(ArrayList l) {
        ArrayList result = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j)) && !result.contains(l.get(i))) {
                    result.add(l.get(i));
                }
            }
        }
        return result;
    }



    // método f.
    public ArrayList intersect(ArrayList l1, ArrayList l2) {
    ArrayList result = new ArrayList<>();
    for (int i = 0; i < l1.size(); i++) {
    if (l2.contains(l1.get(i)) && !result.contains(l1.get(i))) {
    result.add(l1.get(i));
    }
    }
    return result;
    }
}
    

