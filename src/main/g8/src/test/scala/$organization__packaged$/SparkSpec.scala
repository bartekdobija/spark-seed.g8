package $organization$

import org.apache.spark.sql.SparkSession
import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}

trait SparkSpec extends FlatSpec with Matchers with BeforeAndAfterAll {

  lazy val _spark: SparkSession =
    SparkSession.builder.master("local[*]").getOrCreate()

  override def afterAll(): Unit = {
    _spark.stop
    super.afterAll()
  }

}
