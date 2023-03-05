public class Television_5_2 {
    public static void main(String[] args) {
        Television_5_1 myTv = new Television_5_1();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        myTv.print();

        Television_5_1 yourTv = new Television_5_1();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        yourTv.print();
    }
}
