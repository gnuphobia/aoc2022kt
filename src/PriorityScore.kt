class PriorityScore {
    private var priorities: HashMap<String, Int> = HashMap()

    init {
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

    fun itemPriority(item: String): Int {
        return this.priorities[item] ?: 0
    }
}