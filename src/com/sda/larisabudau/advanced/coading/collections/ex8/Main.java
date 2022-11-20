package com.sda.larisabudau.advanced.coading.collections.ex8;

/**Create a class imitating a weapon magazine.
 The class should be able to define the size of the magazine using the constructor.
 Implement the methods:
 loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than
 the capacity of the magazine
 isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge
 - and prepares the next one, loaded before the last one, if there are no more cartridges,
 it prints "empty magazine" in the console
 */

public class Main {
    public static void main(String[] args) {

        WeaponMagazine weaponMagazin = new WeaponMagazine(8);

        weaponMagazin.loadBullet("Bullet1");
        weaponMagazin.loadBullet("Bullet2");
        weaponMagazin.loadBullet("Bullet3");
        weaponMagazin.loadBullet("Bullet4");
        weaponMagazin.loadBullet("Bullet5");
        weaponMagazin.loadBullet("Bullet6");
        weaponMagazin.loadBullet("Bullet7");
        weaponMagazin.loadBullet("Bullet8");
        weaponMagazin.loadBullet("Bullet9");

        System.out.println(weaponMagazin.isLoaded());

        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();
        weaponMagazin.shot();

        System.out.println(weaponMagazin.isLoaded());
    }
}
