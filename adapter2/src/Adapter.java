public class Adapter implements DoublePin{

    private ChineseElectricPlug chineseElectricPlug;

    public Adapter(ChineseElectricPlug chineseElectricPlug) {
        this.chineseElectricPlug = chineseElectricPlug;
    }

    @Override
    public void connectionWithDoublePin() {
        this.chineseElectricPlug.insert();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ChineseElectricPlug());
        adapter.connectionWithDoublePin();
    }
}
