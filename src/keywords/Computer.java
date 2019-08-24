package keywords;

public class Computer {
    int ramSize;
    final int cpu = 3;

    public Computer(){}
    public Computer(int ramSize){
        this.ramSize = ramSize;
    }

    public void assembleComputer(){
        System.out.println("Computer was assembled in USA");
    }

    public void assembleMonitor(){
        System.out.println("Computer Monitor is Retina Screen");
    }
}
