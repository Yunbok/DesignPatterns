package TemplateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String encodedInfo) {
        System.out.println("디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return false;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return null;
    }
}
