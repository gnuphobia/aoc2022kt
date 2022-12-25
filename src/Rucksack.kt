class Rucksack(val contents: String) {
    var compartment1: String
        private set

    var compartment2: String
        private set

    var commonItem: String
        private set

    var itemPriority: Int = 0
        get() {return priorities[commonItem] ?: 0}

    private var priorities: HashMap<String, Int> = HashMap<String, Int>()

    init {
        val length = contents.length
        val middle = (length / 2)
        compartment1 = contents.substring(0, middle)
        compartment2 = contents.substring(middle)

        commonItem = findCommonItem()

        var count = 1
        for(keyEntry: Char in CharRange('a', 'z')) {
            count.also { this.priorities[keyEntry.toString()] = it }
            count++
        }

        for(keyEntry: Char in CharRange('A', 'Z')) {
            count.also { this.priorities[keyEntry.toString()] = it }
            count++
        }
    }

    private fun findCommonItem(): String {
        val itemList1 = compartment1.toCharArray().distinct()
        val itemList2 = compartment2.toCharArray().distinct()

        for(item: Char in itemList1) {
            if (itemList2.contains(item)) return item.toString()
        }

        return "Unk"
    }
}
