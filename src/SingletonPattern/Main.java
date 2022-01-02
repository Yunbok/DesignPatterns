package SingletonPattern;

public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance(); // 하나의 인스턴스를 사용하는지 테스트하기위해 두개 생성

        //예상 출력 5 , 5
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(20);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());


        speaker2.setVolume(10);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}
