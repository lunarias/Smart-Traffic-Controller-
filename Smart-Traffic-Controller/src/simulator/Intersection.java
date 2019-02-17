package simulator;

public class Intersection {
    
    public Intersection() {
    
    }
    
    private boolean ns_status;
    private boolean ew_status;
    
    public boolean set_nw_status(Boolean status) {
        this.ns_status = status;
    }
    
    
    public boolean is_nw_active() {
        return ns_status;
    }
    
    public boolean is_ew_active() {
        return ew_status;
    }
    
}