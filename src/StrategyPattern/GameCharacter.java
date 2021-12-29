package StrategyPattern;

public class GameCharacter {

    //접근점
    private Weapon weapon;

    //무기 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if ( weapon == null) {
            System.out.println("맨손 공격");
        } else {
            //델리게이트 - 내가들고있는 무기에따라 공격이 달라진다
            weapon.attack();
        }
    }
}
