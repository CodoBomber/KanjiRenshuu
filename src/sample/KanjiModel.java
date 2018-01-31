package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KanjiModel {

    private List<Path> kanjiList = new ArrayList<>(45);
    private int currentPosition;
    // TODO: 18/01/31 Поменять на другую колекцию
    final Map<String, Integer> kana = new HashMap<>();
    private Map<String, Integer> kanjiOrderMap = new HashMap<>();

    private void createKanaMap() {
        kana.put("a", 0);
        kana.put("i", 1);
        kana.put("u", 2);
        kana.put("e", 3);
        kana.put("o", 4);
        kana.put("ka", 5);
        kana.put("ki", 6);
        kana.put("ku", 7);
        kana.put("ke", 8);
        kana.put("ko", 9);
        kana.put("sa", 10);
        kana.put("shi", 11);
        kana.put("su", 12);
        kana.put("se", 13);
        kana.put("so", 14);
        kana.put("ta", 15);
        kana.put("chi", 16);
        kana.put("tsu", 17);
        kana.put("te", 18);
        kana.put("to", 19);
        kana.put("na", 20);
        kana.put("ni", 21);
        kana.put("nu", 22);
        kana.put("ne", 23);
        kana.put("no", 24);
        kana.put("ha", 25);
        kana.put("hi", 26);
        kana.put("fu", 27);
        kana.put("he", 28);
        kana.put("ho", 29);
        kana.put("ma", 30);
        kana.put("mi", 31);
        kana.put("mu", 32);
        kana.put("me", 33);
        kana.put("mo", 34);
        kana.put("ya", 35);
        kana.put("yu", 36);
        kana.put("yo", 37);
        kana.put("ra", 38);
        kana.put("ri", 39);
        kana.put("ru", 40);
        kana.put("re", 41);
        kana.put("ro", 42);
        kana.put("wa", 43);
        kana.put("wo", 44);
        kana.put("n", 45);
    }

    KanjiModel(Level level, boolean randomize) {
        createKanaMap();
        changeLevel(level, randomize);
    }

    public void changeLevel(Level level, boolean randomize) {
        try {
            Stream<Path> paths = Files.list(Paths.get(level.getSource()));
            if (!randomize) {
                if (!level.equals(Level.HIRAGANA) && !level.equals(Level.KATAKANA)) {
                   /* paths = paths.sorted(
                            Comparator.comparing(
                                    p -> p.getFileName()
                                            .toString()
                            )
                    );*/
                    createKanjiMap(level.getJlpt());
                    Path[] kanjis = new Path[level.getJlpt().getQuantity()];
                    paths.forEach(path -> {
                        String hex = path.getFileName()
                                .toString().split("\\.")[0];
                        String baseFileName = String.valueOf(Character.toChars(Integer.parseInt(hex,16)));
                        kanjis[kanjiOrderMap.get(baseFileName)] = path;
                        kanjiList = Arrays.stream(kanjis).collect(Collectors.toList());
                    });
//                    kanjiList = paths.collect(Collectors.toList());
                } else {
                    Path[] kanjis = new Path[46];
                    paths.forEach(path -> {
                        String baseFileName = path.getFileName()
                                .toString().split("\\.")[0];
                        kanjis[kana.get(baseFileName)] = path;
                        kanjiList = Arrays.stream(kanjis).collect(Collectors.toList());
                    });
                }
            } else {
                kanjiList = paths.collect(Collectors.toList());
                Collections.shuffle(kanjiList);
            }
            currentPosition = 0;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void createKanjiMap(JLPTFactory jlpt) {
        for (int i = 0; i < jlpt.getQuantity(); i++) {
            kanjiOrderMap.put(jlpt.getgKanjiData()[i], i);
        }
    }

    public Path getKanji(int position) {
        if (position < 0 || position >= kanjiList.size()) {
            return null;
        }
        return kanjiList.get(position);
    }

    public Path getCurrentKanji() {
        return kanjiList.get(currentPosition);
    }

    public Path getNextKanji() {
        currentPosition = (currentPosition + 1) % kanjiList.size();
        return kanjiList.get(currentPosition);
    }

    public Path getPreviousKanji() {
        currentPosition = currentPosition > 0 ? currentPosition - 1 : kanjiList.size() - 1;
        return kanjiList.get(currentPosition);
    }

}
