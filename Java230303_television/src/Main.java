public class Main {
    public static void main(String[] args) {
        Television myTV = new Television();

        myTV.channel = 7;
        myTV.volume = 9;
        myTV.isOn = true;
        int ch = myTV.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다. ");
    }
}