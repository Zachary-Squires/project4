public class Main {
    public static void main(String[] args) {
        hashMapTest HMT = new hashMapTest();
        HMT.addKV(3, 4);
        HMT.addKV(1, 2);
        HMT.addKV(6, 7);
        HMT.getKV(3);
        HMT.getKV(1);
        HMT.getKV(6);
        HMT.removeKV(3);
        HMT.getALL();
    }
}