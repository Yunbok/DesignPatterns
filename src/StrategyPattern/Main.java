package StrategyPattern;

public class Main {

    public static void main(String[] args) {
        //무기가 새로 추가되더라도 게임캐릭터의 소스는 변함이 없음

        GameCharacter character = new GameCharacter();

        //무기 지정전
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        //신규무기 추가
        character.setWeapon(new Ax());
        character.attack();

    }
}
