fun main() {
    val amount = 58_500_00
    val commissionPercentage = 75
    val commissionMin = 35_00

    val totalCommission = amount*commissionPercentage/10000
    val result = if (totalCommission < commissionMin) commissionMin else totalCommission
    println("Total commission: $result")
}