<METHOD_START> private void ( ) {}  <METHOD_END>
<METHOD_START> public static java.util.Collection<org.springframework.data.cassandra.convert.Converter<?,?>> < Converter < ? , ? > > java.util.Collection<org.springframework.data.cassandra.convert.Converter<?,?>> ( ) { if ( ! boolean ) { return java.util.Collections . java.util.Set<org.springframework.data.cassandra.convert.Converter<?,?>> ( ) ; } java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> < Converter < ? , ? > > java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> = new java.util.ArrayList<org.springframework.data.cassandra.convert.Converter<?,?>> <> ( ) ; java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> . add ( org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.CassandraLocalDateToLocalDateConverter . org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.CassandraLocalDateToLocalDateConverter ) ; java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> . add ( org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.LocalDateToCassandraLocalDateConverter . org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.LocalDateToCassandraLocalDateConverter ) ; java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> . add ( org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.CassandraLocalDateToDateMidnightConverter . org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.CassandraLocalDateToDateMidnightConverter ) ; java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> . add ( org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.DateMidnightToCassandraLocalDateConverter . org.springframework.data.cassandra.convert.CassandraJodaTimeConverters.DateMidnightToCassandraLocalDateConverter ) ; return java.util.List<org.springframework.data.cassandra.convert.Converter<?,?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.convert.LocalDate org.springframework.data.cassandra.convert.LocalDate ( com . com.datastax . com.datastax . com.datastax . com.datastax com.datastax.driver.core.LocalDate ) { return new LocalDate ( com.datastax.driver.core.LocalDate . getYear ( ) , com.datastax.driver.core.LocalDate . getMonth ( ) , com.datastax.driver.core.LocalDate . getDay ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public com . com.datastax . com.datastax . com.datastax . com.datastax.driver.core.LocalDate com.datastax.driver.core.LocalDate ( LocalDate org.springframework.data.cassandra.convert.LocalDate ) { return com . com.datastax . com.datastax . com.datastax . LocalDate . fromYearMonthDay ( org.springframework.data.cassandra.convert.LocalDate . getYear ( ) , org.springframework.data.cassandra.convert.LocalDate . getMonthOfYear ( ) , org.springframework.data.cassandra.convert.LocalDate . getDayOfMonth ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.convert.DateMidnight org.springframework.data.cassandra.convert.DateMidnight ( com . com.datastax . com.datastax . com.datastax . com.datastax com.datastax.driver.core.LocalDate ) { return new DateMidnight ( com.datastax.driver.core.LocalDate . getYear ( ) , com.datastax.driver.core.LocalDate . getMonth ( ) , com.datastax.driver.core.LocalDate . getDay ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public com . com.datastax . com.datastax . com.datastax . com.datastax.driver.core.LocalDate com.datastax.driver.core.LocalDate ( DateMidnight org.springframework.data.cassandra.convert.DateMidnight ) { return com . com.datastax . com.datastax . com.datastax . LocalDate . fromYearMonthDay ( org.springframework.data.cassandra.convert.DateMidnight . getYear ( ) , org.springframework.data.cassandra.convert.DateMidnight . getMonthOfYear ( ) , org.springframework.data.cassandra.convert.DateMidnight . getDayOfMonth ( ) ) ; }  <METHOD_END>
