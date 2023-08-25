import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    // método a.
    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int conta = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == el) {
                conta++;
            }
        }
        return conta;
    }

    // método b.
    public boolean hasRepeat(ArrayList<Integer> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) == l.get(i + 1)) {
                return true;
            }
        }
        return false;
    }

    // método c.
    public int nroRepeat(ArrayList<Integer> l) {
        int conta = 0;
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) == l.get(i + 1)) {
                conta++;
            }
        }
        return conta;
    }

    // método d.
    public ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j)) && !result.contains(l.get(i))) {
                    result.add(l.get(i));
                }
            }
        }
        return result;
    }

    // método e.
    public ArrayList union(ArrayList l1, ArrayList l2) {
        ArrayList result = new ArrayList<>(l1);
        for (int i = 0; i < l2.size(); i++) {
            if (!result.contains(l2.get(i))) {
                result.add(l2.get(i));
            }
        }
        return result;
    }

    // método f.
    public ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            if (l2.contains(l1.get(i)) && !result.contains(l1.get(i))) {
                result.add(l1.get(i));
            }
        }
        return result;
    }
}
