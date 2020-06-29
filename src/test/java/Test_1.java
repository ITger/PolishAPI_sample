import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test_1 {
    public static boolean between(int i, int _od, int do_) {
        return (i >= _od && i <= do_);
    }

    @Test
    public void name() {
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate
        System.out.println(pr.test(19));    // Calling Predicate method
    }

    @Test
    public void name2() {
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX = (text) -> text.endsWith("x");

        Predicate<String> composed = startsWithA.and(endsWithX);

        String input = "A hardworking person must relax";
        boolean result = composed.test(input);
        System.out.println(result);
    }

    @Test
    public void name3() {
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX = (text) -> text.endsWith("x");

        Predicate<String> composed = startsWithA.or(endsWithX);

        String input = "A hardworking person must relax sometimes";
        boolean result = composed.test(input);
        System.out.println(result);
    }


    /**
     * A i B startują o 800 i kończą o 1600
     * A: {900, 930}, {1100, 1230},
     * B: {930, 1000}, {1400, 1500},
     * <p>
     * WYNIK: {800,900}, {1000, 1100}, {1230, 1400}, {1500, 1600}
     */
    @Test
    public void name44() {
        Zakres zAB = new Zakres(800, 1600);
        List<Zakres> zA = new ArrayList<Zakres>();
        zA.add(new Zakres(900, 930));
        zA.add(new Zakres(1100, 1230));
        //zA.add(new Zakres(1, 15000));
        List<Zakres> zB = new ArrayList<Zakres>();
        zB.add(new Zakres(930, 1000));
        zB.add(new Zakres(1400, 1500));
        System.out.println("zA:  " + zA);
        System.out.println("zB:  " + zB);

        //BiPredicate<Zakres, Zakres> overlap = (s1, s2) -> (s1.start >= s2.start && s1.start <= s2.end) || (s1.end >= s2.start && s1.end <= s2.end);
        //assert overlap.test(new Zakres(900, 930), new Zakres(929, 1000)) == true;

        List<Integer> x00 = IntStream.iterate(zAB.start, d -> d <= zAB.end, d -> d + 100)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> x30 = IntStream.iterate(zAB.start / 100, d -> d < zAB.end / 100, d -> d + 1)
                .map(i -> Integer.decode(i + "30"))
                .boxed()
                .collect(Collectors.toList());
        x30.addAll(x00);
        Collections.sort(x30);

        List<Zakres> zakresy30min = new ArrayList<>(x30.size() - 1);
        for (int i = 0; i < x30.size() - 1; i++) {
            zakresy30min.add(new Zakres(x30.get(i), x30.get(i + 1)));
        }
        System.out.println("zakresy: " + zakresy30min);

        for (int i = 0; i < zA.size(); i++) {
            Zakres spotkanie = zA.get(i);
            zakresy30min.removeIf(r -> r.start >= spotkanie.start && r.end <= spotkanie.end);
        }
        for (int i = 0; i < zB.size(); i++) {
            Zakres spotkanie = zB.get(i);
            zakresy30min.removeIf(r -> (r.start >= spotkanie.start && r.end <= spotkanie.end));
        }
        System.out.println(zakresy30min);
    }

    private class Zakres {
        int start;
        int end;

        public Zakres(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override public String toString() {
            return "Zakres{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
