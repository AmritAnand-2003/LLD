public class GoalNotifier implements FitnessDataObserver {

    private final int stepGoal = 10000;
    private boolean goalReached = false;
    @Override
    public void update(FitnessData data) {
        if (data.getSteps() >= stepGoal && !goalReached) {
            System.out.println("Goal Reached! Congratulations on achieving " + data.getSteps() + " steps today!");
            goalReached = true;
        }
    }
    public void reset() {
        goalReached = false;
        System.out.println("Goal reset. You can start tracking your steps again.");
    }
}

