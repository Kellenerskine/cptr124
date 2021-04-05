package classCode.chapt7.fancyStopwatch;


public class Stopwatch {
    private long startTime;
    private boolean running;
    private double elapsedTime;
    
    /**
     * Initializes a new stopwatch object ready to measure time
     */
    public Stopwatch() {
        reset();
    }
    
    /**
     * Starts the timing.  Has no effect if the stopwatch
     * already is running.
     */
    public void start() {
        if (!running) {
            running = true;
            startTime = System.currentTimeMillis();
        }
    }
    
    /**
     * Stops the timing. Has no effect on a stopped stopwatch.
     */
    public void stop() {
        if (running) {
            elapsedTime += (System.currentTimeMillis() - startTime)/1000.0;
            running = false;
        }
    }
    
    /**
     * Reports the cumulative elapsed time measured by the stopwatch.
     * (Note that calling this method on a running stopwatch will
     * affect the accuracy of the timing since this method must make 
     * a system call to get the current time and then perform some 
     * arithmetic.  Ideally, clients will stop the stopwatch before 
     * calling this method.)
     * 
     * @return the cumulative elapsed time measured by the stopwatch.
     */
    public double elapsed() {
        if (running) {
            return elapsedTime + (System.currentTimeMillis() - startTime)/1000.0;
        } else {
            return elapsedTime; 
        }
    }
    
    /**
     * Resets the stopwatch to its initial state ready to 
     * begin timing.
     */
    public void reset() {
        running = false;
        elapsedTime = 0.0;
    }

}