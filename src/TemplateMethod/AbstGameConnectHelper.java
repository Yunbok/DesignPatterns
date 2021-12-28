package TemplateMethod;


/*게임 접속 로직 예제 */
public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String encodedInfo);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo) {
//      보안 작업 -> 암호화 된 문자열 복호화
        String decodedInfo = doSecurity(encodedInfo);
//      반환된 Info 를 가지고 아이디 , 암호를 할당한다.

//      디자인패턴 소스이기때문에 로그인부분은 생략
        String id ="test";
        String password ="test123";

        if ( authentication(id, password) ) {
           throw new Error("아이디 암호 불일치");
        }
//      디자인패턴 소스이기때문에 로그인부분은 생략
        String userName = "userName";

//      권한 0~4 까지 임의로 배정
        int auth = authorization(userName);

        switch (auth) {
            case 0: //게임 매니저
                break;
            case 1: //유료 회원
                break;
            case 2: //무료 회원
                break;
            case 3: //권한 없음
                break;
            default://기타
                break;
        }

        return connection(decodedInfo);
    }
}
