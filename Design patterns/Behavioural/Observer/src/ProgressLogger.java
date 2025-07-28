public class ProgressLogger implements FitnessDataObserver {
    @Override
    public void update(FitnessData data) {
        System.out.println("Progress Logger Updated: " + data.getSteps() + " steps, " 
            + data.getActiveMinutes() + " active minutes, " 
            + data.getCalories() + " calories.");
    }
}
