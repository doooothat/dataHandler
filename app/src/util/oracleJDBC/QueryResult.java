// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jul 20 07:54:29 GMT 2019
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("IF_SEQ", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IF_SEQ = (java.math.BigDecimal)value;
      }
    });
    setters.put("IF_DTM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        IF_DTM = (java.sql.Timestamp)value;
      }
    });
    setters.put("CITYCODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CITYCODE = (String)value;
      }
    });
    setters.put("LAT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LAT = (java.math.BigDecimal)value;
      }
    });
    setters.put("LON", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LON = (java.math.BigDecimal)value;
      }
    });
    setters.put("APLYMDT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        APLYMDT = (java.sql.Timestamp)value;
      }
    });
    setters.put("SKY_CODE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SKY_CODE = (java.math.BigDecimal)value;
      }
    });
    setters.put("TEMP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TEMP = (java.math.BigDecimal)value;
      }
    });
    setters.put("WINDDIR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDDIR = (String)value;
      }
    });
    setters.put("WINDSPD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDSPD = (java.math.BigDecimal)value;
      }
    });
    setters.put("RAIN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RAIN = (String)value;
      }
    });
    setters.put("HUMIDITY", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUMIDITY = (java.math.BigDecimal)value;
      }
    });
    setters.put("PM10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PM10 = (java.math.BigDecimal)value;
      }
    });
    setters.put("PM10_S", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PM10_S = (String)value;
      }
    });
    setters.put("SKY_CODE1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SKY_CODE1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("TEMP1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TEMP1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("WINDDIR1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDDIR1 = (String)value;
      }
    });
    setters.put("WINDSPD1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDSPD1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("RAIN1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RAIN1 = (String)value;
      }
    });
    setters.put("HUMIDITY1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUMIDITY1 = (java.math.BigDecimal)value;
      }
    });
    setters.put("SKY_CODE2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SKY_CODE2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("TEMP2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TEMP2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("WINDDIR2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDDIR2 = (String)value;
      }
    });
    setters.put("WINDSPD2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDSPD2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("RAIN2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RAIN2 = (String)value;
      }
    });
    setters.put("HUMIDITY2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUMIDITY2 = (java.math.BigDecimal)value;
      }
    });
    setters.put("SKY_CODE3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SKY_CODE3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("TEMP3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TEMP3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("WINDDIR3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDDIR3 = (String)value;
      }
    });
    setters.put("WINDSPD3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDSPD3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("RAIN3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RAIN3 = (String)value;
      }
    });
    setters.put("HUMIDITY3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUMIDITY3 = (java.math.BigDecimal)value;
      }
    });
    setters.put("SKY_CODE4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SKY_CODE4 = (java.math.BigDecimal)value;
      }
    });
    setters.put("TEMP4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TEMP4 = (java.math.BigDecimal)value;
      }
    });
    setters.put("WINDDIR4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDDIR4 = (String)value;
      }
    });
    setters.put("WINDSPD4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WINDSPD4 = (java.math.BigDecimal)value;
      }
    });
    setters.put("RAIN4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RAIN4 = (String)value;
      }
    });
    setters.put("HUMIDITY4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HUMIDITY4 = (java.math.BigDecimal)value;
      }
    });
    setters.put("ADDR1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADDR1 = (String)value;
      }
    });
    setters.put("ADDR2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADDR2 = (String)value;
      }
    });
    setters.put("ADDR3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADDR3 = (String)value;
      }
    });
    setters.put("PM25", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PM25 = (java.math.BigDecimal)value;
      }
    });
    setters.put("PM25_S", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PM25_S = (String)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private java.math.BigDecimal IF_SEQ;
  public java.math.BigDecimal get_IF_SEQ() {
    return IF_SEQ;
  }
  public void set_IF_SEQ(java.math.BigDecimal IF_SEQ) {
    this.IF_SEQ = IF_SEQ;
  }
  public QueryResult with_IF_SEQ(java.math.BigDecimal IF_SEQ) {
    this.IF_SEQ = IF_SEQ;
    return this;
  }
  private java.sql.Timestamp IF_DTM;
  public java.sql.Timestamp get_IF_DTM() {
    return IF_DTM;
  }
  public void set_IF_DTM(java.sql.Timestamp IF_DTM) {
    this.IF_DTM = IF_DTM;
  }
  public QueryResult with_IF_DTM(java.sql.Timestamp IF_DTM) {
    this.IF_DTM = IF_DTM;
    return this;
  }
  private String CITYCODE;
  public String get_CITYCODE() {
    return CITYCODE;
  }
  public void set_CITYCODE(String CITYCODE) {
    this.CITYCODE = CITYCODE;
  }
  public QueryResult with_CITYCODE(String CITYCODE) {
    this.CITYCODE = CITYCODE;
    return this;
  }
  private java.math.BigDecimal LAT;
  public java.math.BigDecimal get_LAT() {
    return LAT;
  }
  public void set_LAT(java.math.BigDecimal LAT) {
    this.LAT = LAT;
  }
  public QueryResult with_LAT(java.math.BigDecimal LAT) {
    this.LAT = LAT;
    return this;
  }
  private java.math.BigDecimal LON;
  public java.math.BigDecimal get_LON() {
    return LON;
  }
  public void set_LON(java.math.BigDecimal LON) {
    this.LON = LON;
  }
  public QueryResult with_LON(java.math.BigDecimal LON) {
    this.LON = LON;
    return this;
  }
  private java.sql.Timestamp APLYMDT;
  public java.sql.Timestamp get_APLYMDT() {
    return APLYMDT;
  }
  public void set_APLYMDT(java.sql.Timestamp APLYMDT) {
    this.APLYMDT = APLYMDT;
  }
  public QueryResult with_APLYMDT(java.sql.Timestamp APLYMDT) {
    this.APLYMDT = APLYMDT;
    return this;
  }
  private java.math.BigDecimal SKY_CODE;
  public java.math.BigDecimal get_SKY_CODE() {
    return SKY_CODE;
  }
  public void set_SKY_CODE(java.math.BigDecimal SKY_CODE) {
    this.SKY_CODE = SKY_CODE;
  }
  public QueryResult with_SKY_CODE(java.math.BigDecimal SKY_CODE) {
    this.SKY_CODE = SKY_CODE;
    return this;
  }
  private java.math.BigDecimal TEMP;
  public java.math.BigDecimal get_TEMP() {
    return TEMP;
  }
  public void set_TEMP(java.math.BigDecimal TEMP) {
    this.TEMP = TEMP;
  }
  public QueryResult with_TEMP(java.math.BigDecimal TEMP) {
    this.TEMP = TEMP;
    return this;
  }
  private String WINDDIR;
  public String get_WINDDIR() {
    return WINDDIR;
  }
  public void set_WINDDIR(String WINDDIR) {
    this.WINDDIR = WINDDIR;
  }
  public QueryResult with_WINDDIR(String WINDDIR) {
    this.WINDDIR = WINDDIR;
    return this;
  }
  private java.math.BigDecimal WINDSPD;
  public java.math.BigDecimal get_WINDSPD() {
    return WINDSPD;
  }
  public void set_WINDSPD(java.math.BigDecimal WINDSPD) {
    this.WINDSPD = WINDSPD;
  }
  public QueryResult with_WINDSPD(java.math.BigDecimal WINDSPD) {
    this.WINDSPD = WINDSPD;
    return this;
  }
  private String RAIN;
  public String get_RAIN() {
    return RAIN;
  }
  public void set_RAIN(String RAIN) {
    this.RAIN = RAIN;
  }
  public QueryResult with_RAIN(String RAIN) {
    this.RAIN = RAIN;
    return this;
  }
  private java.math.BigDecimal HUMIDITY;
  public java.math.BigDecimal get_HUMIDITY() {
    return HUMIDITY;
  }
  public void set_HUMIDITY(java.math.BigDecimal HUMIDITY) {
    this.HUMIDITY = HUMIDITY;
  }
  public QueryResult with_HUMIDITY(java.math.BigDecimal HUMIDITY) {
    this.HUMIDITY = HUMIDITY;
    return this;
  }
  private java.math.BigDecimal PM10;
  public java.math.BigDecimal get_PM10() {
    return PM10;
  }
  public void set_PM10(java.math.BigDecimal PM10) {
    this.PM10 = PM10;
  }
  public QueryResult with_PM10(java.math.BigDecimal PM10) {
    this.PM10 = PM10;
    return this;
  }
  private String PM10_S;
  public String get_PM10_S() {
    return PM10_S;
  }
  public void set_PM10_S(String PM10_S) {
    this.PM10_S = PM10_S;
  }
  public QueryResult with_PM10_S(String PM10_S) {
    this.PM10_S = PM10_S;
    return this;
  }
  private java.math.BigDecimal SKY_CODE1;
  public java.math.BigDecimal get_SKY_CODE1() {
    return SKY_CODE1;
  }
  public void set_SKY_CODE1(java.math.BigDecimal SKY_CODE1) {
    this.SKY_CODE1 = SKY_CODE1;
  }
  public QueryResult with_SKY_CODE1(java.math.BigDecimal SKY_CODE1) {
    this.SKY_CODE1 = SKY_CODE1;
    return this;
  }
  private java.math.BigDecimal TEMP1;
  public java.math.BigDecimal get_TEMP1() {
    return TEMP1;
  }
  public void set_TEMP1(java.math.BigDecimal TEMP1) {
    this.TEMP1 = TEMP1;
  }
  public QueryResult with_TEMP1(java.math.BigDecimal TEMP1) {
    this.TEMP1 = TEMP1;
    return this;
  }
  private String WINDDIR1;
  public String get_WINDDIR1() {
    return WINDDIR1;
  }
  public void set_WINDDIR1(String WINDDIR1) {
    this.WINDDIR1 = WINDDIR1;
  }
  public QueryResult with_WINDDIR1(String WINDDIR1) {
    this.WINDDIR1 = WINDDIR1;
    return this;
  }
  private java.math.BigDecimal WINDSPD1;
  public java.math.BigDecimal get_WINDSPD1() {
    return WINDSPD1;
  }
  public void set_WINDSPD1(java.math.BigDecimal WINDSPD1) {
    this.WINDSPD1 = WINDSPD1;
  }
  public QueryResult with_WINDSPD1(java.math.BigDecimal WINDSPD1) {
    this.WINDSPD1 = WINDSPD1;
    return this;
  }
  private String RAIN1;
  public String get_RAIN1() {
    return RAIN1;
  }
  public void set_RAIN1(String RAIN1) {
    this.RAIN1 = RAIN1;
  }
  public QueryResult with_RAIN1(String RAIN1) {
    this.RAIN1 = RAIN1;
    return this;
  }
  private java.math.BigDecimal HUMIDITY1;
  public java.math.BigDecimal get_HUMIDITY1() {
    return HUMIDITY1;
  }
  public void set_HUMIDITY1(java.math.BigDecimal HUMIDITY1) {
    this.HUMIDITY1 = HUMIDITY1;
  }
  public QueryResult with_HUMIDITY1(java.math.BigDecimal HUMIDITY1) {
    this.HUMIDITY1 = HUMIDITY1;
    return this;
  }
  private java.math.BigDecimal SKY_CODE2;
  public java.math.BigDecimal get_SKY_CODE2() {
    return SKY_CODE2;
  }
  public void set_SKY_CODE2(java.math.BigDecimal SKY_CODE2) {
    this.SKY_CODE2 = SKY_CODE2;
  }
  public QueryResult with_SKY_CODE2(java.math.BigDecimal SKY_CODE2) {
    this.SKY_CODE2 = SKY_CODE2;
    return this;
  }
  private java.math.BigDecimal TEMP2;
  public java.math.BigDecimal get_TEMP2() {
    return TEMP2;
  }
  public void set_TEMP2(java.math.BigDecimal TEMP2) {
    this.TEMP2 = TEMP2;
  }
  public QueryResult with_TEMP2(java.math.BigDecimal TEMP2) {
    this.TEMP2 = TEMP2;
    return this;
  }
  private String WINDDIR2;
  public String get_WINDDIR2() {
    return WINDDIR2;
  }
  public void set_WINDDIR2(String WINDDIR2) {
    this.WINDDIR2 = WINDDIR2;
  }
  public QueryResult with_WINDDIR2(String WINDDIR2) {
    this.WINDDIR2 = WINDDIR2;
    return this;
  }
  private java.math.BigDecimal WINDSPD2;
  public java.math.BigDecimal get_WINDSPD2() {
    return WINDSPD2;
  }
  public void set_WINDSPD2(java.math.BigDecimal WINDSPD2) {
    this.WINDSPD2 = WINDSPD2;
  }
  public QueryResult with_WINDSPD2(java.math.BigDecimal WINDSPD2) {
    this.WINDSPD2 = WINDSPD2;
    return this;
  }
  private String RAIN2;
  public String get_RAIN2() {
    return RAIN2;
  }
  public void set_RAIN2(String RAIN2) {
    this.RAIN2 = RAIN2;
  }
  public QueryResult with_RAIN2(String RAIN2) {
    this.RAIN2 = RAIN2;
    return this;
  }
  private java.math.BigDecimal HUMIDITY2;
  public java.math.BigDecimal get_HUMIDITY2() {
    return HUMIDITY2;
  }
  public void set_HUMIDITY2(java.math.BigDecimal HUMIDITY2) {
    this.HUMIDITY2 = HUMIDITY2;
  }
  public QueryResult with_HUMIDITY2(java.math.BigDecimal HUMIDITY2) {
    this.HUMIDITY2 = HUMIDITY2;
    return this;
  }
  private java.math.BigDecimal SKY_CODE3;
  public java.math.BigDecimal get_SKY_CODE3() {
    return SKY_CODE3;
  }
  public void set_SKY_CODE3(java.math.BigDecimal SKY_CODE3) {
    this.SKY_CODE3 = SKY_CODE3;
  }
  public QueryResult with_SKY_CODE3(java.math.BigDecimal SKY_CODE3) {
    this.SKY_CODE3 = SKY_CODE3;
    return this;
  }
  private java.math.BigDecimal TEMP3;
  public java.math.BigDecimal get_TEMP3() {
    return TEMP3;
  }
  public void set_TEMP3(java.math.BigDecimal TEMP3) {
    this.TEMP3 = TEMP3;
  }
  public QueryResult with_TEMP3(java.math.BigDecimal TEMP3) {
    this.TEMP3 = TEMP3;
    return this;
  }
  private String WINDDIR3;
  public String get_WINDDIR3() {
    return WINDDIR3;
  }
  public void set_WINDDIR3(String WINDDIR3) {
    this.WINDDIR3 = WINDDIR3;
  }
  public QueryResult with_WINDDIR3(String WINDDIR3) {
    this.WINDDIR3 = WINDDIR3;
    return this;
  }
  private java.math.BigDecimal WINDSPD3;
  public java.math.BigDecimal get_WINDSPD3() {
    return WINDSPD3;
  }
  public void set_WINDSPD3(java.math.BigDecimal WINDSPD3) {
    this.WINDSPD3 = WINDSPD3;
  }
  public QueryResult with_WINDSPD3(java.math.BigDecimal WINDSPD3) {
    this.WINDSPD3 = WINDSPD3;
    return this;
  }
  private String RAIN3;
  public String get_RAIN3() {
    return RAIN3;
  }
  public void set_RAIN3(String RAIN3) {
    this.RAIN3 = RAIN3;
  }
  public QueryResult with_RAIN3(String RAIN3) {
    this.RAIN3 = RAIN3;
    return this;
  }
  private java.math.BigDecimal HUMIDITY3;
  public java.math.BigDecimal get_HUMIDITY3() {
    return HUMIDITY3;
  }
  public void set_HUMIDITY3(java.math.BigDecimal HUMIDITY3) {
    this.HUMIDITY3 = HUMIDITY3;
  }
  public QueryResult with_HUMIDITY3(java.math.BigDecimal HUMIDITY3) {
    this.HUMIDITY3 = HUMIDITY3;
    return this;
  }
  private java.math.BigDecimal SKY_CODE4;
  public java.math.BigDecimal get_SKY_CODE4() {
    return SKY_CODE4;
  }
  public void set_SKY_CODE4(java.math.BigDecimal SKY_CODE4) {
    this.SKY_CODE4 = SKY_CODE4;
  }
  public QueryResult with_SKY_CODE4(java.math.BigDecimal SKY_CODE4) {
    this.SKY_CODE4 = SKY_CODE4;
    return this;
  }
  private java.math.BigDecimal TEMP4;
  public java.math.BigDecimal get_TEMP4() {
    return TEMP4;
  }
  public void set_TEMP4(java.math.BigDecimal TEMP4) {
    this.TEMP4 = TEMP4;
  }
  public QueryResult with_TEMP4(java.math.BigDecimal TEMP4) {
    this.TEMP4 = TEMP4;
    return this;
  }
  private String WINDDIR4;
  public String get_WINDDIR4() {
    return WINDDIR4;
  }
  public void set_WINDDIR4(String WINDDIR4) {
    this.WINDDIR4 = WINDDIR4;
  }
  public QueryResult with_WINDDIR4(String WINDDIR4) {
    this.WINDDIR4 = WINDDIR4;
    return this;
  }
  private java.math.BigDecimal WINDSPD4;
  public java.math.BigDecimal get_WINDSPD4() {
    return WINDSPD4;
  }
  public void set_WINDSPD4(java.math.BigDecimal WINDSPD4) {
    this.WINDSPD4 = WINDSPD4;
  }
  public QueryResult with_WINDSPD4(java.math.BigDecimal WINDSPD4) {
    this.WINDSPD4 = WINDSPD4;
    return this;
  }
  private String RAIN4;
  public String get_RAIN4() {
    return RAIN4;
  }
  public void set_RAIN4(String RAIN4) {
    this.RAIN4 = RAIN4;
  }
  public QueryResult with_RAIN4(String RAIN4) {
    this.RAIN4 = RAIN4;
    return this;
  }
  private java.math.BigDecimal HUMIDITY4;
  public java.math.BigDecimal get_HUMIDITY4() {
    return HUMIDITY4;
  }
  public void set_HUMIDITY4(java.math.BigDecimal HUMIDITY4) {
    this.HUMIDITY4 = HUMIDITY4;
  }
  public QueryResult with_HUMIDITY4(java.math.BigDecimal HUMIDITY4) {
    this.HUMIDITY4 = HUMIDITY4;
    return this;
  }
  private String ADDR1;
  public String get_ADDR1() {
    return ADDR1;
  }
  public void set_ADDR1(String ADDR1) {
    this.ADDR1 = ADDR1;
  }
  public QueryResult with_ADDR1(String ADDR1) {
    this.ADDR1 = ADDR1;
    return this;
  }
  private String ADDR2;
  public String get_ADDR2() {
    return ADDR2;
  }
  public void set_ADDR2(String ADDR2) {
    this.ADDR2 = ADDR2;
  }
  public QueryResult with_ADDR2(String ADDR2) {
    this.ADDR2 = ADDR2;
    return this;
  }
  private String ADDR3;
  public String get_ADDR3() {
    return ADDR3;
  }
  public void set_ADDR3(String ADDR3) {
    this.ADDR3 = ADDR3;
  }
  public QueryResult with_ADDR3(String ADDR3) {
    this.ADDR3 = ADDR3;
    return this;
  }
  private java.math.BigDecimal PM25;
  public java.math.BigDecimal get_PM25() {
    return PM25;
  }
  public void set_PM25(java.math.BigDecimal PM25) {
    this.PM25 = PM25;
  }
  public QueryResult with_PM25(java.math.BigDecimal PM25) {
    this.PM25 = PM25;
    return this;
  }
  private String PM25_S;
  public String get_PM25_S() {
    return PM25_S;
  }
  public void set_PM25_S(String PM25_S) {
    this.PM25_S = PM25_S;
  }
  public QueryResult with_PM25_S(String PM25_S) {
    this.PM25_S = PM25_S;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.IF_SEQ == null ? that.IF_SEQ == null : this.IF_SEQ.equals(that.IF_SEQ));
    equal = equal && (this.IF_DTM == null ? that.IF_DTM == null : this.IF_DTM.equals(that.IF_DTM));
    equal = equal && (this.CITYCODE == null ? that.CITYCODE == null : this.CITYCODE.equals(that.CITYCODE));
    equal = equal && (this.LAT == null ? that.LAT == null : this.LAT.equals(that.LAT));
    equal = equal && (this.LON == null ? that.LON == null : this.LON.equals(that.LON));
    equal = equal && (this.APLYMDT == null ? that.APLYMDT == null : this.APLYMDT.equals(that.APLYMDT));
    equal = equal && (this.SKY_CODE == null ? that.SKY_CODE == null : this.SKY_CODE.equals(that.SKY_CODE));
    equal = equal && (this.TEMP == null ? that.TEMP == null : this.TEMP.equals(that.TEMP));
    equal = equal && (this.WINDDIR == null ? that.WINDDIR == null : this.WINDDIR.equals(that.WINDDIR));
    equal = equal && (this.WINDSPD == null ? that.WINDSPD == null : this.WINDSPD.equals(that.WINDSPD));
    equal = equal && (this.RAIN == null ? that.RAIN == null : this.RAIN.equals(that.RAIN));
    equal = equal && (this.HUMIDITY == null ? that.HUMIDITY == null : this.HUMIDITY.equals(that.HUMIDITY));
    equal = equal && (this.PM10 == null ? that.PM10 == null : this.PM10.equals(that.PM10));
    equal = equal && (this.PM10_S == null ? that.PM10_S == null : this.PM10_S.equals(that.PM10_S));
    equal = equal && (this.SKY_CODE1 == null ? that.SKY_CODE1 == null : this.SKY_CODE1.equals(that.SKY_CODE1));
    equal = equal && (this.TEMP1 == null ? that.TEMP1 == null : this.TEMP1.equals(that.TEMP1));
    equal = equal && (this.WINDDIR1 == null ? that.WINDDIR1 == null : this.WINDDIR1.equals(that.WINDDIR1));
    equal = equal && (this.WINDSPD1 == null ? that.WINDSPD1 == null : this.WINDSPD1.equals(that.WINDSPD1));
    equal = equal && (this.RAIN1 == null ? that.RAIN1 == null : this.RAIN1.equals(that.RAIN1));
    equal = equal && (this.HUMIDITY1 == null ? that.HUMIDITY1 == null : this.HUMIDITY1.equals(that.HUMIDITY1));
    equal = equal && (this.SKY_CODE2 == null ? that.SKY_CODE2 == null : this.SKY_CODE2.equals(that.SKY_CODE2));
    equal = equal && (this.TEMP2 == null ? that.TEMP2 == null : this.TEMP2.equals(that.TEMP2));
    equal = equal && (this.WINDDIR2 == null ? that.WINDDIR2 == null : this.WINDDIR2.equals(that.WINDDIR2));
    equal = equal && (this.WINDSPD2 == null ? that.WINDSPD2 == null : this.WINDSPD2.equals(that.WINDSPD2));
    equal = equal && (this.RAIN2 == null ? that.RAIN2 == null : this.RAIN2.equals(that.RAIN2));
    equal = equal && (this.HUMIDITY2 == null ? that.HUMIDITY2 == null : this.HUMIDITY2.equals(that.HUMIDITY2));
    equal = equal && (this.SKY_CODE3 == null ? that.SKY_CODE3 == null : this.SKY_CODE3.equals(that.SKY_CODE3));
    equal = equal && (this.TEMP3 == null ? that.TEMP3 == null : this.TEMP3.equals(that.TEMP3));
    equal = equal && (this.WINDDIR3 == null ? that.WINDDIR3 == null : this.WINDDIR3.equals(that.WINDDIR3));
    equal = equal && (this.WINDSPD3 == null ? that.WINDSPD3 == null : this.WINDSPD3.equals(that.WINDSPD3));
    equal = equal && (this.RAIN3 == null ? that.RAIN3 == null : this.RAIN3.equals(that.RAIN3));
    equal = equal && (this.HUMIDITY3 == null ? that.HUMIDITY3 == null : this.HUMIDITY3.equals(that.HUMIDITY3));
    equal = equal && (this.SKY_CODE4 == null ? that.SKY_CODE4 == null : this.SKY_CODE4.equals(that.SKY_CODE4));
    equal = equal && (this.TEMP4 == null ? that.TEMP4 == null : this.TEMP4.equals(that.TEMP4));
    equal = equal && (this.WINDDIR4 == null ? that.WINDDIR4 == null : this.WINDDIR4.equals(that.WINDDIR4));
    equal = equal && (this.WINDSPD4 == null ? that.WINDSPD4 == null : this.WINDSPD4.equals(that.WINDSPD4));
    equal = equal && (this.RAIN4 == null ? that.RAIN4 == null : this.RAIN4.equals(that.RAIN4));
    equal = equal && (this.HUMIDITY4 == null ? that.HUMIDITY4 == null : this.HUMIDITY4.equals(that.HUMIDITY4));
    equal = equal && (this.ADDR1 == null ? that.ADDR1 == null : this.ADDR1.equals(that.ADDR1));
    equal = equal && (this.ADDR2 == null ? that.ADDR2 == null : this.ADDR2.equals(that.ADDR2));
    equal = equal && (this.ADDR3 == null ? that.ADDR3 == null : this.ADDR3.equals(that.ADDR3));
    equal = equal && (this.PM25 == null ? that.PM25 == null : this.PM25.equals(that.PM25));
    equal = equal && (this.PM25_S == null ? that.PM25_S == null : this.PM25_S.equals(that.PM25_S));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.IF_SEQ == null ? that.IF_SEQ == null : this.IF_SEQ.equals(that.IF_SEQ));
    equal = equal && (this.IF_DTM == null ? that.IF_DTM == null : this.IF_DTM.equals(that.IF_DTM));
    equal = equal && (this.CITYCODE == null ? that.CITYCODE == null : this.CITYCODE.equals(that.CITYCODE));
    equal = equal && (this.LAT == null ? that.LAT == null : this.LAT.equals(that.LAT));
    equal = equal && (this.LON == null ? that.LON == null : this.LON.equals(that.LON));
    equal = equal && (this.APLYMDT == null ? that.APLYMDT == null : this.APLYMDT.equals(that.APLYMDT));
    equal = equal && (this.SKY_CODE == null ? that.SKY_CODE == null : this.SKY_CODE.equals(that.SKY_CODE));
    equal = equal && (this.TEMP == null ? that.TEMP == null : this.TEMP.equals(that.TEMP));
    equal = equal && (this.WINDDIR == null ? that.WINDDIR == null : this.WINDDIR.equals(that.WINDDIR));
    equal = equal && (this.WINDSPD == null ? that.WINDSPD == null : this.WINDSPD.equals(that.WINDSPD));
    equal = equal && (this.RAIN == null ? that.RAIN == null : this.RAIN.equals(that.RAIN));
    equal = equal && (this.HUMIDITY == null ? that.HUMIDITY == null : this.HUMIDITY.equals(that.HUMIDITY));
    equal = equal && (this.PM10 == null ? that.PM10 == null : this.PM10.equals(that.PM10));
    equal = equal && (this.PM10_S == null ? that.PM10_S == null : this.PM10_S.equals(that.PM10_S));
    equal = equal && (this.SKY_CODE1 == null ? that.SKY_CODE1 == null : this.SKY_CODE1.equals(that.SKY_CODE1));
    equal = equal && (this.TEMP1 == null ? that.TEMP1 == null : this.TEMP1.equals(that.TEMP1));
    equal = equal && (this.WINDDIR1 == null ? that.WINDDIR1 == null : this.WINDDIR1.equals(that.WINDDIR1));
    equal = equal && (this.WINDSPD1 == null ? that.WINDSPD1 == null : this.WINDSPD1.equals(that.WINDSPD1));
    equal = equal && (this.RAIN1 == null ? that.RAIN1 == null : this.RAIN1.equals(that.RAIN1));
    equal = equal && (this.HUMIDITY1 == null ? that.HUMIDITY1 == null : this.HUMIDITY1.equals(that.HUMIDITY1));
    equal = equal && (this.SKY_CODE2 == null ? that.SKY_CODE2 == null : this.SKY_CODE2.equals(that.SKY_CODE2));
    equal = equal && (this.TEMP2 == null ? that.TEMP2 == null : this.TEMP2.equals(that.TEMP2));
    equal = equal && (this.WINDDIR2 == null ? that.WINDDIR2 == null : this.WINDDIR2.equals(that.WINDDIR2));
    equal = equal && (this.WINDSPD2 == null ? that.WINDSPD2 == null : this.WINDSPD2.equals(that.WINDSPD2));
    equal = equal && (this.RAIN2 == null ? that.RAIN2 == null : this.RAIN2.equals(that.RAIN2));
    equal = equal && (this.HUMIDITY2 == null ? that.HUMIDITY2 == null : this.HUMIDITY2.equals(that.HUMIDITY2));
    equal = equal && (this.SKY_CODE3 == null ? that.SKY_CODE3 == null : this.SKY_CODE3.equals(that.SKY_CODE3));
    equal = equal && (this.TEMP3 == null ? that.TEMP3 == null : this.TEMP3.equals(that.TEMP3));
    equal = equal && (this.WINDDIR3 == null ? that.WINDDIR3 == null : this.WINDDIR3.equals(that.WINDDIR3));
    equal = equal && (this.WINDSPD3 == null ? that.WINDSPD3 == null : this.WINDSPD3.equals(that.WINDSPD3));
    equal = equal && (this.RAIN3 == null ? that.RAIN3 == null : this.RAIN3.equals(that.RAIN3));
    equal = equal && (this.HUMIDITY3 == null ? that.HUMIDITY3 == null : this.HUMIDITY3.equals(that.HUMIDITY3));
    equal = equal && (this.SKY_CODE4 == null ? that.SKY_CODE4 == null : this.SKY_CODE4.equals(that.SKY_CODE4));
    equal = equal && (this.TEMP4 == null ? that.TEMP4 == null : this.TEMP4.equals(that.TEMP4));
    equal = equal && (this.WINDDIR4 == null ? that.WINDDIR4 == null : this.WINDDIR4.equals(that.WINDDIR4));
    equal = equal && (this.WINDSPD4 == null ? that.WINDSPD4 == null : this.WINDSPD4.equals(that.WINDSPD4));
    equal = equal && (this.RAIN4 == null ? that.RAIN4 == null : this.RAIN4.equals(that.RAIN4));
    equal = equal && (this.HUMIDITY4 == null ? that.HUMIDITY4 == null : this.HUMIDITY4.equals(that.HUMIDITY4));
    equal = equal && (this.ADDR1 == null ? that.ADDR1 == null : this.ADDR1.equals(that.ADDR1));
    equal = equal && (this.ADDR2 == null ? that.ADDR2 == null : this.ADDR2.equals(that.ADDR2));
    equal = equal && (this.ADDR3 == null ? that.ADDR3 == null : this.ADDR3.equals(that.ADDR3));
    equal = equal && (this.PM25 == null ? that.PM25 == null : this.PM25.equals(that.PM25));
    equal = equal && (this.PM25_S == null ? that.PM25_S == null : this.PM25_S.equals(that.PM25_S));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.IF_SEQ = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.IF_DTM = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.CITYCODE = JdbcWritableBridge.readString(3, __dbResults);
    this.LAT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.LON = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.APLYMDT = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.SKY_CODE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.TEMP = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.WINDDIR = JdbcWritableBridge.readString(9, __dbResults);
    this.WINDSPD = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.RAIN = JdbcWritableBridge.readString(11, __dbResults);
    this.HUMIDITY = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.PM10 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.PM10_S = JdbcWritableBridge.readString(14, __dbResults);
    this.SKY_CODE1 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.TEMP1 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.WINDDIR1 = JdbcWritableBridge.readString(17, __dbResults);
    this.WINDSPD1 = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.RAIN1 = JdbcWritableBridge.readString(19, __dbResults);
    this.HUMIDITY1 = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.SKY_CODE2 = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.TEMP2 = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.WINDDIR2 = JdbcWritableBridge.readString(23, __dbResults);
    this.WINDSPD2 = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.RAIN2 = JdbcWritableBridge.readString(25, __dbResults);
    this.HUMIDITY2 = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.SKY_CODE3 = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.TEMP3 = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.WINDDIR3 = JdbcWritableBridge.readString(29, __dbResults);
    this.WINDSPD3 = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.RAIN3 = JdbcWritableBridge.readString(31, __dbResults);
    this.HUMIDITY3 = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.SKY_CODE4 = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.TEMP4 = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.WINDDIR4 = JdbcWritableBridge.readString(35, __dbResults);
    this.WINDSPD4 = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.RAIN4 = JdbcWritableBridge.readString(37, __dbResults);
    this.HUMIDITY4 = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.ADDR1 = JdbcWritableBridge.readString(39, __dbResults);
    this.ADDR2 = JdbcWritableBridge.readString(40, __dbResults);
    this.ADDR3 = JdbcWritableBridge.readString(41, __dbResults);
    this.PM25 = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.PM25_S = JdbcWritableBridge.readString(43, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.IF_SEQ = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.IF_DTM = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.CITYCODE = JdbcWritableBridge.readString(3, __dbResults);
    this.LAT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.LON = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.APLYMDT = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.SKY_CODE = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.TEMP = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.WINDDIR = JdbcWritableBridge.readString(9, __dbResults);
    this.WINDSPD = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.RAIN = JdbcWritableBridge.readString(11, __dbResults);
    this.HUMIDITY = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.PM10 = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.PM10_S = JdbcWritableBridge.readString(14, __dbResults);
    this.SKY_CODE1 = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.TEMP1 = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.WINDDIR1 = JdbcWritableBridge.readString(17, __dbResults);
    this.WINDSPD1 = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.RAIN1 = JdbcWritableBridge.readString(19, __dbResults);
    this.HUMIDITY1 = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.SKY_CODE2 = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.TEMP2 = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.WINDDIR2 = JdbcWritableBridge.readString(23, __dbResults);
    this.WINDSPD2 = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.RAIN2 = JdbcWritableBridge.readString(25, __dbResults);
    this.HUMIDITY2 = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.SKY_CODE3 = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.TEMP3 = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.WINDDIR3 = JdbcWritableBridge.readString(29, __dbResults);
    this.WINDSPD3 = JdbcWritableBridge.readBigDecimal(30, __dbResults);
    this.RAIN3 = JdbcWritableBridge.readString(31, __dbResults);
    this.HUMIDITY3 = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.SKY_CODE4 = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.TEMP4 = JdbcWritableBridge.readBigDecimal(34, __dbResults);
    this.WINDDIR4 = JdbcWritableBridge.readString(35, __dbResults);
    this.WINDSPD4 = JdbcWritableBridge.readBigDecimal(36, __dbResults);
    this.RAIN4 = JdbcWritableBridge.readString(37, __dbResults);
    this.HUMIDITY4 = JdbcWritableBridge.readBigDecimal(38, __dbResults);
    this.ADDR1 = JdbcWritableBridge.readString(39, __dbResults);
    this.ADDR2 = JdbcWritableBridge.readString(40, __dbResults);
    this.ADDR3 = JdbcWritableBridge.readString(41, __dbResults);
    this.PM25 = JdbcWritableBridge.readBigDecimal(42, __dbResults);
    this.PM25_S = JdbcWritableBridge.readString(43, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(IF_SEQ, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(IF_DTM, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CITYCODE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAT, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LON, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(APLYMDT, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PM10, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PM10_S, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE1, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP1, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR1, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD1, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN1, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY1, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE2, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP2, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR2, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD2, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN2, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY2, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE3, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP3, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR3, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD3, 30 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN3, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY3, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE4, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP4, 34 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR4, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD4, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN4, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY4, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ADDR1, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDR2, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDR3, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PM25, 42 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PM25_S, 43 + __off, 12, __dbStmt);
    return 43;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(IF_SEQ, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(IF_DTM, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(CITYCODE, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LAT, 4 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(LON, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(APLYMDT, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PM10, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PM10_S, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE1, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP1, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR1, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD1, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN1, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY1, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE2, 21 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP2, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR2, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD2, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN2, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY2, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE3, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP3, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR3, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD3, 30 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN3, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY3, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SKY_CODE4, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TEMP4, 34 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(WINDDIR4, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WINDSPD4, 36 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(RAIN4, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HUMIDITY4, 38 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ADDR1, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDR2, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ADDR3, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PM25, 42 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PM25_S, 43 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.IF_SEQ = null;
    } else {
    this.IF_SEQ = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IF_DTM = null;
    } else {
    this.IF_DTM = new Timestamp(__dataIn.readLong());
    this.IF_DTM.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CITYCODE = null;
    } else {
    this.CITYCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAT = null;
    } else {
    this.LAT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LON = null;
    } else {
    this.LON = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.APLYMDT = null;
    } else {
    this.APLYMDT = new Timestamp(__dataIn.readLong());
    this.APLYMDT.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SKY_CODE = null;
    } else {
    this.SKY_CODE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TEMP = null;
    } else {
    this.TEMP = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDDIR = null;
    } else {
    this.WINDDIR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDSPD = null;
    } else {
    this.WINDSPD = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RAIN = null;
    } else {
    this.RAIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUMIDITY = null;
    } else {
    this.HUMIDITY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PM10 = null;
    } else {
    this.PM10 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PM10_S = null;
    } else {
    this.PM10_S = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SKY_CODE1 = null;
    } else {
    this.SKY_CODE1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TEMP1 = null;
    } else {
    this.TEMP1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDDIR1 = null;
    } else {
    this.WINDDIR1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDSPD1 = null;
    } else {
    this.WINDSPD1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RAIN1 = null;
    } else {
    this.RAIN1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUMIDITY1 = null;
    } else {
    this.HUMIDITY1 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SKY_CODE2 = null;
    } else {
    this.SKY_CODE2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TEMP2 = null;
    } else {
    this.TEMP2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDDIR2 = null;
    } else {
    this.WINDDIR2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDSPD2 = null;
    } else {
    this.WINDSPD2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RAIN2 = null;
    } else {
    this.RAIN2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUMIDITY2 = null;
    } else {
    this.HUMIDITY2 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SKY_CODE3 = null;
    } else {
    this.SKY_CODE3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TEMP3 = null;
    } else {
    this.TEMP3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDDIR3 = null;
    } else {
    this.WINDDIR3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDSPD3 = null;
    } else {
    this.WINDSPD3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RAIN3 = null;
    } else {
    this.RAIN3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUMIDITY3 = null;
    } else {
    this.HUMIDITY3 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SKY_CODE4 = null;
    } else {
    this.SKY_CODE4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TEMP4 = null;
    } else {
    this.TEMP4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDDIR4 = null;
    } else {
    this.WINDDIR4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WINDSPD4 = null;
    } else {
    this.WINDSPD4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RAIN4 = null;
    } else {
    this.RAIN4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HUMIDITY4 = null;
    } else {
    this.HUMIDITY4 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDR1 = null;
    } else {
    this.ADDR1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDR2 = null;
    } else {
    this.ADDR2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDR3 = null;
    } else {
    this.ADDR3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PM25 = null;
    } else {
    this.PM25 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PM25_S = null;
    } else {
    this.PM25_S = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.IF_SEQ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IF_SEQ, __dataOut);
    }
    if (null == this.IF_DTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.IF_DTM.getTime());
    __dataOut.writeInt(this.IF_DTM.getNanos());
    }
    if (null == this.CITYCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITYCODE);
    }
    if (null == this.LAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAT, __dataOut);
    }
    if (null == this.LON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LON, __dataOut);
    }
    if (null == this.APLYMDT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.APLYMDT.getTime());
    __dataOut.writeInt(this.APLYMDT.getNanos());
    }
    if (null == this.SKY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE, __dataOut);
    }
    if (null == this.TEMP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP, __dataOut);
    }
    if (null == this.WINDDIR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR);
    }
    if (null == this.WINDSPD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD, __dataOut);
    }
    if (null == this.RAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN);
    }
    if (null == this.HUMIDITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY, __dataOut);
    }
    if (null == this.PM10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PM10, __dataOut);
    }
    if (null == this.PM10_S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PM10_S);
    }
    if (null == this.SKY_CODE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE1, __dataOut);
    }
    if (null == this.TEMP1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP1, __dataOut);
    }
    if (null == this.WINDDIR1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR1);
    }
    if (null == this.WINDSPD1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD1, __dataOut);
    }
    if (null == this.RAIN1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN1);
    }
    if (null == this.HUMIDITY1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY1, __dataOut);
    }
    if (null == this.SKY_CODE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE2, __dataOut);
    }
    if (null == this.TEMP2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP2, __dataOut);
    }
    if (null == this.WINDDIR2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR2);
    }
    if (null == this.WINDSPD2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD2, __dataOut);
    }
    if (null == this.RAIN2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN2);
    }
    if (null == this.HUMIDITY2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY2, __dataOut);
    }
    if (null == this.SKY_CODE3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE3, __dataOut);
    }
    if (null == this.TEMP3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP3, __dataOut);
    }
    if (null == this.WINDDIR3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR3);
    }
    if (null == this.WINDSPD3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD3, __dataOut);
    }
    if (null == this.RAIN3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN3);
    }
    if (null == this.HUMIDITY3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY3, __dataOut);
    }
    if (null == this.SKY_CODE4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE4, __dataOut);
    }
    if (null == this.TEMP4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP4, __dataOut);
    }
    if (null == this.WINDDIR4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR4);
    }
    if (null == this.WINDSPD4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD4, __dataOut);
    }
    if (null == this.RAIN4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN4);
    }
    if (null == this.HUMIDITY4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY4, __dataOut);
    }
    if (null == this.ADDR1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR1);
    }
    if (null == this.ADDR2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR2);
    }
    if (null == this.ADDR3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR3);
    }
    if (null == this.PM25) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PM25, __dataOut);
    }
    if (null == this.PM25_S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PM25_S);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.IF_SEQ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.IF_SEQ, __dataOut);
    }
    if (null == this.IF_DTM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.IF_DTM.getTime());
    __dataOut.writeInt(this.IF_DTM.getNanos());
    }
    if (null == this.CITYCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CITYCODE);
    }
    if (null == this.LAT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LAT, __dataOut);
    }
    if (null == this.LON) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.LON, __dataOut);
    }
    if (null == this.APLYMDT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.APLYMDT.getTime());
    __dataOut.writeInt(this.APLYMDT.getNanos());
    }
    if (null == this.SKY_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE, __dataOut);
    }
    if (null == this.TEMP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP, __dataOut);
    }
    if (null == this.WINDDIR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR);
    }
    if (null == this.WINDSPD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD, __dataOut);
    }
    if (null == this.RAIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN);
    }
    if (null == this.HUMIDITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY, __dataOut);
    }
    if (null == this.PM10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PM10, __dataOut);
    }
    if (null == this.PM10_S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PM10_S);
    }
    if (null == this.SKY_CODE1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE1, __dataOut);
    }
    if (null == this.TEMP1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP1, __dataOut);
    }
    if (null == this.WINDDIR1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR1);
    }
    if (null == this.WINDSPD1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD1, __dataOut);
    }
    if (null == this.RAIN1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN1);
    }
    if (null == this.HUMIDITY1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY1, __dataOut);
    }
    if (null == this.SKY_CODE2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE2, __dataOut);
    }
    if (null == this.TEMP2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP2, __dataOut);
    }
    if (null == this.WINDDIR2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR2);
    }
    if (null == this.WINDSPD2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD2, __dataOut);
    }
    if (null == this.RAIN2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN2);
    }
    if (null == this.HUMIDITY2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY2, __dataOut);
    }
    if (null == this.SKY_CODE3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE3, __dataOut);
    }
    if (null == this.TEMP3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP3, __dataOut);
    }
    if (null == this.WINDDIR3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR3);
    }
    if (null == this.WINDSPD3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD3, __dataOut);
    }
    if (null == this.RAIN3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN3);
    }
    if (null == this.HUMIDITY3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY3, __dataOut);
    }
    if (null == this.SKY_CODE4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SKY_CODE4, __dataOut);
    }
    if (null == this.TEMP4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TEMP4, __dataOut);
    }
    if (null == this.WINDDIR4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WINDDIR4);
    }
    if (null == this.WINDSPD4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WINDSPD4, __dataOut);
    }
    if (null == this.RAIN4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RAIN4);
    }
    if (null == this.HUMIDITY4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HUMIDITY4, __dataOut);
    }
    if (null == this.ADDR1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR1);
    }
    if (null == this.ADDR2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR2);
    }
    if (null == this.ADDR3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDR3);
    }
    if (null == this.PM25) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PM25, __dataOut);
    }
    if (null == this.PM25_S) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PM25_S);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(IF_SEQ==null?"null":IF_SEQ.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IF_DTM==null?"null":"" + IF_DTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITYCODE==null?"null":CITYCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAT==null?"null":LAT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LON==null?"null":LON.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(APLYMDT==null?"null":"" + APLYMDT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE==null?"null":SKY_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP==null?"null":TEMP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR==null?"null":WINDDIR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD==null?"null":WINDSPD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN==null?"null":RAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY==null?"null":HUMIDITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM10==null?"null":PM10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM10_S==null?"null":PM10_S, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE1==null?"null":SKY_CODE1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP1==null?"null":TEMP1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR1==null?"null":WINDDIR1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD1==null?"null":WINDSPD1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN1==null?"null":RAIN1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY1==null?"null":HUMIDITY1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE2==null?"null":SKY_CODE2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP2==null?"null":TEMP2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR2==null?"null":WINDDIR2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD2==null?"null":WINDSPD2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN2==null?"null":RAIN2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY2==null?"null":HUMIDITY2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE3==null?"null":SKY_CODE3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP3==null?"null":TEMP3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR3==null?"null":WINDDIR3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD3==null?"null":WINDSPD3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN3==null?"null":RAIN3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY3==null?"null":HUMIDITY3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE4==null?"null":SKY_CODE4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP4==null?"null":TEMP4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR4==null?"null":WINDDIR4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD4==null?"null":WINDSPD4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN4==null?"null":RAIN4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY4==null?"null":HUMIDITY4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR1==null?"null":ADDR1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR2==null?"null":ADDR2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR3==null?"null":ADDR3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM25==null?"null":PM25.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM25_S==null?"null":PM25_S, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(IF_SEQ==null?"null":IF_SEQ.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IF_DTM==null?"null":"" + IF_DTM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CITYCODE==null?"null":CITYCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAT==null?"null":LAT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LON==null?"null":LON.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(APLYMDT==null?"null":"" + APLYMDT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE==null?"null":SKY_CODE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP==null?"null":TEMP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR==null?"null":WINDDIR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD==null?"null":WINDSPD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN==null?"null":RAIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY==null?"null":HUMIDITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM10==null?"null":PM10.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM10_S==null?"null":PM10_S, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE1==null?"null":SKY_CODE1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP1==null?"null":TEMP1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR1==null?"null":WINDDIR1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD1==null?"null":WINDSPD1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN1==null?"null":RAIN1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY1==null?"null":HUMIDITY1.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE2==null?"null":SKY_CODE2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP2==null?"null":TEMP2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR2==null?"null":WINDDIR2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD2==null?"null":WINDSPD2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN2==null?"null":RAIN2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY2==null?"null":HUMIDITY2.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE3==null?"null":SKY_CODE3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP3==null?"null":TEMP3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR3==null?"null":WINDDIR3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD3==null?"null":WINDSPD3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN3==null?"null":RAIN3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY3==null?"null":HUMIDITY3.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKY_CODE4==null?"null":SKY_CODE4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TEMP4==null?"null":TEMP4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDDIR4==null?"null":WINDDIR4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WINDSPD4==null?"null":WINDSPD4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RAIN4==null?"null":RAIN4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HUMIDITY4==null?"null":HUMIDITY4.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR1==null?"null":ADDR1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR2==null?"null":ADDR2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDR3==null?"null":ADDR3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM25==null?"null":PM25.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PM25_S==null?"null":PM25_S, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IF_SEQ = null; } else {
      this.IF_SEQ = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IF_DTM = null; } else {
      this.IF_DTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITYCODE = null; } else {
      this.CITYCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAT = null; } else {
      this.LAT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LON = null; } else {
      this.LON = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.APLYMDT = null; } else {
      this.APLYMDT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE = null; } else {
      this.SKY_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP = null; } else {
      this.TEMP = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR = null; } else {
      this.WINDDIR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD = null; } else {
      this.WINDSPD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN = null; } else {
      this.RAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY = null; } else {
      this.HUMIDITY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PM10 = null; } else {
      this.PM10 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PM10_S = null; } else {
      this.PM10_S = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE1 = null; } else {
      this.SKY_CODE1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP1 = null; } else {
      this.TEMP1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR1 = null; } else {
      this.WINDDIR1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD1 = null; } else {
      this.WINDSPD1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN1 = null; } else {
      this.RAIN1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY1 = null; } else {
      this.HUMIDITY1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE2 = null; } else {
      this.SKY_CODE2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP2 = null; } else {
      this.TEMP2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR2 = null; } else {
      this.WINDDIR2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD2 = null; } else {
      this.WINDSPD2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN2 = null; } else {
      this.RAIN2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY2 = null; } else {
      this.HUMIDITY2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE3 = null; } else {
      this.SKY_CODE3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP3 = null; } else {
      this.TEMP3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR3 = null; } else {
      this.WINDDIR3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD3 = null; } else {
      this.WINDSPD3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN3 = null; } else {
      this.RAIN3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY3 = null; } else {
      this.HUMIDITY3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE4 = null; } else {
      this.SKY_CODE4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP4 = null; } else {
      this.TEMP4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR4 = null; } else {
      this.WINDDIR4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD4 = null; } else {
      this.WINDSPD4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN4 = null; } else {
      this.RAIN4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY4 = null; } else {
      this.HUMIDITY4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDR1 = null; } else {
      this.ADDR1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDR2 = null; } else {
      this.ADDR2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDR3 = null; } else {
      this.ADDR3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PM25 = null; } else {
      this.PM25 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PM25_S = null; } else {
      this.PM25_S = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IF_SEQ = null; } else {
      this.IF_SEQ = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IF_DTM = null; } else {
      this.IF_DTM = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CITYCODE = null; } else {
      this.CITYCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LAT = null; } else {
      this.LAT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LON = null; } else {
      this.LON = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.APLYMDT = null; } else {
      this.APLYMDT = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE = null; } else {
      this.SKY_CODE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP = null; } else {
      this.TEMP = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR = null; } else {
      this.WINDDIR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD = null; } else {
      this.WINDSPD = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN = null; } else {
      this.RAIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY = null; } else {
      this.HUMIDITY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PM10 = null; } else {
      this.PM10 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PM10_S = null; } else {
      this.PM10_S = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE1 = null; } else {
      this.SKY_CODE1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP1 = null; } else {
      this.TEMP1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR1 = null; } else {
      this.WINDDIR1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD1 = null; } else {
      this.WINDSPD1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN1 = null; } else {
      this.RAIN1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY1 = null; } else {
      this.HUMIDITY1 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE2 = null; } else {
      this.SKY_CODE2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP2 = null; } else {
      this.TEMP2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR2 = null; } else {
      this.WINDDIR2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD2 = null; } else {
      this.WINDSPD2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN2 = null; } else {
      this.RAIN2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY2 = null; } else {
      this.HUMIDITY2 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE3 = null; } else {
      this.SKY_CODE3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP3 = null; } else {
      this.TEMP3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR3 = null; } else {
      this.WINDDIR3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD3 = null; } else {
      this.WINDSPD3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN3 = null; } else {
      this.RAIN3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY3 = null; } else {
      this.HUMIDITY3 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SKY_CODE4 = null; } else {
      this.SKY_CODE4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TEMP4 = null; } else {
      this.TEMP4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WINDDIR4 = null; } else {
      this.WINDDIR4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WINDSPD4 = null; } else {
      this.WINDSPD4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.RAIN4 = null; } else {
      this.RAIN4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HUMIDITY4 = null; } else {
      this.HUMIDITY4 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDR1 = null; } else {
      this.ADDR1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDR2 = null; } else {
      this.ADDR2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDR3 = null; } else {
      this.ADDR3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PM25 = null; } else {
      this.PM25 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PM25_S = null; } else {
      this.PM25_S = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.IF_DTM = (o.IF_DTM != null) ? (java.sql.Timestamp) o.IF_DTM.clone() : null;
    o.APLYMDT = (o.APLYMDT != null) ? (java.sql.Timestamp) o.APLYMDT.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.IF_DTM = (o.IF_DTM != null) ? (java.sql.Timestamp) o.IF_DTM.clone() : null;
    o.APLYMDT = (o.APLYMDT != null) ? (java.sql.Timestamp) o.APLYMDT.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("IF_SEQ", this.IF_SEQ);
    __sqoop$field_map.put("IF_DTM", this.IF_DTM);
    __sqoop$field_map.put("CITYCODE", this.CITYCODE);
    __sqoop$field_map.put("LAT", this.LAT);
    __sqoop$field_map.put("LON", this.LON);
    __sqoop$field_map.put("APLYMDT", this.APLYMDT);
    __sqoop$field_map.put("SKY_CODE", this.SKY_CODE);
    __sqoop$field_map.put("TEMP", this.TEMP);
    __sqoop$field_map.put("WINDDIR", this.WINDDIR);
    __sqoop$field_map.put("WINDSPD", this.WINDSPD);
    __sqoop$field_map.put("RAIN", this.RAIN);
    __sqoop$field_map.put("HUMIDITY", this.HUMIDITY);
    __sqoop$field_map.put("PM10", this.PM10);
    __sqoop$field_map.put("PM10_S", this.PM10_S);
    __sqoop$field_map.put("SKY_CODE1", this.SKY_CODE1);
    __sqoop$field_map.put("TEMP1", this.TEMP1);
    __sqoop$field_map.put("WINDDIR1", this.WINDDIR1);
    __sqoop$field_map.put("WINDSPD1", this.WINDSPD1);
    __sqoop$field_map.put("RAIN1", this.RAIN1);
    __sqoop$field_map.put("HUMIDITY1", this.HUMIDITY1);
    __sqoop$field_map.put("SKY_CODE2", this.SKY_CODE2);
    __sqoop$field_map.put("TEMP2", this.TEMP2);
    __sqoop$field_map.put("WINDDIR2", this.WINDDIR2);
    __sqoop$field_map.put("WINDSPD2", this.WINDSPD2);
    __sqoop$field_map.put("RAIN2", this.RAIN2);
    __sqoop$field_map.put("HUMIDITY2", this.HUMIDITY2);
    __sqoop$field_map.put("SKY_CODE3", this.SKY_CODE3);
    __sqoop$field_map.put("TEMP3", this.TEMP3);
    __sqoop$field_map.put("WINDDIR3", this.WINDDIR3);
    __sqoop$field_map.put("WINDSPD3", this.WINDSPD3);
    __sqoop$field_map.put("RAIN3", this.RAIN3);
    __sqoop$field_map.put("HUMIDITY3", this.HUMIDITY3);
    __sqoop$field_map.put("SKY_CODE4", this.SKY_CODE4);
    __sqoop$field_map.put("TEMP4", this.TEMP4);
    __sqoop$field_map.put("WINDDIR4", this.WINDDIR4);
    __sqoop$field_map.put("WINDSPD4", this.WINDSPD4);
    __sqoop$field_map.put("RAIN4", this.RAIN4);
    __sqoop$field_map.put("HUMIDITY4", this.HUMIDITY4);
    __sqoop$field_map.put("ADDR1", this.ADDR1);
    __sqoop$field_map.put("ADDR2", this.ADDR2);
    __sqoop$field_map.put("ADDR3", this.ADDR3);
    __sqoop$field_map.put("PM25", this.PM25);
    __sqoop$field_map.put("PM25_S", this.PM25_S);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("IF_SEQ", this.IF_SEQ);
    __sqoop$field_map.put("IF_DTM", this.IF_DTM);
    __sqoop$field_map.put("CITYCODE", this.CITYCODE);
    __sqoop$field_map.put("LAT", this.LAT);
    __sqoop$field_map.put("LON", this.LON);
    __sqoop$field_map.put("APLYMDT", this.APLYMDT);
    __sqoop$field_map.put("SKY_CODE", this.SKY_CODE);
    __sqoop$field_map.put("TEMP", this.TEMP);
    __sqoop$field_map.put("WINDDIR", this.WINDDIR);
    __sqoop$field_map.put("WINDSPD", this.WINDSPD);
    __sqoop$field_map.put("RAIN", this.RAIN);
    __sqoop$field_map.put("HUMIDITY", this.HUMIDITY);
    __sqoop$field_map.put("PM10", this.PM10);
    __sqoop$field_map.put("PM10_S", this.PM10_S);
    __sqoop$field_map.put("SKY_CODE1", this.SKY_CODE1);
    __sqoop$field_map.put("TEMP1", this.TEMP1);
    __sqoop$field_map.put("WINDDIR1", this.WINDDIR1);
    __sqoop$field_map.put("WINDSPD1", this.WINDSPD1);
    __sqoop$field_map.put("RAIN1", this.RAIN1);
    __sqoop$field_map.put("HUMIDITY1", this.HUMIDITY1);
    __sqoop$field_map.put("SKY_CODE2", this.SKY_CODE2);
    __sqoop$field_map.put("TEMP2", this.TEMP2);
    __sqoop$field_map.put("WINDDIR2", this.WINDDIR2);
    __sqoop$field_map.put("WINDSPD2", this.WINDSPD2);
    __sqoop$field_map.put("RAIN2", this.RAIN2);
    __sqoop$field_map.put("HUMIDITY2", this.HUMIDITY2);
    __sqoop$field_map.put("SKY_CODE3", this.SKY_CODE3);
    __sqoop$field_map.put("TEMP3", this.TEMP3);
    __sqoop$field_map.put("WINDDIR3", this.WINDDIR3);
    __sqoop$field_map.put("WINDSPD3", this.WINDSPD3);
    __sqoop$field_map.put("RAIN3", this.RAIN3);
    __sqoop$field_map.put("HUMIDITY3", this.HUMIDITY3);
    __sqoop$field_map.put("SKY_CODE4", this.SKY_CODE4);
    __sqoop$field_map.put("TEMP4", this.TEMP4);
    __sqoop$field_map.put("WINDDIR4", this.WINDDIR4);
    __sqoop$field_map.put("WINDSPD4", this.WINDSPD4);
    __sqoop$field_map.put("RAIN4", this.RAIN4);
    __sqoop$field_map.put("HUMIDITY4", this.HUMIDITY4);
    __sqoop$field_map.put("ADDR1", this.ADDR1);
    __sqoop$field_map.put("ADDR2", this.ADDR2);
    __sqoop$field_map.put("ADDR3", this.ADDR3);
    __sqoop$field_map.put("PM25", this.PM25);
    __sqoop$field_map.put("PM25_S", this.PM25_S);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
