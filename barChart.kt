fun main() {
val stores = listOf("Enter today's sales for store 1: 1000 [Enter]", "Enter today's sales for store 2: 1200 [Enter]", "Enter today's sales for store 3: 1800 [Enter]", "Enter today's sales for store 4: 800 [Enter]","Enter today's sales for store5: 1900 [Enter]"
)
for (store in stores) {
    println(store)

}

val storeSales = listOf("Store 1: **********", "Store 2: ************", "Store 3: ******************", "Store 4: ********", "Store 5: *******************")
for (storeSales in storeSales) {
    println(storeSales)
}
}
