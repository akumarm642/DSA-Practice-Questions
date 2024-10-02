import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public static void main(String[] args) {
        String senate = "DRRDRDR";
        PredictPartyVictory ppv = new PredictPartyVictory();
        System.out.println(ppv.predictPartyVictory(senate));
    }

    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        // Initialize queues with indices of senators
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        int n = senate.length();

        // Simulate the voting process
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            if (rIndex < dIndex) {
                radiant.add(rIndex + n); // Radiant bans Dire
            } else {
                dire.add(dIndex + n); // Dire bans Radiant
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
