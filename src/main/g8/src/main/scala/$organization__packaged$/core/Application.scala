package $organization$.core

object Application {
  def apply(conf: AppConf): Application = new Application(conf)
}

class Application(private val conf: AppConf) {
  def run(): Unit = {
    val spark = conf.spark
    import spark.implicits._

    val ds = spark.createDataset(List(1,2,3))


  }
}
