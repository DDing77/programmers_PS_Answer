import java.util.*;

class Solution {

    static HashMap<String, String> user;
    static ArrayList<String> chatLog;

    static void enter(String userId, String userName) {
        user.put(userId, userName);
        chatLog.add(userId + "님이 들어왔습니다.");
    }

    static void change(String userId, String userName) {
        user.put(userId, userName);
    }

    static void leave(String userId) {
        chatLog.add(userId + "님이 나갔습니다.");
    }

    public String[] solution(String[] record) {
        user = new HashMap<>();
        chatLog = new ArrayList<>();

        for(int i=0; i<record.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i]);
            String command = st.nextToken();
            String userId = st.nextToken();
            String userName = "";

            if(!command.equals("Leave")) userName = st.nextToken();

            if(command.equals("Enter")) {
                enter(userId, userName);
            } else if( command.equals("Leave")) {
                leave(userId);
            } else if( command.equals("Change")) {
                change(userId, userName);
            }
        }

        String[] answer = new String[chatLog.size()];
        int logIdx = 0;

        for(String log : chatLog) {
            int endOfId = log.indexOf("님");
            String userId = log.substring(0, endOfId);

            answer[logIdx++] = log.replace(userId, user.get(userId));
        }

        return answer;
    }
}