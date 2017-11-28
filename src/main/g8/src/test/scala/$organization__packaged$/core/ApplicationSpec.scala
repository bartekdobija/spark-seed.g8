package $organization$.core

import $organization$.SparkSpec

class ApplicationSpec extends SparkSpec {

  "Application" must "execute" in {
    Application(AppConf(_spark)).run()
  }

}
