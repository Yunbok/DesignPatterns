package SingletonPattern;

public class SystemSpeaker {

    private static SystemSpeaker instance;
    private int volume;


    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            //인스턴스가 null 인지 체크하고
            System.out.println("새로생성");
            instance = new SystemSpeaker();
        }
        else {
            System.out.println("이미 생성되어있음");
        }

        return instance;
    }


    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume =  volume;
    }
}
