import org.apache.spark.{SparkConf, SparkContext}

object SimpleProgram {
  def main(args:Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("SimpleProgram")

    val sc= new SparkContext(conf)
    /* rdd is a apache spark dataFrame */
    val rdd =  sc.parallelize(Array(5,10,30))

    println(rdd.reduce(_+_))
  }

}
