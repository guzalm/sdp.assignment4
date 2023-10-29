// Factory Pattern
class HealthDataFactory {
    public static HealthParameter createHealthParameter(String parameterName) {
        return new HealthParameter(parameterName);
    }
}
