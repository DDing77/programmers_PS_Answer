import java.util.*;

class Solution {

    public class Document {
        int priorities;
        int location;

        public Document(int priorities, int location) {
            this.priorities = priorities;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        List<Document> list = new ArrayList<>();

        for(int i=0; i<priorities.length; i++) {
            list.add(new Document(priorities[i], i));
        }
        int answer = -1;
        int cnt = 0;
        while(list.size() >0 ) {
            Document curDocument = list.remove(0);
            if(list.size() == 0) {
                cnt++;
                answer = cnt;
                break;
            }

            int curPriorities = curDocument.priorities;
            int curLocation = curDocument.location;

            boolean isPrint = true;

            for(int i=0; i<list.size(); i++) {
                if(curDocument.priorities < list.get(i).priorities) {
                    list.add(new Document(curPriorities, curLocation));
                    isPrint = false;
                    break;
                }
            }

            if(!isPrint) continue;

            cnt++;
            if(location == curLocation) {
                answer = cnt;
                break;
            }
        }

        return answer;
    }
}