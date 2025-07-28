public class FitnessDataObserverDemo {
    public static void main(String[] args) {
        FitnessData fitnessData = new FitnessData();
        LiveActivityDisplay display = new LiveActivityDisplay();
        ProgressLogger logger = new ProgressLogger();
        GoalNotifier notifier = new GoalNotifier();

        // Register observers
        fitnessData.registerObserver(display);
        fitnessData.registerObserver(logger);
        fitnessData.registerObserver(notifier);
        // Simulate new fitness data
        fitnessData.newFitnessDataPushed(5000, 30, 200);
        fitnessData.newFitnessDataPushed(10000, 60, 500);
        fitnessData.newFitnessDataPushed(15000, 90, 800);

        notifier.reset();
        fitnessData.dailyReset();
    }
}
