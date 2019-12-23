package io.github.iamazy.elasticsearch.dsl.jdbc.cons;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * @author iamazy
 * @date 2019/12/21
 * @descrition
 **/
public interface JdbcConstants {

    int DEFAULT_PORT = 9200;

    String DEFAULT_IP = "localhost";

    String ELASTIC_DRIVER_PREFIX = "jdbc:es:";

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    Pattern USERNAME_PASSWORD_PATTERN = Pattern.compile("://(.*):(.*)@");

    Pattern IP_PORT_PATTERN = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+):?(\\d+)?");
}