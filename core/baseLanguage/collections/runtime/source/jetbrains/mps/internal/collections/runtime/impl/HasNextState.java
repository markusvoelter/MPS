package jetbrains.mps.internal.collections.runtime.impl;

public enum HasNextState {
    
    UNKNOWN (-1),
    HAS_NEXT (1),
    AT_END (0);

    private int value;
    
    private HasNextState (int value) {
        this.value = value;
    }
    
    public boolean unknown () {
        return value < 0;
    }
    
    public boolean hasNext () {
        if (value < 0) {
            throw new IllegalStateException ();
        }
        return value > 0;
    }
}
