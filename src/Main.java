public class Main {
    public static void main(String[] args) {
        HealthParameter heartRate = HealthDataFactory.createHealthParameter("Heart Rate");
        HealthParameter steps = HealthDataFactory.createHealthParameter("Steps Taken");


        User user = new User("Guzal");

        heartRate.addObserver(user);
        steps.addObserver(user);

        heartRate.setValue(60);
        steps.setValue(10000);
    }
}