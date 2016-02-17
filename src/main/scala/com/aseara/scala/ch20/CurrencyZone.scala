package com.aseara.scala.ch20

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/29
 * Time: 16:46
 */
abstract class CurrencyZone {

  type Currency <: AbstractCurrency
  def make(x: Long): Currency

  abstract class AbstractCurrency {
    val amount: Long
    def designation: String

    def + (that: Currency) = make(amount + that.amount)
    def * (x: Double) = make((this.amount * x).toLong)
    def - (that: Currency) = make(amount - that.amount)
    def / (that: Double) = make((amount / that).toLong)
    def / (that: Currency) = amount.toDouble / that.amount

    def from(other: CurrencyZone#AbstractCurrency) =
      make(math.round(
        other.amount.toDouble *
        Converter.exchangeRate(other.designation)(designation)
      ))

    override def toString =
      (amount.toDouble / CurrencyUnit.amount.toDouble) formatted ("%." + decimals(CurrencyUnit.amount) + "f") + s" $designation"

    private def decimals(n: Long): Int =
      if (n == 1) 0 else 1 + decimals(n / 10)
  }

  val CurrencyUnit: Currency
}

object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    override def designation = "USD"
  }
  override type Currency = Dollar
  override def make(cents: Long) = new Dollar {
    override val amount = cents
  }
  val Cent = make(1)
  val Dollar = make(100)
  override val CurrencyUnit = Dollar
}

object Europe extends CurrencyZone {
  abstract class Euro extends AbstractCurrency {
    override def designation = "EUR"
  }
  override type Currency = Euro
  override def make(cents: Long) = new Euro {
    override val amount: Long = cents
  }
  val Cent = make(1)
  val Euro = make(100)
  override val CurrencyUnit = Euro
}

object Japan extends CurrencyZone {
  abstract class Yen extends AbstractCurrency {
    override def designation = "JPY"
  }
  override type Currency = Yen
  override def make(yen: Long) = new Yen {
    override val amount: Long = yen
  }
  val Yen = make(1)
  override val CurrencyUnit = Yen
}

object Converter {

  var exchangeRate = Map(
    "USD" -> Map("USD" -> 1.0 , "EUR" -> 0.7596,
                 "JPY" -> 1.211 , "CHF" -> 1.223),

    "EUR" -> Map("USD" -> 1.316 , "EUR" -> 1.0 ,
                 "JPY" -> 1.594 , "CHF" -> 1.623),

    "JPY" -> Map("USD" -> 0.8257, "EUR" -> 0.6272,
                 "JPY" -> 1.0 , "CHF" -> 1.018),

    "CHF" -> Map("USD" -> 0.8108, "EUR" -> 0.6160,
                 "JPY" -> 0.982 , "CHF" -> 1.0 )
  )

}