class RuckGroup {
    private var rucks: MutableList<Rucksack> = emptyList<Rucksack>().toMutableList()
    var commonItem: String = "a"

    fun addRucker(ruckContents: String) {
        rucks.add(Rucksack(ruckContents))
    }

    fun findCommonItem() {
        for(item: Char in rucks[0].contents) {
            if (rucks[1].contents.contains(item) && rucks[2].contents.contains(item)) {
                commonItem = item.toString()
                return
            }
        }
    }



}