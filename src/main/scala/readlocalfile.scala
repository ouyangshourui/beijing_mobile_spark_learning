
import org.apache.spark._

object readlocalfile {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("HdfsTest").setMaster("local")
    val sc = new SparkContext(sparkConf)
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val file = sqlContext.read.json("file:///Users/ouyangshourui/Desktop/" +
      "beijing_training/bigdatatraining/src/main/resources/people.json");
    file.show()
  }
}
