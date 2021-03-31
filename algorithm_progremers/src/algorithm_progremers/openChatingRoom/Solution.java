package algorithm_progremers.openChatingRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Solution solution = new Solution();
        solution.solution(record);
    }
    public String[] solution(String[] record) {

        HashMap<String, String> names = new HashMap<>();
        ArrayList<String> commands = new ArrayList<>();
        ArrayList<String> users = new ArrayList<>();

        int changeCnt = 0;
        for (int i = 0; i < record.length; i++) {
            String command = record[i].split(" ")[0];
            String user = record[i].split(" ")[1];
            String name;
            if (command.equals("Change")) {


                name = record[i].split(" ")[2];
                names.put(user,name);
                continue;
            }
            commands.add(command);
            users.add(user);
            if (!command.equals("Leave")) {
                name = record[i].split(" ")[2];
                names.put(user,name);
            }
        }

        String[] answer = new String[commands.size()];

        for (int i = 0; i < commands.size(); i++) {
            answer[i] = names.get(users.get(i)) +"님이 ";
            String command = commands.get(i);
            if (command.equals("Enter")) {
                answer[i] += "들어왔습니다.";
            } else if (command.equals("Leave")) {
                answer[i] += "나갔습니다.";
            }
        }


        return answer;
    }
}
