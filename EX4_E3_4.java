public class EX4_E3_4 {
    private boolean firstSwitch; // وضعیت کلید اول (false = پایین، true = بالا)
    private boolean secondSwitch; // وضعیت کلید دوم
    
    public EX4_E3_4() {
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

    public static void main(String[] args) {
        EX4_E3_4 circuit = new EX4_E3_4();
        
        System.out.println("وضعیت اولیه چراغ: " + (circuit.isLampOn() ? "روشن" : "خاموش"));
        
        circuit.toggleFirstSwitch();
        System.out.println("پس از تغییر کلید اول: " + (circuit.isLampOn() ? "روشن" : "خاموش"));
        
        circuit.toggleSecondSwitch();
        System.out.println("پس از تغییر کلید دوم: " + (circuit.isLampOn() ? "روشن" : "خاموش"));
        
        circuit.toggleFirstSwitch();
        System.out.println("پس از تغییر مجدد کلید اول: " + (circuit.isLampOn() ? "روشن" : "خاموش"));
    }
}