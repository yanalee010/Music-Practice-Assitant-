public class DynamicTimeWarping {
    private double[] referenceSequence;
    private double[] performanceSequence;

    public DynamicTimeWarping(double[] referenceSequence, double[] performanceSequence) {
        if(referenceSequence == null || performanceSequence == null) {
            throw new IllegalArgumentException("Sequences cannot be null.");
        }

        if(referenceSequence.length == 0 || performanceSequence.length == 0) {
            throw new IllegalArgumentException("Sequences cannot be empty.");
        }
        for(double value : referenceSequence) {
            if(!Double.isFinite(value)) {
                throw new IllegalArgumentException("Reference sequence contains a invalid nu,ber.");
            }
        }
        for (double value : performanceSequence){
            if(!Double.isFinite(value)) {
                throw new IllegalArgumentException("Performance sequence contains an invalid number.");
            }
        }
        this.referenceSequence = referenceSequence.clone();
        this.performanceSequence = performanceSequence.clone();
    }
    public int getReferenceLength() {
        return referenceSequence.length;
    }
    public int getPerformanceLength() {
        return performanceSequence.length;
    }
    private double calculateDistance(double reference, double performance) {
        return Math.abs(reference - performance);
    }
