package level3.p42579;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Author : DDing77
 * Problem Name: 베스트앨범
 * Level : 3
 * Language : Java
 * Category : Sort, Hash
 * Url : https://school.programmers.co.kr/learn/courses/30/lessons/42579
 */

class Solution {

    public int[] solution(String[] genres, int[] plays) {

        // 장르의 총 재생수를 저장
        Map<String, Integer> genresType = new HashMap<>();
        Map<String, List<PlayInfo>> playList = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        IntStream.range(0, genres.length)
                .forEach(idx -> {
                    genresType.put(genres[idx], genresType.getOrDefault(genres[idx], 0) + plays[idx]);
                    playList.computeIfAbsent(genres[idx], k -> new ArrayList<>()).add(new PlayInfo(idx, genres[idx], plays[idx]));
                });

        Map<String, Integer> sortedMap = genresType.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        for (String s : sortedMap.keySet()) {
            int size = 0;
            System.out.println("s = " + s);
            Collections.sort(playList.get(s));
            for (PlayInfo playInfo : playList.get(s)) {
                if (size != 2) {
                    answer.add(playInfo.id);
                    size++;
                }
            }
        }

        System.out.println(Arrays.toString(answer.toArray()));
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new String[]{"classic", "pop", "classic", "classic"}, new int[]{500, 600, 150, 800}));
    }

    static class PlayInfo implements Comparable<PlayInfo> {

        int id;
        String genre;
        int playTime;

        public PlayInfo(int id, String genre, int playTime) {
            this.id = id;
            this.genre = genre;
            this.playTime = playTime;
        }

        @Override
        public int compareTo(PlayInfo o) {
            return o.playTime - this.playTime;
        }
    }

}