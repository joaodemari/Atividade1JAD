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

}