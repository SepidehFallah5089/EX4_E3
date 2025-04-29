public class EX4_E3_6 {
    public class Circuit {
        private boolean firstSwitch;
        private boolean secondSwitch;
    
        public Circuit() {
            firstSwitch = false;
            secondSwitch = false;
        }
    
        public int getSwitchState(int switchNum) {
            if (switchNum == 1) {
                return firstSwitch ? 1 : 0;
            } else if (switchNum == 2) {
                return secondSwitch ? 1 : 0;
            } else {
                throw new IllegalArgumentException("شماره کلید نامعتبر است! فقط 1 یا 2 مجاز هستند.");
            }
        }
    
        public int getLampState() {
            return (firstSwitch ^ secondSwitch) ? 1 : 0;
        }
    
        public void toggleSwitch(int switchNum) {
            if (switchNum == 1) {
                firstSwitch = !firstSwitch;
            } else if (switchNum == 2) {
                secondSwitch = !secondSwitch;
            } else {
                throw new IllegalArgumentException("شماره کلید نامعتبر است! فقط 1 یا 2 مجاز هستند.");
            }
        }
    
        public static void main(String[] args) {
            Circuit circuit = new Circuit();
    
            System.out.println("وضعیت اولیه:");
            printState(circuit);
    
            System.out.println("\nتغییر وضعیت کلید 1:");
            circuit.toggleSwitch(1);
            printState(circuit);
    
            System.out.println("\nتغییر وضعیت کلید 2:");
            circuit.toggleSwitch(2);
            printState(circuit);
    
            System.out.println("\nتغییر مجدد وضعیت کلید 1:");
            circuit.toggleSwitch(1);
            printState(circuit);
        }
    
        public static void printState(Circuit circuit) {
            System.out.println("وضعیت کلید 1: " + circuit.getSwitchState(1));
            System.out.println("وضعیت کلید 2: " + circuit.getSwitchState(2));
            System.out.println("وضعیت چراغ: " + circuit.getLampState());
        }
    }
}
