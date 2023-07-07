//s26016
//Melis Toksoy
package odev;

public class Odev {

    public static void TersCevir(IdeaStack s1) {
        IdeaQueue q1 = new IdeaQueue();
        while (!s1.empty()) {
            q1.insert(s1.pop());
        }
        while (!q1.empty()) {
            s1.push(q1.delete());
        }

    }

    public static int YigitOrtaEleman(IdeaStack s1) {

        IdeaStack s2 = new IdeaStack();
        int size = 0;

        while (!s1.empty()) {
            s2.push(s1.pop());
            size++;
        }

        int midIndex = size / 2;
        int middleValue = 0;

        for (int i = 0; i < size; i++) {
            int value = s2.pop();
            s1.push(value);
            if (i == midIndex) {
                middleValue = value;
            }
        }

        return middleValue;
    }

    public static int KuyrukOrtaEleman(IdeaQueue q1) {

        IdeaQueue q2 = new IdeaQueue();
        int size = 0;

        while (!q1.empty()) {
            q2.insert(q1.delete());
            size++;
        }
        int midIndex = size / 2;
        int middleValue = 0;

        for (int i = 0; i < size; i++) {
            int value = q2.delete();
            q1.insert(value);
            if (i == midIndex) {
                middleValue = value;
            }

        }

        return middleValue;

    }

    public static void KuyrukAyikla(IdeaQueue q3, int x) {

        IdeaQueue q4 = new IdeaQueue();

        while (!q3.empty()) {
            int curr_value = q3.delete();

            if (curr_value <= x) {
                q4.insert(curr_value);
            }
        }
        while (!q4.empty()) {
            q3.insert(q4.delete());
        }

    }

    public static void main(String[] args) {

        IdeaQueue q = new IdeaQueue();

        q.showContent();
        q.insert(-5);

        q.insert(-4);

        q.insert(-3);

        q.insert(-2);

        q.showContent();

        IdeaStack s = new IdeaStack();

        s.showContent();
        s.push(2);

        s.push(3);

        s.push(4);

        s.push(5);

        s.showContent();

        TersCevir(s);
        s.showContent();

        TersCevir(s);

        System.out.println(YigitOrtaEleman(s));
        s.showContent();

        System.out.println(KuyrukOrtaEleman(q));
        q.showContent();

        KuyrukAyikla(q, -3);
        q.showContent();

    }

}
