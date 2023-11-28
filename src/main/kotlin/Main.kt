fun main(args: Array<String>) {
    val scanner: CustomScanner = CustomScanner(System.`in`)
    println("Введите 0 для защиты или 1 для атаки:)")
    val input: Int = scanner.nextInt()

    when (input) {
        0 -> {
            val warrior = Warrior(Character.WARRIOR_NAME, Character.WeaponType.SWORD, "щит")
            val mage = Mage(Character.MAGE_NAME, Character.WeaponType.STICK, "каменая стена")
            val archer = Archer(Character.ARCHER_NAME, Character.WeaponType.BOW, "огненные стрелы")


            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }

        1 -> {
            val warrior = Warrior(Character.WARRIOR_NAME, Character.WeaponType.SWORD, "мощный удар")
            val mage = Mage(Character.MAGE_NAME, Character.WeaponType.STICK, "огненный шар")
            val archer = Archer(Character.ARCHER_NAME, Character.WeaponType.BOW, "меткость")

            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)

            val hiller = object {
                val name = "Хиллер"
                fun hill() {
                    println("$name вылечил всех!")
                }
            }
            hiller.hill()
        }
        else -> println("Некорректный ввод")
        }
    }