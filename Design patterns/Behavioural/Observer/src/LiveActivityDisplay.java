public class LiveActivityDisplay implements FitnessDataObserver {

    @Override
    public void update(FitnessData data) {
        System.out.println("Live Activity Display Updated: " + data.getSteps() + " steps, " 
            + data.getActiveMinutes() + " active minutes, " 
            + data.getCalories() + " calories.");
    }

}
