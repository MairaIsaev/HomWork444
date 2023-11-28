import java.util.Scanner

sealed class Character(val name: String, val weaponType:WeaponType){
    enum class WeaponType(val type:String)
    {
        SWORD("меч"),
        STICK("посох"),
        BOW("лук")
    }
    companion object{
        const val WARRIOR_NAME="войн"
        const val MAGE_NAME="маг"
        const val ARCHER_NAME="лучник"
    }

}
class Warrior(name: String,weaponType: WeaponType,val ability:String):Character(name, weaponType)
class Mage (name: String,weaponType: WeaponType,val spell:String):Character(name, weaponType)
class Archer(name: String,weaponType: WeaponType,val ability:String):Character(name,weaponType)

typealias CustomString = String
typealias CustomScanner = Scanner
object CharacterCommon{
    fun attack(character: Character){
        when (character){
            is Warrior -> println("${character.name} применил способность ${character.weaponType.type} ${character.ability} для атаки")
            is Mage -> println("${character.name} применил способность ${character.weaponType.type} ${character.spell} для атаки")
            is Archer -> println("${character.name} применил способность ${character.weaponType.type} ${character.ability} для атаки")
        }
    }

    fun defend(character: Character){
        when (character){
            is Warrior -> println("${character.name} защищать себя со способностью ${character.ability}")
            is Mage -> println("${character.name} активирует ${character.spell} для защиты")
            is Archer -> println("${character.name} использует ${character.ability} для защиты")
        }
    }

}