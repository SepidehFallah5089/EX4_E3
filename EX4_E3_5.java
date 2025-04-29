public class EX4_E3_5 {
    

    public class Circuit {
        private boolean firstSwitch; // وضعیت کلید اول (false = پایین، true = بالا)
        private boolean secondSwitch; // وضعیت کلید دوم
        
        public Circuit() {
            firstSwitch = false;
            secondSwitch = false;
        }
        
        public void toggleFirstSwitch() {
            firstSwitch = !firstSwitch;
        }
        
        public void toggleSecondSwitch() {
            secondSwitch = !secondSwitch;
        }
        
        public boolean isLampOn() {
            return firstSwitch ^ secondSwitch; // استفاده از عملگر XOR برای تعیین وضعیت چراغ
        }
        
        public int getFirstSwitchState() {
            return firstSwitch ? 1 : 0;
        }
        
        public int getSecondSwitchState() {
            return secondSwitch ? 1 : 0;
        }
    }
    
    public class CircuitTester {
        public static void main(String[] args) {
            Circuit circuit = new Circuit();
            
            System.out.println("حالت اولیه:");
            printState(circuit);
            
            System.out.println("\nتغییر وضعیت کلید اول:");
            circuit.toggleFirstSwitch();
            printState(circuit);
            
            System.out.println("\nتغییر وضعیت کلید دوم:");
            circuit.toggleSecondSwitch();
            printState(circuit);
            
            System.out.println("\nتغییر مجدد وضعیت کلید اول:");
            circuit.toggleFirstSwitch();
            printState(circuit);
        }
        
        public static void printState(Circuit circuit) {
            System.out.println("وضعیت کلید اول: " + (circuit.getFirstSwitchState() == 1 ? "بالا" : "پایین"));
            System.out.println("وضعیت کلید دوم: " + (circuit.getSecondSwitchState() == 1 ? "بالا" : "پایین"));
            System.out.println("وضعیت چراغ: " + (circuit.isLampOn() ? "روشن" : "خاموش"));
        }
    }
    }